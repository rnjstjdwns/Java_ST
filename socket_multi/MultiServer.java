package socket_multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MultiServer {
    public static void main(String[] args) {
        MultiServer multiServer = new MultiServer();
        multiServer.start();
    }

/* 
    예외 처리(exception)
    예외 발생 = 프로그램 애러 (간단하게)
    예외
      프로그램이 돌다가 데이터를 잘못받거나, 다른 데이터 타입의 자료를 사용한다거나 하는 에러
    try에서 예외가 발생 하면 catch로 보냄
    => 예외처리를 하다

    여기서 다른 예외 마다 catch문을 추가하여 예외 처리를 할 수 있다
    finally문은 에러가 발생하거나 안하거나 반드시 실행해야 하는 부분이다
*/

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8000); //서버 소켓 생성
            while(true) {
                System.out.println("[클라이언트 연결대기중]");
                socket = serverSocket.accept(); //클라이언트 접속 대기

                //client가 접속할 때 마다 새로운 스레드 생성
                ReceiveThread receiveThread = new ReceiveThread(socket);
                receiveThread.start();
            }
        } catch (IOException e) { //예외 처리
            e.printStackTrace();
        } finally {
            if (serverSocket!=null) {
                try {
                    serverSocket.close(); //서버 통신 종료
                    System.out.println("[서버종료]");
                } catch (IOException e) { //예외 처리
                    e.printStackTrace();
                    System.out.println("[서버소캣통신에러]");
                }
            }
        }
    }
}


class ReceiveThread extends Thread {
    static List<PrintWriter> list = 
                Collections.synchronizedList(new ArrayList<PrintWriter>());
    Socket socket = null;
    BufferedReader in = null;
    PrintWriter out = null;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
        try {
            out = new PrintWriter(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            list.add(out);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        String name = "";
        try {
            // 최초 1회는 client이름을 수신
            name = in.readLine();
            System.out.println("["+name+" 새연결생성");
            sendAll("["+name+"]님이 들어오셨습니다.");

            while(in != null) {
                String inputMsg = in.readLine();
                if("quit".equals(inputMsg)) break;
                sendAll(name+">>"+inputMsg);
            }
        } catch (IOException e) {
            System.out.println("["+name+" 접속끊김]");
        } finally {
            sendAll("["+name+"]님이 나가셨습니다");
            list.remove(out);
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("["+name+" 연결종료]");
        }
    }

    private void sendAll(String s) {
        for(PrintWriter out: list) {
            out.println(s);
            out.flush();
        }
    }
} 

package socket_oneByone;

import java.io.BufferedReader; //BufferedReader import
import java.io.IOException; //IOException import
import java.io.InputStreamReader; //InputStreamReader import
import java.io.PrintWriter; // PrintWriter import
import java.net.ServerSocket; // ServerSocket import
import java.net.Socket; //Socket import
import java.util.Scanner; //Scanner import

public class MyServer {
	public static void main(String[] args) {
		BufferedReader in = null; //데이터 수신시 필요한 BufferedReader class의 in 인스턴스 생성
        //null을 넣는 이유 : IOException 예외처리는 in==null일때 예외처리를 하기 때문
		PrintWriter out = null; //데이터 출력시 필요한 PrintWriter class의 out 인스턴스 생성
        //null을 넣는 이유 : IOException 예외처리는 in==null일때 예외처리를 하기 때문
		ServerSocket serverSocket = null; //서버 소켓 생성에 필요한 ServerSocket class의 serversocket 인스턴스 생성
        //null을 넣는 이유 : IOException 예외처리는 in==null일때 예외처리를 하기 때문
		Socket socket = null; //클라이언트 접속 대기시 필요한 Socket class의 socket 인스턴스 생성
        //null을 넣는 이유 : IOException 예외처리는 in==null일때 예외처리를 하기 때문
		Scanner scanner = new Scanner(System.in); //입력시 필요한 Scanner class의 scanner 인스턴스 생성
		
		try {
			serverSocket = new ServerSocket(7900); //서버소켓 생성
			
			System.out.println("[Server실행] Client연결대기중...");
			socket = serverSocket.accept(); // 연결대기

			System.out.println("Client 연결됨.");  
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //소켓 입력 스트림
			out = new PrintWriter(socket.getOutputStream());//소켓 출력 스트림(출력 포맷 편리함)
						
			while(true) {
				String inputMessage = in.readLine();	// 수신데이터 한줄씩 수신	
				if ("quit".equalsIgnoreCase(inputMessage)) break; //만약 클라이언트 quit를 받았다면 연결 종료
				
				System.out.println("From Client: " + inputMessage);
				System.out.print("전송하기>>> ");
				
				String outputMessage = scanner.nextLine(); //클라이언트에게 전달할 메세지 받음
				out.println(outputMessage); //메세지 출력
				out.flush();
				if ("quit".equalsIgnoreCase(outputMessage)) break; //만약 메세지가 quit이라면 연결 종료
			}
		} catch (IOException e) { //예외처리
			e.printStackTrace();
		} finally {
			try {
				scanner.close();// Scanner 닫기
				socket.close();	// Socket 닫기
				serverSocket.close();// ServerSocket 닫기
				System.out.println("연결종료");
			} catch (IOException e) {
				System.out.println("소켓통신에러");
			}
		}
	}
}
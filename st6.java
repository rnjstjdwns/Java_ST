class Car{
    boolean powerOn;
    String color;
    int wheel;
    int speed;
    boolean wiperOn;

    void power() {
        powerOn = !powerOn;
    }
    void speedUp() {
        speed++;
    }
    void speedDown() {
        speed--;
    }
    void wiper() {
        wiperOn = !wiperOn;
    }
}

public class st6 {
    public static void main(String[] args) {
        Car bmw =  new Car();
        System.out.println("시동 처음 초기화"+bmw.powerOn);
        System.out.println("차의 색상 초기화"+bmw.color);
        System.out.println("바퀴의 수 초기화"+bmw.wheel);
        System.out.println("속력 초기화"+bmw.speed);
        System.out.println("와이퍼 작동 초기화"+bmw.wiperOn);

        bmw.power();
        System.out.println("시동 메서드 동작"+bmw.powerOn);
        System.out.println();
    }
    
}



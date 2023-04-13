package dongyang_java_soruse;


class Animal {
    String name;
    int age;
    void eat() {
        System.out.println("밥먹기");
        System.out.println("냠냠냠");
    };
}
public class exclass {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Circle pizza;
        
        pizza = new Circle();
        pizza.radius = 3;
        pizza.name = "javapizza";
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은"+area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "Java도넛";
        area =  donut.getArea();
        System.out.println(donut.name+"의 면적은"+area);

    }
}

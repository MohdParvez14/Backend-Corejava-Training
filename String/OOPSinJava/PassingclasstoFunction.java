package OOPSinJava;

public class PassingclasstoFunction {
    public static void fun(Car x){
        System.out.println(x.price);
    }
    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {
        Car c1 = new Car();//declaration of object of student class

        c1.name = "Alto"; //initializing
        c1.type = "Sedan";
        c1.price = 400000;
//        System.out.println(c1.name);
//        System.out.println(c1.type);
//        System.out.println(c1.price);

        fun(c1);
    }
}

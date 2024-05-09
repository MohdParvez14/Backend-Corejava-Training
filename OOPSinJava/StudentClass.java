package OOPSinJava;
public class StudentClass {
    // creating a new data type
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        System.out.println("Mohd Parvez");

        //object initializing
        Student s1 = new Student();//declaration of object of student class

        //storing details in data type using .operator
        s1.name = "Sharashti"; //initializing
        s1.rno = 76;
        s1.percent = 92.5;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent+7.5);

        Student s2 = new Student();
        s2.name = "Dhaneshwari";
        s2.rno = 91;
        s2.percent = 88.3;

        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percent);
    }
}

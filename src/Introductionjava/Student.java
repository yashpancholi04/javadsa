package Introductionjava;

public class Student {

    //instance variable --class ke under or method k bhar
    String name = "Steve";
    int age = 24;
    static String course  = "Java";

    public static void main(String args[]){
        //due to static
        //Static:in static areas only satatic variables will be used,ststic variable can be used in instance or local area
        //if we want to use instance variable inside static block/area we have to use object
        //if we want to access static instance variable in static area then no need to create object also we can call it using classname

        Student s = new Student();
        System.out.println("Name"+s.name);
        System.out.println("age"+s.age);
        System.out.println("course " + course );
        System.out.println("course using classsname " + Student.course);
        System.out.println("course " + s.course );

        s.name = "Ashwani";
        s.course = "DSA";
        System.out.println("NAme " +s.name);
        System.out.println("course " + s.course );

        //agar static ke case me : multiple objects h to in case of static variable hamsha single copy across the object share hogi ::: ek jagah change to sb jagah change
        System.out.println("----------- Ashwini nhi aaya kyuki jb hamne dusra object bnaya tb instance vaiable obj me as it is  use honge--------------------------");
        Student s1 = new Student();
        System.out.println("Name"+s1.name);
        System.out.println("age"+s1.age);
        System.out.println("course " + course );
        System.out.println("course using classsname " + Student.course);
        System.out.println("course " + course );
        s1.name = "Rahul";

        s.display();
        s1.display();
    }

    // ye method static nhi h to hm iss method ko static area mm eaccess nhi kr paayenge isko access krne ke liye object ka use hoga
    public void display(){
        String name = "messi";
        System.out.println("NAME  " +name);
    }
}

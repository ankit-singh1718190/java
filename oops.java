public class oops {
static class Employee{
    int id;
    String name;
}
    public static void main(String[] args) {
        Employee a=new Employee();
        Employee b=new Employee();//Employee Object
        //setting properties
        a.id=22;
        a.name="ankit";
        b.id=22;
        b.name="shvam";
        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println(b.id);
        System.out.println(b.name);
       
    }
}

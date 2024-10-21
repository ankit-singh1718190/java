public class oppsmethod {
static class Employee{
    int id;
    String name;
    public void printdatesles(){
        System.out.println(id);
        System.out.println(name);
    }
}
    public static void main(String[] args) {
        Employee a=new Employee();
        Employee b=new Employee();
        a.id=12;
        a.name="ankit";
        b.id=13;
        b.name="shivam";
        a.printdatesles();
        b.printdatesles();
        
        // System.out.println(a.id);
        // System.out.println(a.name);
    }
}

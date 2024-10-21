class pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing somethings");
    }
}
public class costater {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="bol";

        pen1.write();
        
    }
}

import java.util.*;
public class funcation1 {
    public static void printMYName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String var=sc.next();//var is a variable
        printMYName(var);
        
    }
}

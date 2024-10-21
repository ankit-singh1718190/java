import java.util.Scanner;

//
import javax.swing.plaf.synth.SynthLookAndFeel;

public class input4 {
    public static void printMayName(String name, int number){
        System.out.println(name);
        System.out.println(number);
        return;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your NAme");
        String v=obj.next();
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter your number");
        int v1=obj1.nextInt();
        printMayName(v,v1);
    }
}

import java.util.Scanner;

public class funcaton3 {
    public static int Multiplay(int a,int b){
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the frist number");
        int a=obj.nextInt();
        System.out.println("enter the scond number");
        int b=obj.nextInt();
        int c=Multiplay(a, b);
        System.out.println("multiplay of the 2 number:" +c);
        
    }
}

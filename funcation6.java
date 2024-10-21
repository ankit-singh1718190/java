import java.util.Scanner;

public class funcation6 {
    public static int multiplay(int a,int b){
        // int c=a*b;
        // return c;
        return a*b;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        //int c=multiplay(a,b);
        //System.out.println(c);
        System.out.println(multiplay(a, b));
    }
}

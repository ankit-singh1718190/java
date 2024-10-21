import java.util.Scanner;
public class funcation2 {
    public static int printMayNumber(int a,int b){//return type int
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        // int a=2;
        // int b=4;
        int sum=printMayNumber(a,b);
        System.out.println(sum);
        
    }
}

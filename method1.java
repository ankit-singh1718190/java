import java.util.Scanner;

public class method1 {
    public static int Calulater(int a,int b){
        return a+b;
        //int sum=a+b;
        //return(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the fristnumber");
        int a=sc.nextInt();
        System.out.println("Enter the scond Number");
        int b=sc.nextInt();
        
        System.out.println(Calulater(a,b));
        //int sum=Calulater(a,b);//call method
        //System.out.println(sum);
    }
}

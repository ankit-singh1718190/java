import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (number%2==0){
            System.out.println("number even");
        }else{
            System.out.println("number is odd");
        }

    }
}

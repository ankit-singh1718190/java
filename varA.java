//import javax.swing.plaf.nimbus.State;

public class varA {
    static int sum(int ...arr){
        int result=0;
        for (int a:arr){
            result +=a;
        }
        return result;


    }
    public static void main(String[] args) {
        System.out.println(sum (4,5));
        System.out.println(sum (4,5,6,5,4,4,3,33,2));
       
        
    }
}

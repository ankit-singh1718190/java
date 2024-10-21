public class breakst {
    public static void main(String[] args) {
        // for(int a=0;a<200;a++){
        //     System.out.println(a);
        //     System.out.println("i am pari");
        //     if(a==20){
        //         break;
        //     }
        // }
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue; // Skip the even numbers
            }
            System.out.println("Odd number: " + i);
        }
        
    }
}

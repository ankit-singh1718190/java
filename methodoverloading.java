public class methodoverloading {
    // public int addNumber(String a,String b){
    //     return a+b;
    // }
    public  int addNumber(int a,int b){
        return a+b;
    } 
    public  int addNumber(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        methodoverloading math=new methodoverloading();//object class 
        System.out.println(math.addNumber(3,5));
    }
}

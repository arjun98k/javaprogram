public class Factorial {

     static int Fact(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n*Fact(n-1);
        }

        
    }
    public static void main(String[] args) {
      int a =  Fact(5);
      System.out.println(a);
    }
}

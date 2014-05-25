package app11;
public class App11 {
    public static void main(String[] args) {
        int n;
        n = star(8);
        System.out.println( n + " star number");
    }
    public static int star(int n){
        //印出2*n個星號並回傳
        for (int i = 0; i < 2*n; i++) 
            System.out.print("*");
       System.out.println("\n");
       return 2*n;
    }
}






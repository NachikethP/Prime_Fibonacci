import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
            int a = 0, b = 1, add = 0, count = 1,n_lim;
            boolean flag= true;
            Scanner sc = new Scanner(System.in);
            String str = new String();
            System.out.print("Enter the limit: ");
            n_lim = sc.nextInt();
            System.out.print("fibonacci series:" + " ");
                while (count <= n_lim) {
                    System.out.print(add + " ");
                    count = count + 1;
                    a = b;
                    b = add;
                    add = a + b;
                }
                
            

    }
}

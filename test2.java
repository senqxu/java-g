import java.math.BigInteger;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = sc.nextBigInteger();
            BigInteger sum = a.add(b);
            if (sum.compareTo(c)>0){
                System.out.println("Case #"+i+":true");
            }else {
                System.out.println("Case #"+i+":false");
            }
        }
    }
}

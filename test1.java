import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Random random = new Random();
        int b = random.nextInt(100);

        Scanner scanner =new Scanner(System.in);

        boolean c = true ;
        int i = 0;
        while(c & i<3) {
            System.out.println("请输入数字：");
            int a =scanner.nextInt();
            if (a == b) {
                System.out.println("恭喜你，猜对了");

                c= false;
            } else if (a < b) {
                System.out.println("猜小了");
                i++;
                System.out.println("剩余次数："+(3-i));
            }else{
                System.out.println("猜大了");
                i++;
                System.out.println("剩余次数："+(3-i));
            }
        }




    }
}

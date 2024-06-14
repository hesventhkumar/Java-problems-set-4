import java.util.Scanner;
public class Main {
    public static void main(String[] args) {                      //ODD AN EVEN SEGGREGATION
        Scanner sc = new Scanner(System.in);
        long num,dig,even=0,odd=0,opv=1,epv=1;
        num = sc.nextLong();
        while(num!=0) {                   //123456
            dig = num % 10;               //6=5=4=3=2=1
            if (dig % 2 == 0) {
                even = dig * epv + even;   //6=4=2
                epv = epv * 10;            //10=100
            } else {
                odd = dig * opv + odd;     //5=3=1
                opv = opv * 10;            //10=100
            }
            num = num / 10;                 //12345
        }
        long res =even * opv  +odd;
        System.out.println(res);

    }
}

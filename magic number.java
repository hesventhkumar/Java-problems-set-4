 //  MAGIC NUMBER

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num,safe,sum=0,dig,rev,mul;
        num = sc.nextLong();
        safe=num;
        while(num!=0) {
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        rev=(sum%10)*10+sum/10;
        mul=rev*sum;
        if(mul==safe){
            System.out.println(" magic number");
        }
        else
            System.out.println("Not a magic number");

    }
}

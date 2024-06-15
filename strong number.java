          //   STRONG VALUE


import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,dig,fact=1,sum=0,itr;
        num = sc.nextInt();
         int safe=num;
        while (num != 0) {
            dig = num%10;
            for(fact=1,itr=1;itr<=dig;itr++){
                fact= fact*itr;

            }
            sum=sum+fact;
            num= num/10;
        }

        if(safe== sum){
            System.out.print("STRONG");
        }
        else {
            System.out.print(" NOT STRONG");
        }

    }
}

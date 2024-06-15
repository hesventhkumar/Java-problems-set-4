   // ADAM NUMBER


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num, temp, revnum = 0, revsq = 0, sq = 0;
        num = scanner.nextLong(); //12

        temp = num;//12=
        while (temp != 0) {     //2=1
            revnum = revnum * 10 + temp % 10; //21
            temp /= 10;
        }

        sq = num * num;    //144
        revsq = revnum * revnum;  //441

        temp = revsq;//441
        revsq = 0; //0

        while (temp != 0) {
            revsq = revsq * 10 + temp % 10;  //144
            temp /= 10;
        }

        if (sq == revsq) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }
    }
}

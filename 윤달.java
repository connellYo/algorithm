import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b=0;
        System.out.println("윤년을 입력하시오");
        a=sc.nextInt();

        if(a%4==0&&a%100!=0)b=1;
        else if (a%400==0) b=1;

        System.out.println(b);
    }
}
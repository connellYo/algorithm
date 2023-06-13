import java.util.Scanner;

public class Main {
   public  static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a;
      System.out.println("a입력해주세요");
      a=sc.nextInt();
      for(int i=1;i<10;i++) {
         System.out.println(a+"*"+i+"="+i*a);
      }
   
   }
}
package Algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
		//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("a를 입력해주세요");
		a=sc.nextInt();
		System.out.println("b를 입력해주세요");
		b=sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

	}
}

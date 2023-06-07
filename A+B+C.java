package Algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다. 
		//해당 문제 조건에 의해 int 타입이 아니라 long 타입을 써준다
		long a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("a를 입력해주세요");
		a=sc.nextLong();
		System.out.println("b를 입력해주세요");
		b=sc.nextLong();
		System.out.println("c를 입력해주세요");
		c=sc.nextLong();
		System.out.println(a+b+c);

	}
}

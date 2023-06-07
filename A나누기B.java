package Algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("a를 입력해주세요");
		a=sc.nextInt();
		System.out.println("b를 입력해주세요");
		b=sc.nextInt();
		double c=(double)a/b;
		System.out.println(c);

	}
}

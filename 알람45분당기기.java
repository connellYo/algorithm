package Algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//모든 알림 45분 전으로 맞추기 e.g) 0시 10분 -> 23 35
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("시간를 입력해주세요");
		a=sc.nextInt();
		System.out.println("분을 입력해주세요");
		b=sc.nextInt();
		int c=a*60+b-45;
		int d=c/60;
		int e=c%60;
		if(a!=0)System.out.println(d + " " + e);
		else if(a==0&b<45){
			int k=b+60-45;
			System.out.println(23 + " " + k);
		}else{
			System.out.println(d + " " + e);
		}

		
	}
}

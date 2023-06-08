package Algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String word;
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력해주세요");
		word=sc.next();
		System.out.println("숫자를 입력해주세요");
		number=sc.nextInt();
		//문자열 배열 나누기 split!
		String[] arr=word.split("");
		System.out.println(arr[number-1]);


	}
}

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args ) {
		// 2단 
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);
		
		// 3단 
		System.out.println("");
		System.out.println(3 * 1);
		System.out.println(3 * 2);
		System.out.println(3 * 3);
		System.out.println(3 * 4);
		System.out.println(3 * 5);
		System.out.println(3 * 6);
		System.out.println(3 * 7);
		System.out.println(3 * 8);
		System.out.println(3 * 9);
		
		// 4단
		System.out.println("");
		int result = 4 * 1;
		System.out.println(result);
		result = 4 * 2;
		System.out.println(result);
		result = 4 * 3;
		System.out.println(result);
		result = 4 * 4;
		System.out.println(result);
		result = 4 * 5;
		System.out.println(result);
		result = 4 * 6;
		System.out.println(result);
		result = 4 * 7;
		System.out.println(result);
		result = 4 * 8;
		System.out.println(result);
		result = 4 * 9;
		System.out.println(result);
		
		// 값을 입력받은 후 출력하기
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단을 출력할까요? > ");
		int number = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(number * i);
		}
	}
}

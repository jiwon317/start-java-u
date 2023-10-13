package ch02;

public class VarEx3 {
	public static void main(String[] args) {
		final int score = 200;
//		score = 200;
//		지역변수는 읽기 전 반드시 초기화를 해야한다.
		
		boolean power = true;
		
		byte b = 127; // -128~127
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수 16

		long l = 10_000_000_000L;
		
		float f = 3.14f; // f 생략 불가
		double d = 3.14f; // d 생략 가능
		
		System.out.println(power);
		System.out.println(score);
		System.out.println(oct);
		System.out.println(hex);
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);

	}
}

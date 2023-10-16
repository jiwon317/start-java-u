package ch02;

public class PrintfEx1 {
	public static void main(String[] args) {
		System.out.println(10.0/3); // 정수/정수 = 정수

//		print f  지시자		
		
//		1.  정수를 10진수, 8진수, 16진수로 출력
		System.out.printf("%d%n", 15); //15 10진수
		System.out.printf("%o%n",15); // 17 8진수
		System.out.printf("%x%n",  15); // f 16진수
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111/ 2진수
		// %n or \n 은 계행
		
//		2. 8진수와 16진수에 접두사 붙이기
		System.out.printf("%#o%n", 15); //017 계행
		System.out.printf("%#x%n", 15); // 0xf 계행
		System.out.printf("%#X%n", 15); // 0XF 계행
		
//		3. 실수 출력을 위한 지시자 %f - 지수형식(%e), 간략한 형식 (%g) 
//		%g %f %e 중에 간략한 것 선택
		
		float f = 123.4567890f;
		
		System.out.printf("%f%n", f); // 123.456787 소수점아래 6자리 (정밀도 7자리 뒤에는 정확X)
		System.out.printf("%e%n", f); // 1.234568e+2 지수형식 (10의 제곱) 마지막자리 반올림되서 보여줌 실제로는 반올림 
		System.out.printf("%g%n", 123.456789); // 123.457 간략한 형식 
		System.out.printf("%g%n", 0.00000001); // 1.00000e-8 간략한 형식
		
		
		
	}
}

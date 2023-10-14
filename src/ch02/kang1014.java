package ch02;

public class kang1014 {
	
	public static void makeStar() {
		for(int i = 1; i <= 4; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int integer = 4;
		long veryLong = 8L;
		byte byteMe = 1;
		short veryShort = 2;
		
		
		float effortScore = 5f;
		double shouldStudyPoints = 100d;
		
		char choi = 'T';
		
		String jiwon = "beginner";
		
//		사용자 정의 변수는 4byte.
		
		boolean success = true;
		
//		System.out.println(""+""+"*"+""+"");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
		
		makeStar();
	}
}

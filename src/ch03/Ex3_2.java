package ch03;

public class Ex3_2 {
	public static void main(String args[]) {
		int i=5, j=0;
		
		j = i;
		i++; // 후위형
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
		
		i=5;
		j=0;
		
		++i;
		j = i; // 전위형
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
	}
}

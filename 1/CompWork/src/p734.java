import java.util.Scanner;

public class p734 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double F ;
		double C ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("화씨온도를 입력하십시오 :");
		
		F = input.nextDouble();
		
		C = (double)5/9*(F-32);
		
		System.out.println(C+"는 입력한 화씨온도의 섭씨온도입니다");
		
	}
}
		
		

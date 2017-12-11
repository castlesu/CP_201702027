import java.util.Scanner;

public class p1014 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stubi
		int r;
		int h;
		double pi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오 :");
		r = input.nextInt();
		System.out.print("원기둥높이를입력하시오 :");
		h = input.nextInt();
		
		pi = (double)r*r*h*3.14;
		
		System.out.print("원기둥의 부피는"+pi+"입니다.");
		

	}

}

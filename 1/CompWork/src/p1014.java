import java.util.Scanner;

public class p1014 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stubi
		int r;
		int h;
		double pi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ� :");
		r = input.nextInt();
		System.out.print("����ճ��̸��Է��Ͻÿ� :");
		h = input.nextInt();
		
		pi = (double)r*r*h*3.14;
		
		System.out.print("������� ���Ǵ�"+pi+"�Դϴ�.");
		

	}

}

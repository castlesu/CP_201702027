import java.util.Scanner;

public class p1013 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int cm;
		int f;
		double in;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ�:"); 
		cm = input.nextInt();
		
		in = cm/2.54;
		f = (int)in/12;
		
		System.out.print(cm+"cm�� "+f+"��Ʈ"+in+"��ġ�Դϴ�.");
	
		
		

		
	}

}

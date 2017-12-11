import java.util.Scanner;

public class p1013 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int cm;
		int f;
		double in;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하시오:"); 
		cm = input.nextInt();
		
		in = cm/2.54;
		f = (int)in/12;
		
		System.out.print(cm+"cm는 "+f+"피트"+in+"인치입니다.");
	
		
		

		
	}

}

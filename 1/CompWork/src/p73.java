import java.util.Scanner;

public class p73 {

	public static void main(String[] args) 
	{
		int mile;
		double kilro;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻʽÿ� :");
		mile = input.nextInt();
		kilro = 1.609*mile;
		
		System.out.print(mile+"������");
		System.out.print(kilro+"ų�ι����Դϴ�.");
		
    
	}

}

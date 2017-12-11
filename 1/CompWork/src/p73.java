import java.util.Scanner;

public class p73 {

	public static void main(String[] args) 
	{
		int mile;
		double kilro;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("마일을 입력하십시오 :");
		mile = input.nextInt();
		kilro = 1.609*mile;
		
		System.out.print(mile+"마일은");
		System.out.print(kilro+"킬로미터입니다.");
		
    
	}

}

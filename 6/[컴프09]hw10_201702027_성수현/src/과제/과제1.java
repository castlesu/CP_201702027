package ����;
import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str;
		
		
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		str = input.nextLine();
		
		System.out.println(reverse(str));
		
		

	}

	private static String reverse(String str)
	{ 
		String strTemp = "";
		for(int n =str.length()-1 ;n>=0;n--)
		{
			strTemp = strTemp + str.charAt(n);
		}
		return strTemp;
	}

}

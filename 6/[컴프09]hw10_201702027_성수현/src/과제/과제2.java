package ����;
import java.util.Scanner;
public class ����2 
{
	private String makeId,makePw;
	private String logId,logPw;

	Scanner input = new Scanner(System.in);
	

	public void setAdd()
	{
		System.out.println("<��������>");
		System.out.print("���̵� �Է��ϼ���!: ");
		makeId = input.nextLine();
		System.out.print("�н����带 �Է��ϼ���!: ");
		makePw = input.nextLine();
		System.out.println();
		System.out.println("<�α���>");
		System.out.print("ID: ");
		logId = input.nextLine();
		System.out.print("PW: ");
		logPw = input.nextLine();
		
	}

	public void setCheck()
	{
		if(makeId.equals(logId))
		{
			if(makePw.equals(logPw))
			{
				System.out.println("�α��ο� �����߽��ϴ�.");
			}
			else
			{
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			}
		}
		else 
		{
			System.out.println("���̵� �Ǵ� �н����尡 �߸��ԷµǾ����ϴ�.");
		}
			
	}
}

package 과제;
import java.util.Scanner;
public class 과제2 
{
	private String makeId,makePw;
	private String logId,logPw;

	Scanner input = new Scanner(System.in);
	

	public void setAdd()
	{
		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하세욤!: ");
		makeId = input.nextLine();
		System.out.print("패스워드를 입력하세욤!: ");
		makePw = input.nextLine();
		System.out.println();
		System.out.println("<로그인>");
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
				System.out.println("로그인에 성공했습니다.");
			}
			else
			{
				System.out.println("로그인에 실패하였습니다.");
			}
		}
		else 
		{
			System.out.println("아이디 또는 패스워드가 잘못입력되었습니다.");
		}
			
	}
}

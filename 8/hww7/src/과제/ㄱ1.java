package 과제;
import java.util.Scanner;

public class ㄱ1 {
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int[] cho = new int[10];
      for(int i=0;i<10;i++)
      {
         cho[i]=0;
      }   
      
   while(true) 
   {
      System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
      int ox = scan.nextInt();
      
      if(ox==1)
      {
	      System.out.println("현재의 예약 상태는 다음과 같습니다.");
	      System.out.println("------------------------------");
		  for(int i = 1; i<=10;i++)
	      {
	         System.out.print(i + " ");
	      }
	      System.out.println();
	      System.out.println("------------------------------");
	      for(int i = 0;i<10;i++ )
	      {
	         System.out.print(cho[i]+" ");
	      }
	      System.out.println();
	      System.out.print("몇번쨰 좌석을 예약하시겠습니까?");
	      int seat = scan.nextInt();
	      cho[seat]=1;
	      System.out.println("예약 되었습니다.");
      }
      else 
    	  break;
      }
   }
}

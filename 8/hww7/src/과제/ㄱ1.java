package ����;
import java.util.Scanner;

public class ��1 {
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
      System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
      int ox = scan.nextInt();
      
      if(ox==1)
      {
	      System.out.println("������ ���� ���´� ������ �����ϴ�.");
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
	      System.out.print("����� �¼��� �����Ͻðڽ��ϱ�?");
	      int seat = scan.nextInt();
	      cho[seat]=1;
	      System.out.println("���� �Ǿ����ϴ�.");
      }
      else 
    	  break;
      }
   }
}

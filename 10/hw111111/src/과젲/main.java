package ����;
import java.util.Scanner;

	public class main {
	   
	   private static Shape arrayOfShapes[] = new Shape[3];
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      inputs();
	      areas();
	   }
	   public static void inputs()
	   {
	     int width; 
	     int height;
	     
	     Scanner input = new Scanner(System.in);
	      System.out.println("�ﰢ�� ���� ���ϱ�");
	      System.out.print("������ ���̸� �Է��ϼ��� : ");
	      width = input.nextInt();
	      System.out.print("������ ���̸� �Է��ϼ��� : ");
	      height = input.nextInt();
	      arrayOfShapes[0]=new Triangle(width, height);
	      System.out.println("�簢�� ���� ���ϱ�");
	      System.out.print("������ ���̸� �Է��ϼ��� : ");
	      width = input.nextInt();
	      System.out.print("������ ���̸� �Է��ϼ��� : ");
	      height = input.nextInt();
	      arrayOfShapes[1]=new Rectangle(width, height);
	      System.out.println("�� ���� ���ϱ�");
	      System.out.print("�������� ���̸� �Է��ϼ��� : ");
	      width = input.nextInt();
	      arrayOfShapes[2]=new Circle(width);
	   }
	   
	   public static void areas()
	   {
	      for(int i =0;i<arrayOfShapes.length;i++)
	      {
	         System.out.println(arrayOfShapes[i].area()+"\n");
	      }
	   }

	}

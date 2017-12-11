package 과젲;
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
	      System.out.println("삼각형 길이 구하기");
	      System.out.print("가로의 길이를 입력하세요 : ");
	      width = input.nextInt();
	      System.out.print("세로의 길이를 입력하세요 : ");
	      height = input.nextInt();
	      arrayOfShapes[0]=new Triangle(width, height);
	      System.out.println("사각형 넓이 구하기");
	      System.out.print("가로의 길이를 입력하세요 : ");
	      width = input.nextInt();
	      System.out.print("세로의 길이를 입력하세요 : ");
	      height = input.nextInt();
	      arrayOfShapes[1]=new Rectangle(width, height);
	      System.out.println("원 길이 구하기");
	      System.out.print("반지름의 길이를 입력하세요 : ");
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

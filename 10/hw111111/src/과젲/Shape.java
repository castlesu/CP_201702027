package °ú ¦;

public abstract class Shape {
	   
	   public int width, height;
	   
	   public Shape(int width, int height)
	   {
	      this.width=width;
	      this.height=height;
	   }
	   public abstract int area();

	}

	class Rectangle extends Shape
	{
	   public Rectangle(int width, int height){
	       super(width, height);
	   }
	   public int area()
	   {
	      return (width*height);
	   }
	   
	}

	class Triangle extends Shape
	{  
	    public Triangle(int width, int height){
	        super(width, height);
	    }
	   public int area()
	   {
	      return (int)(0.5*width*height);
	   }
	   
	}

	class Circle extends Shape
	{
	   

	    public Circle(int width){
	       super(width, width);
	    }
	   public int area()
	   {
	      return (int)(Math.PI*width*width);
	   }
	   
	}
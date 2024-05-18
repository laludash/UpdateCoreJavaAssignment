package JavaProgramEx;

class Shape
{
  public void draw()
  {
	 System.out.println("Drawing a shape");
  }
   
  public void erase()
  {
	  System.out.println("Erasing a shape");
  } 
}

class  DrawCircle extends Shape
{
	 @Override
	public void draw()
	  {
		System.out.println("Drawing a circle");
	  }
	 @Override
	  public void erase()
	  {
		  System.out.println("Erasing a circle");
	  } 
}

class Triangle extends Shape 
{
	 @Override
	    public void draw() {
	        System.out.println("Drawing a triangle");
	    }

	    @Override
	    public void erase() {
	        System.out.println("Erasing a triangle");
	    }
}

class Square extends Shape
{
	 @Override
	    public void draw() {
	        System.out.println("Drawing a square");
	    }

	    @Override
	    public void erase() {
	        System.out.println("Erasing a square");
	    }
}


public class JavaQ6 {

	public static void main(String[] args) {
	
		
		Shape circle = new DrawCircle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        circle.draw();
        circle.erase();
        triangle.draw();
        triangle.erase();
         square.draw();
        square.erase();

	}

}

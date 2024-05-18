package JavaProgramEx;

interface  Resizable
{
	void resize(int radius);
}

class Circle implements Resizable
{
	private int radius;

	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	@Override
	public void resize(int radius) {
		this.radius = radius; 
		
	}
	public int getRadius() {
        return radius;
    }
	
}

public class JavaQ5 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		System.out.println("Original radius" + c1.getRadius());
		Circle c2 = new Circle(10);
        System.out.println("Resizable radius " + c2.getRadius());		
	}

}

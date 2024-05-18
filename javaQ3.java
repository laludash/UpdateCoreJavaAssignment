package JavaProgramEx;

public class javaQ3 {

	public static double areaRCT(double length, double width)
	{
		return length*width;	
	}
	
	public static double areaRCT(double radius)
	{
		return Math.PI * Math.pow(radius, 2);
		
	}
	
	public static double areaRCT1(double base, double height)
	{
		return 0.5 * base * height;
	}
	public static void main(String[] args) {
		double length = 5.0;
        double width = 3.0;
        double radius = 4.0;
        double base = 6.0;
        double height = 8.0;
        
        double areaRectangle = areaRCT(length, width);
        		System.out.println("Area of Rectangle: " + areaRectangle);
        double areaCircle = areaRCT(radius);
        System.out.println("Area of Circle: " + areaCircle);
        double areaTriangle  = areaRCT(base,height);
        System.out.println("Area of Triangle: " + areaTriangle);
        
		
		
		

	}

}

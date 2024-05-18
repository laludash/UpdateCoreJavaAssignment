package JavaProgramEx;

public class JavaCode1 {

	public static void main(String[] args) {
	
		//int celcius = 20;
		//convertCtoF(20);
		System.out.println(convertCtoF(20)+"F");
		System.out.println(convertCtoF(30)+"F");
		System.out.println(convertCtoF(40)+"F");
		System.out.println(convertCtoF(50)+"F");
	}

	public static int convertCtoF(int celcius)
	{
		return (celcius  *  9/5) + 32;
	}
	
}

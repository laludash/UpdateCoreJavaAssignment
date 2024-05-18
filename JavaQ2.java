package JavaProgramEx;

public class JavaQ2 {

	public static void main(String[] args) {
	
		
		int[][] m1  = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2  = {{9,8,7},{6,5,4},{9,8,7}};
		int len1 = m1.length;
		int len2 = m1.length;
		int[][] result = new int[len1][len2];
		
		 for (int i = 0; i < len1; i++) {
	            for (int j = 0; j < len2; j++) {
	                result[i][j] = m1[i][j] + m2[i][j];
	            }
	        }
		System.out.println("1st matrix");
		for(int i=0; i<len1; i++)
		{
			for(int j=0;j<len2;j++)
			{
				  System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		
			
		
		
		
		
		

	}

}

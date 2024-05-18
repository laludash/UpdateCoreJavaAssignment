package JavaProgramEx;

import java.util.Scanner;

public class Addtwomatrix {

    public static void main(String[] args) {
        // Check if correct number of arguments is provided
        if (args.length != 2) {
            System.out.println("Usage: java AddTwoMatrix <rows> <columns>");
            return;
        }

        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);

        int[][] m1 = new int[row][col];
        int[][] m2 = new int[row][col];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Input validation for integers
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid integer:");
                    sc.next(); // discard invalid input
                }
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Input validation for integers
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid integer:");
                    sc.next(); // discard invalid input
                }
                m2[i][j] = sc.nextInt();
            }
        }

        // Sum of matrices
        System.out.println("Sum of the matrix:");
        int[][] sumMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMatrix[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // Display sum matrix
        System.out.println("Sum of Matrix Is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

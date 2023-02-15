import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);

		int m, n, i, j, x, mat[][];
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		mat = new int[m][n];
		
		for (i = 0; i < mat.length; i++) {
		    for (j = 0; j < mat[i].length; j++) {
		    	mat[i][j] = sc.nextInt();
		    }
		}
		
		x = sc.nextInt();
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat[i].length; j++) {
			    if (mat[i][j] == x) {
			    	System.out.println("Position " + i + "," + j + ":");
			    	if (j > 0) {
			    		System.out.println("Left: " + mat[i][j - 1]);
			    	}
			    	if (j + 1 < mat[i].length) {
			    		System.out.println("Right: " + mat[i][j + 1]);
			    	}
			    	if (i + 1 < mat.length) {
			    		System.out.println("Down: " + mat[i + 1][j]);
			    	}
			    	if (i - 1 >= 0) {
			    		System.out.println("Up: " + mat[i - 1][j]);
			    	}
			    }
			}
			System.out.println();
		}
    	
    	sc.close();
    }
}

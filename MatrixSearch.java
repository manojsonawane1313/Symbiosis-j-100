package github_assignment2;

public class MatrixSearch {
public static void main(String[] args) {
	int[][] matrix= {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
	};
	
	int target=10;
	boolean found=false;
	
	for (int row=0; row<matrix.length; row++) {
		for(int col=0; col<matrix[row].length; col++) {
			if(matrix[row][col]==target) {
				System.out.println("number "+ target + "found at position; ("+ row +", "+col+")");
			found=true;
			break;
			}
		}
		if (found) break;
	}
	
	if(!found) {
		System.out.println("number "+ target + "not found int the matrix.");
	}

}
}

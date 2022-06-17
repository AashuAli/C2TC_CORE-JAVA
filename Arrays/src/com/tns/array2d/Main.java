package com.tns.array2d;

public class Main {

	public static void main(String[] args) {
		int array[][]= {{42,2,41,},{52,1,40},{67,9,12}};
		shuffle(array);
}//END OF MAIN METHOD
	public static void shuffle(int array[][]) {
		for(int i=0;i<3;i++) {     // to iterate through row
			for(int j=0;j<3;j++) {    // to iterate through column
				System.out.print(array[i][j]+" ");
			}//end of inner for loop
			System.out.println();
		}//end of outer for loop

	}
}

package AssignmentProgram;

public class StringEx {

	public static void main(java.lang.String[] args) {
		/*
		 * String str1="189, CORNER STREET, HIGHWAY ROAD, HYDERABAD"; String
		 * str2="189, HIGHWAY ROAD, CORNER STREET, HYDERABAD";
		 * 
		 * if(str1.equals(str2)) { System.out.println("SAME"); } else {
		 * System.out.println("NOT SAME"); }
		 */
		
		

		/*
		 * // Sorting The Array With Out Using Sort Method
		 * 
		 * int[] arr = new int[] { -5, 6, -7, 3, -1, 3, 9 };
		 * 
		 * // Example Array To sort... for (int i = 0; i < arr.length; i++) { // Loop
		 * over java Array outer Loop use for (int j = i + 1; j < arr.length; j++) { //
		 * Loop over java array int tmp = 0; // tempraory variable in order to compare.
		 * if (arr[i] > arr[j]) { // compare outer loop object with inner loop tmp =
		 * arr[i]; // if greater than swapping. arr[i] = arr[j]; // Swaping code here.
		 * arr[j] = tmp; } } } // After Sorting Printing The Value.............
		 * 
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */

		for(int i=6; i>=1; i-=2)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" " +"*"+" ");
			}
			System.out.println();
		}
		System.out.println(" " +"*");
		
	}

}

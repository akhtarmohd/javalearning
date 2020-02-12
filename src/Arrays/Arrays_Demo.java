package Arrays;

public class Arrays_Demo {

	public static void main(String[] args) {
		
		
		// int a=1,2,3,4,5,6,7,8,;
		
		//arrays: is collection of elements of the same data type
		// 2 types of arrays 
		
		// a- single dimensional
		// b- two/multi dimensional
		
		// Single Dimensional Arrays
		
		// 1- Declare and Array
		// 2- Insert values into arrays
		// 3- Find size of an arrays
		// 4- Read values from an arrays
		
		int a[]=new int[10]; // Declared array with size 5, starting index is 0, last index is 9
		
		// Insert values into arrays
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// Find size of an arrays
		System.out.println("Length of an array : "+a.length); // Print length/size of an arrays
		
		// Read values from an arrays
		System.out.println(a[2]);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}

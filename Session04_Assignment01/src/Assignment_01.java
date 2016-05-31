import java.util.Scanner;

public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//assigning user input to the num variable
		Scanner num = new Scanner(System.in);
		
		//declaring the array
		int[] arr;
		
		//defining the array 
		arr = new int[5];
		
		
		//loop to add user numbers into array elements
		for(int i = 0; i < arr.length; i++){
			
			System.out.println("Please enter numbers for array " + (i + 1));
			arr[i] = num.nextInt();
			
		}

		//printing out the array reversed
	for(int i = arr.length; i > 0;i--){
		
		
			System.out.print(arr[i - 1]+" ");
		
		
	}
		
		
		

	}

}

import java.util.Scanner;  
public class ArrayInputUsingLoop{  
	public static void main(String[] args){  
		int number;  
		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Total number of elements: "); 
			number=obj.nextInt();    

			int[] array = new int[20];  

			System.out.println("Enter the elements of the array: ");
			for(int i=0; i<number; i++){     
			array[i]=obj.nextInt(); //reads elements from the user 
			}  
			
			System.out.println("Array elements you entered are: ");  
			for (int i=0; i<number; i++){  
			System.out.println(array[i]);  
			}
		}  
}  
}

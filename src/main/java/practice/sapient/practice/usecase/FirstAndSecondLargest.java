package practice.sapient.practice.usecase;

public class FirstAndSecondLargest {

	
	public static void main(String[] args) {
		
		int[] input = {2,1,3,4,55,321};
		findFirstAndSecondLargestElement(input);

	}
	
	public static void findFirstAndSecondLargestElement(int[] input){
		int first =1; 
		int second = 0; 
		
		for(int i =0 ; i<input.length ; i++){
			if(first<=input[i]){
				second = first;
				first = input[i];
			}
			else if(input[i]>=second){
				second = input[i];
			}
			System.out.println(first + "--" + second);
		}
		System.out.println("first largest-" + first +"--------------------"+ "second largest-" + second );
	}

}

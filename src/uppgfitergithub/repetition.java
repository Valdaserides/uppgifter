package uppgfitergithub;

public class repetition {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int[] arr = {1,2,3,4,3,2};
		
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
	}
	
}

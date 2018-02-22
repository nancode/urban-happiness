
//goal is to find pair of numbers which give a product


public class multiplicationFactors {
	 
public static void main (String[] args){
	int[] numbers = new int[] {1,2,3,5,6,30,60,40,10,5};
	int product = 30;
	for(int i=0;i<numbers.length-1;i++) {
		for (int j=i+1;j<numbers.length;j++) {
			if(numbers[i]*numbers[j]==product) {
				System.out.println(numbers[i]);
				System.out.println(numbers[j]);
			}
		}
	}
		
}
}

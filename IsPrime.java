public class prime{
	public static void main (String[] args){
		
		//choose a number to check if prime
		int num= 21; 
		int divisor=0;
		boolean isPrime=true;
		//try to divide num by every number from 2 to 
		//one less than itself
		for (int i=2; i<num; i++){
			//if it is evenly divisible then num is not prime
			if (num%i==0){
				isPrime=false;
				divisor=i;
			}
		}
		//if num is prime
		if (isPrime){
			System.out.println(num+" is prime");
		}
		
		else{
			System.out.println(num+" is not prime");
			System.out.println(num+" is divisibl by "+divisor);
		}
	}
	
}
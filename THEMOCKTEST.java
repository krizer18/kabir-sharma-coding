 public class MockMockTest{
	 public static void main (String[] args){
		 IBIO.output("Kabir Sharma");
		 int min = 0;
		 int max = 0;
		 int n = IBIO.inputInt("How many numbers to process: ");
		 double sum = 0;
		 int prime = 0;
		 int t = 0;
		 if (n < 3){
			 IBIO.output("Error occured");
			 System.exit(404);
		 }
		 
		 if (n >= 3){
			 for(int i = 0;i < n; i++){
				 int x = IBIO.inputInt("How many numbers to process:");
				 if(i == 0){
					 max = x;
				 }
				 if( x > max){
					 max = x;
				 }
				 if (i==0){
					 min = x;
				 }
				 if (x < min){
					 min = x;
				 }
				 sum = ( x + sum);
			 }
		 IBIO.output("Max: " + max);
		 IBIO.output("Min: " + min);
		 IBIO.output("Sum: " + (sum/n));
	 }
	 for(int a = 2; a < max; a++){
	 	if( a > max){
			prime = 1;
		 }
		 
		else {
			if( max % a == 0){
				prime = 2;
			}
				else{
					a = (a++);
			}
		}
	}
	if (prime >= 2){
		IBIO.output("the number is not prime");
	}
	else {
		IBIO.output("the number is prime");
	 }
 
 IBIO.output("{fin}");
 }
}
	

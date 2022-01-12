public class Pr2point3{
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("enter a number: ");
		int term;
		
		term = n % 2;
		
		if(term < 1){
			IBIO.output("even");
		} 
		else{
			IBIO.output("odd");
		}
	}
}


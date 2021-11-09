public class practise{
	public static void main (String[] args){
		int x = IBIO.inputInt("what is the number of your base: ");
		int n = IBIO.inputInt(" What is the number of the exponent on the base: ");
		int total = 1;
		if (x == 0){
			IBIO.output(" 0 to the power of " + n + " is 1 ");
			}
		if (x < 0){
			IBIO.output("System error");
			System.exit(404);
			}
		if (x > 0){
			for(int times = 1; times < n; times++){
				total = x * total;
			}
			
		IBIO.out(x + " to the power of " + n + " is ");
		IBIO.output(total);
		IBIO.output("{fin}");
		}
	}
}



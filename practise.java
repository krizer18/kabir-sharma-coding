public class practise{
	public static void main (String[] args){
		int x = IBIO.inputInt("what is the number you want to multiply: ");
		int n = IBIO.inputInt(" By how many times do you want to mulitply this number: ");
		int total = 1;
		if (x < 1){
			IBIO.output("System error");
			System.exit(404);
		}
		if (x > 1){
			for(int times = 0; times < n; times++){
				total = x * total;
			}
			
		IBIO.out(x + " to the power of " + n + " is ");
		IBIO.output(total);
		IBIO.output("{fin}");
		}
	}
}

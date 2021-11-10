public class whilepractisetest{
	public static void main(String args[]){
		IBIO.output("Kabir Sharma");
		long amount;
	do{
		long first = 0;
		long second = 1;
		long total = 0;
		double atotal = 1;
		do {
		amount = IBIO.inputInt("calculate number upto (n): ");
		if( amount < 0){
			IBIO.output("Error-input enter a positive number");
							}	
			}while(amount < 0 );
	if(amount == 0){
	System.exit(404);
		}
		
	if(amount == 1){
	IBIO.out("0; 1; ");
	IBIO.output("average = 0.5");
	}
	
	if(amount > 1 && amount <= 20){
		IBIO.out("0; 1; ");
		for(int i = 2; i <= amount;  i++){
			total =	first + second;
			IBIO.out(total +"; ");
			first = second;
			second = total;
			atotal = atotal + total;
		}
		IBIO.output("\n");
		IBIO.out("Average = " + (atotal/(amount+1)));
		IBIO.output("\n");
	}
	if(amount > 20){
		for(int i = 2; i <= amount;  i++){
			total =	(first + second);
			first = second;
			second = total;
			atotal = atotal + total;
		}
		IBIO.output( "Term " + amount + ": " + total);
		IBIO.output("Average = " + (atotal/(amount+1)));
}
	
  }while(amount != 0);
}

}

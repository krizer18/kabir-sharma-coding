public class FactorialFinal{
	public static void main (String[] args){
		IBIO.output("Kabir Sharma");
		`
		int n = IBIO.inputInt("Enter an integer between 1 and 20: ");
		long total = 1;
		String factor;
		int count = 0;
		
		if(n < 0){
			IBIO.output("Error-number out of range");
			n = IBIO.inputInt("Enter an integer between 1 and 20:");
			main(null);
		}
			
		if(n > 20){
            IBIO.output("Error-number out of range");
            n = IBIO.inputInt("Enter an integer between 1 and 20:");
            main(null);
        }
       
        if (n >= 0 && n <= 20){
			for(int times = 1; times <= n; times++){
				total = total * times;
			}
		}
	
		if(n <= 10){
			IBIO.out( n + "! = ");
				for(int i = n; i > 1; i--){
					IBIO.out(i + " x ");
			}
		
			IBIO.out("1 = " + total);
			
		}
		else{
			IBIO.out( n + "! = " + total);
		}
		for(count = 0; total > 0; total = total/10)
        {
			count = count + 1;
		}
		        IBIO.output(" digits: " + count);
		
	}
}

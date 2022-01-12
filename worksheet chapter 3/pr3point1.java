public class pr3point1{
	public static void main(String args[]){
		int x;
		do{
			x = IBIO.inputInt(" Enter a positive number that is less than 100 and is even: ");
			} while(x > 0 && x < 100 && x % 2 != 0);
		IBIO.output("The number " + x + " fits the conditions");
		
	}
}

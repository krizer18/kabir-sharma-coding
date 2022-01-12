
public class Pr4point1{
	public static void main (String[] args){
		int num1 = IBIO.inputInt("Enter a number: ");
		int num2 = IBIO.inputInt("Enter another number: ");
		int ans;
		int m; 
		do{
			IBIO.output("Press: 1 for addition");
			IBIO.output("       2 for multiplication");
			IBIO.output("       3 to quit");
			
			m = IBIO.inputInt(": ");
			
			switch (m){
				case 1:
					ans = num1 + num2;
					IBIO.output(ans);
					break;
				case 2:
					ans = num1 * num2;
					IBIO.output(ans);
					break;
				case 3:
					break;
				default:
					IBIO.output("Error - Number should be 1, 2 or 3");
			}
		} while (m != 3);
	}
}

 

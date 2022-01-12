public class Pr1point2 {
	
	public static void main (String[] args) {
		int step = IBIO.inputInt("Enter the amount of steps: ");
		int start = IBIO.inputInt("Enter the starting number: ");
		int i = IBIO.inputInt("Enter the increment: ");
		
		int fin = start + (step-1)*(i);
		
		for(int num=start; num<=fin; num = num+i)
		{
			IBIO.output(num);
		}
	}
}



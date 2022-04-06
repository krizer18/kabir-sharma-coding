public class Pr6point2{
	public static void main(String args[]){
		int repeat = IBIO.inputInt(" how many times do you wanna repeat it: ");
		String star = lines(repeat);
		for( int i = 0; i < repeat; i++)
			IBIO.output(lines(repeat) + star);
	}
	
	static String lines(int n){
		String space = "" ;
		for(int i = 0; i < n; i++){
			space = space + " * " ;
		}
		return space;
	}
}


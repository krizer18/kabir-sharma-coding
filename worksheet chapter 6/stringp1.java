public class stringp1{
	public static void main(String args[]){
		int repeat = IBIO.inputInt("How many time do you want to repeat: ");
		String baam = word(repeat);
		for( int i = 0; i < repeat; i ++){
		IBIO.output(baam);
		}
	}
	
	static String word(int lol ){
		String line = IBIO.inputString("what do you want to repeat:  ");
		String space = " ";
		for( int i = 0; i < lol; i++){
			space = line + " " + space;
		}
		return space;
	}
}

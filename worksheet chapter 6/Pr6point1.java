public class Pr6point1{
	public static void main(String args[]){
		int num = IBIO.inputInt(" Enter the number of lines: ");
		String aa = stars(6);
		for( int i = 0; i < 3; i++){
			IBIO.output(aa);
		}
		
		
	}
	
	static String stars(int num){
		String space = "";
		for( int i = 0; i < num; i ++){
			space = space + "    *";
		}
		return space;
	}
}

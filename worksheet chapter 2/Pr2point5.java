public class Pr2point5{
	
	public static void main (String[] args) {
		int m = 1;
		
		for (int i = 1; i <= 100; i++){
			m = i % 2;
			
			if(m > 0){
				IBIO.out(i + " ");
			}
		}	
	}
}



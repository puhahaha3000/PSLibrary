
public class Pow {
	
	public static int pow(int A, int B){
		int remain = 1; 
		int multiply = A;
		
		while(B > 0){
			if(B % 2 == 1){
				remain *= multiply;
			}
			multiply = multiply * multiply;
			B /= 2;
		}
		return remain;
	}
	
	public static int pow(int A, int B, int C){
		int remain = 1; 
		int multiply = A % C;
		
		while(B > 0){
			if(B % 2 == 1){
				remain *= multiply;
				remain %= C;
			}
			multiply = ((multiply % C) * (multiply % C)) % C;
			B /= 2;
		}
		return remain;
	}
}

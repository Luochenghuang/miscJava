public class exponentialCalc {
    public static void main(String[] args){
    	System.out.print("Base");
    	int base = TextIO.getInt();
    	System.out.print("exponent");
    	int exponent = TextIO.getInt();
    	System.out.print("how many s-f do you want");
        int a = TextIO.getInt();
        
        int E = 0;
        int[] A = new int[a];
        A[A.length-1] = base;
        
        for (int n = 0; n < exponent - 1; n++){
        	
	        for (int i = a-1; i >= 0; i--){
	        	A[i] *= base;
	        }
	        for (int i = a-1; i >= 1; i--){
	        	A[i] %= 10;
	        	A[i-1] /= 10;
	        }
        }
        for (int i = 0; i < a; i++){
        	System.out.print(A[i]);
        }
    	if (E != 0){
    		System.out.print("E"+E);
    	}
    }
}

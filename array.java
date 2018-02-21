
public class array {
    public static void main(String[] args){
    	int[] A = new int[9];
    	for(int i = 0; i < A.length; i++){
    		A[i]=i;
    	}
        for(int i = 0; i < A.length; i++){
        	System.out.print(A[i]+" ");
        }
    	int d = (int)Math.log10(34)+1;
    	System.out.println();
    	System.out.println(d);
    }
}

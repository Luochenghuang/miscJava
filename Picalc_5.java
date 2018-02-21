public class Picalc_5 {
    public static void main(String[] args){
        System.out.println("How many digits of Pi do you want to calculate? (>4)");
        int n = TextIO.getInt()/4;
        int j = (int)((Math.floor(10*((double)n)/3))*4+1);
        int[] A = new int[j];
        int[] Pi = new int[n];
        int q;
        int r;
        long time = System.nanoTime();
        for(int i = 0; i <j; i++ ){ 
            A[i] = 2000;
        }//initialization of the array A
        for(int i2 = 0; i2 < n; i2++){       //repeat for n times
          for(int i = 0; i <j; i++ ){
              A[i] *= 10000; 
          }
          for(int i = j ; i > 1; i-- ){
              q = A[i-1]/(2*i - 1);
              r = A[i-1]%(2*i - 1);
           A[i-1] = r;
           A[i-2] += q*(i - 1);
          }
          Pi[i2] = A[0]/10000;
          A[0] %= 10000;
        }
          for(int i = Pi.length-1; i >= 1; i--){
        	  if(Pi[i] >=  10000){
        		  Pi[i] %= 10000;
        		  Pi[i-1] += Pi[i]/10000;
        	  }
          }
          int group = 0;
    	  time = System.nanoTime()-time;
    	  double seconds = (double)time/(1000000000.0);
    	  
    	  System.out.println("the calculation took "+seconds+" seconds");
          System.out.println();
    	  
          for(int i = 0; i < Pi.length; i++){
        	  if (group == 20){
                  System.out.println();
                  System.out.println();
                  group = 0;
        	  }
              print2(Pi[i]);
              group++;
          }
          System.out.println();
          System.out.println();
    }
    private static void print2(int digits){
    	int d = (int)Math.log10(digits) + 1;
    	int zeros = 4-d;
    	for(int i = 0; i < zeros; i++){
    		System.out.print("0");
    	}
		System.out.print(digits+" ");
    }
}
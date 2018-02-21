public class Picalc_3 {
    public static void main(String[] args){
        System.out.println("How many digits of Pi do you want to calculate?");
        int n = TextIO.getInt();
        int j = (int)(Math.floor(10*((double)n)/3)+1);
        int[] A = new int[j];
        int[] Pi = new int[n];
        int q;
        int r;
        long time = System.nanoTime();
        for(int i = 0; i <j; i++ ){ 
            A[i] = 2;
        }//initialization of the array A
        for(int i2 = 0; i2 < n; i2++){       //repeat for n times
          for(int i = 0; i <j; i++ ){
              A[i] *= 10; 
          }
          for(int i = j ; i > 1; i-- ){
              q = A[i-1]/(2*i - 1);
              r = A[i-1]%(2*i - 1);
           A[i-1] = r;
           A[i-2] += q*(i - 1);
          }
          Pi[i2] = A[0]/10;
          A[0] %= 10;
        }
          for(int i = Pi.length-1; i >= 1; i--){
        	  if(Pi[i] >=  10){
        		  Pi[i] %= 10;
        		  Pi[i-1] += 1;
        	  }
          }
          int group = 0;
          int line = 0;
    	  time = System.nanoTime()-time;
    	  double seconds = (double)time/(1000000000.0);
    	  System.out.println("the calculation took "+seconds+" seconds");
          System.out.println();
          for(int i = 0; i < Pi.length; i++){
        	  if (group == 4){
                  System.out.print(" ");
                  group = 0;
                  line++;
        	  }
        	  if (line == 20){
                  System.out.println();
                  System.out.println();
                  line = 0;
        	  }
              System.out.print(Pi[i]);
              group++;
          }
          System.out.println();
          System.out.println();
    }
}
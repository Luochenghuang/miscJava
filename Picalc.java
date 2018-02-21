public class Picalc {
	//static int group = 0;
	//static int predigits[] = new int[10];
    /*private static void release(){
    	for(int i = 0; predigits[i] != -1; i++){
            System.out.print(predigits[i]);
            predigits[i] = -1;
        	if (group == 4){
        		System.out.print(" ");
        		group = 0;
        		}
         	group++;}
    	}
    public static void load(int q){
    	int i = 0;
    	while(predigits[i]!=-1){
    		i++;
    	}
    	predigits[i] = q;
    }*/
    public static void main(String[] args){
        //System.out.println("How many digits of Pi do you want to calculate?");
        //int n = TextIO.getInt();
        /*for(int i:predigits){ 
            predigits[i] = -1;
        }*/
    	long time = System.nanoTime();
    	int n = 5000;
        int j = (int)(Math.floor(10*((double)n)/3)+1);
        int[] A = new int[j];
        int[] Pi = new int[n];
        int q;
        int r;
        for(int i = 0; i <j; i++ ){ 
            A[i] = 2;
        }                                    //initialization of the array A
        
        
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
          /*for(int i = 0; i < A.length; i++){
              System.out.print(A[i]+" ");
          }
          System.out.println();*/
          
          //Pi[i2] = A[0]/10;
          /*
          if (A[0]/10!=9||A[0]/10!=10){
        	  release();
        	  load(A[0]/10);
          }
          else if(A[0]/10 == 9){
        	  load(9);
          }
          else if(A[0]/10 == 10){
        	  predigits[0] += 1;
        	  for(int i = 0; predigits[i]!= -1;i++){
        		  predigits[i]=0;
        		  release();
        	  }
          }*/
          Pi[i2] = A[0]/10;
          A[0] %= 10;
        }
          for(int i = Pi.length-1; i >= 1; i--){
        	  if(Pi[i] >=  10){
        		  Pi[i] %= 10;
        		  Pi[i-1] += 1;
        	  }
          }
          time = System.nanoTime() - time;
          double t = (double)(time/1000000000.0);
          System.out.println(t);
          int group = 0;
          int line = 0;
          for(int i = 0; i < Pi.length; i++){
        	  if (group == 5){
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
    }
}
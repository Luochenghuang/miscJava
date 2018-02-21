
public class godenRatio {
	public static int guess;
	public static int distance; // from the middle point of the range to the guess point
	public static int midPoint;
	public static final double R = 0.6180339887;
    public static void main(String[] args){
    	int guessCount = 1;
    	num N = new num();
    	for(int i = 0; i <= 10; i++){
        	N.newPoint(1000);
        	guess = (int)(R*(N.range()));
        	midPoint = N.mid();
        	distance = guess - midPoint;
            while (guess != N.value){
            	if(guess > N.value){
            		N.upperLim = guess;
            	}
            	else if(guess < N.value){
            		N.lowerLim = guess;
            	}
            	guessCount++;
            }
    	}
    	System.out.print(guessCount++);
    }
}

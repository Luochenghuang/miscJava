public class Combinations {

    // print all subsets that take k of the remaining elements, with given prefix 
    public static void generate(String prefix, String elements, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < elements.length(); i++)
            generate(prefix + elements.charAt(i), elements.substring(i + 1), k - 1);
    }  

    // read in N and k from command line, and print all subsets of size k from N elements
    public static void main(String[] args) {
       int N = 20;
       int k = 12;
       String elements = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       generate("", elements.substring(0, N), k);
    }

}
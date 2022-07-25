package albert;

public class ReverseString {

    public static String reverseString(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=""+str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println("reverseString(\"Hello World\") = " + reverseString("Hello World"));
    }
}

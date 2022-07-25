package albert;

public class ReverseString {

    public static String reverseString1(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=""+str.charAt(i);
        }

        return reverse;
    }

    public static String reverseString2(String str){
        StringBuilder test = new StringBuilder(str);//Convert string to stringBuilder
        test=test.reverse();//reverse stringBuilder
        String reverse = test.toString();//Convert stringbuilder to string
        return reverse;//return string result
    }

    public static void main(String[] args) {
        //System.out.println("reverseString1(\"Hello World\") = " + reverseString1("Hello World"));
        System.out.println("reverseString2(\"Hello World\") = " + reverseString2("Hello World"));
    }
}

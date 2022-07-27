package albert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

    public static String reverseString1(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=""+str.charAt(i);
        }

        return reverse;
    }

    public static String reverseString2(String str){

        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;

    }

    public static String reverseString3(String str){
        List<Character> arrList=new ArrayList<>();
        for (char each: str.toCharArray()) {
            arrList.add(each);
        }
        Collections.reverse(arrList);
        String res="";
        for (int i = 0; i < arrList.size(); i++) {
            res+=""+arrList.get(i);
        }
        return res;
    }

    public static String reverseString4(String str){
        List<Character> arrList=new ArrayList<>();
        for (char each: str.toCharArray()) {
            arrList.add(each);
        }
        Collections.reverse(arrList);
        String reverse=arrList.stream().map(String::valueOf).collect(Collectors.joining());
        return reverse;
    }

    public static void main(String[] args) {
        //System.out.println("reverseString1(\"Hello World\") = " + reverseString1("Hello World"));
        //System.out.println("reverseString2(\"Hello World\") = " + reverseString2("Hello World"));
        //System.out.println("reverseString3(\"Hello World\") = " + reverseString3("Hello World"));
        System.out.println("reverseString4(\"Hello World\") = " + reverseString4("Hello World"));
    }
}

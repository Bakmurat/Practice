package albert;

public class Palindrome {
    public static boolean palindrome1(String str){
        int head=0;
        int tail=str.length()-1;
        while (tail>head){
            if(str.charAt(head)!=str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
    public static boolean palindrome2(String str){
        String reverse=new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println("palindrome1(\"racecar\") = " + palindrome1("racecar"));
        System.out.println("palindrome1(\"Hello\") = " + palindrome1("Hello"));

        System.out.println("palindrome2(\"racecar\") = " + palindrome2("racecar"));
        System.out.println("palindrome2(\"Hello\") = " + palindrome2("Hello"));
    }
}

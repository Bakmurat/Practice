package albert;

public class ReverseNumber {
    public static long reverse(long in){
        long res=0;
        while(in>0){
            res+=in%10;
            in=in/10;
            res=res*10;
        }
        res=res/10;
        return res;
    }

    public static void main(String[] args) {
        int in = 123456789;
        System.out.println("reverse(123456789) = " + reverse(123456789));
    }
}

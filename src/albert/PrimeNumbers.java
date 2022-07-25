package albert;

public class PrimeNumbers {

    public static boolean primeNumber(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("primeNumber(5) = " + primeNumber(5));
        System.out.println("primeNumber(18) = " + primeNumber(18));
    }
}

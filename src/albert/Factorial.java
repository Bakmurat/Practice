package albert;

public class Factorial {
    public static void main(String[] args) {
        int number=4;
        int sum=1;
        for(int i=1; i<=number; i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}

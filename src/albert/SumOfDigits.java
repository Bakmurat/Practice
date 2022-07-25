package albert;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1995;
        int sum=0;
        while (number>0){
            sum+=number%10;
            number=number/10;
        }
        System.out.println(sum);
    }
}

package albert;

public class Armstrong {
    public static void main(String[] args) {
        int digit;
        int temp;
        int sum=0;
        int number = 1634;
        temp = number;
        int pow=String.valueOf(number).length();
        while(temp >0){
            digit = temp %10;
            sum = sum + (int)Math.pow((double)digit, (double) pow);
            temp = temp /10;
        }
        if(number==sum)
           System.out.println(number + " is an armstrong number");
        }
}

package albert;

public class DivideNumberWithoutDivision {

public static void DivideNumber ( int number, int divident){
    int count = 0;
    int remainder = 0;

    while(number >= divident){
        number = number - divident;
        count++;
        remainder = number;
    }

    System.out.println(remainder+ " "+  count);


}


    public static void main(String[] args) {

    DivideNumber(15, 5);

    }

}

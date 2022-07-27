package albert;

public class StairsNumbers {

    public static void Stairs (int number){

        for (int i = 0; i <= number; i++) {

            for (int j = 0; j <= i ; j++) {

                System.out.print(j);
            }
            System.out.println();
        }

    }




    public static void main(String[] args) {

        Stairs(5);

    }
}

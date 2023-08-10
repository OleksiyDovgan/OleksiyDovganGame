import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 3; i++) {

        int youNumber = 10;

        int rdm = random.nextInt(11);

        if(youNumber==rdm){

            System.out.println(youNumber + " You Win");

            break;

        }
            System.out.println(rdm + " bad luck this time");


        }

    }

}

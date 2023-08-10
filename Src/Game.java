import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Random random = new Random();


        for (int i = 0; i < 3; i++) {

        int youNumber = 1;

        int rdm = random.nextInt(10)+1;

        if(youNumber==rdm){
            System.out.println(youNumber + " You Win");
            break;

        }
            System.out.println(rdm + " bad luck this time");


        }



      //  System.out.println(rdm);
    }
}

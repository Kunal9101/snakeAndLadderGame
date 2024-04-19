import java.util.*;

public class snakeAndLadderGame {
    public static void main(String[] args) {
        //importing random
        Random rand = new Random();

        System.out.println("Welcome to snake and ladder game...");

        //creating players
        int first_player = 0;

        //creating ladder 
        int []ladder = {2,7,22,28,30,44,54,70,80,87};
        int []add_point = {21,22,20,49,2,14,15,20,3,6};

        //creating snake
        int []snake = {27,35,39,50,59,66,73,76,89,97,99};
        int []del_point ={20,30,36,16,15,42,61,13,22,11,73};

        int dice ;
        int dice_roll = 0;
        boolean bool = false;


        //checking one to start the game
        do {
            dice = rand.nextInt(1,7);
            System.out.println("User get "+ dice);
            dice_roll++;
            if (dice == 1){
                System.out.println("\n\nGame Started");
                first_player = first_player + 1;
                System.out.println("First User at "+first_player);
                bool = true;
            }
        } while (bool == false);

        //creating game 
        while(first_player < 100){
            //creating dice
            dice = rand.nextInt(1,7);
            System.out.println("User get " + dice);
            dice_roll++;

            first_player = first_player + dice;

            //adding condition for perfect 100

            if (first_player == 100 ){
                System.out.println("\n ***Game over***");
                System.out.println("!!!  First User Won te game  !!!");
                System.out.println("Dice roll "+ dice_roll +" times");
                break;
            }

            if (first_player > 100){
                first_player = first_player - dice;
            }

            System.out.println("First user is at "+ first_player);
            for (int i = 0 ; i < ladder.length ; i++){
                if (ladder[i] == first_player){
                    System.out.println("\nLadder");
                    first_player = first_player + add_point[i];
                    System.out.println("After ladder First User is on "+ first_player);
                    break;
                }
            }  
            for (int j = 0; j < snake.length ; j++){
                if (snake[j] == first_player){
                    System.out.println("\nSnake");
                    first_player = first_player - del_point[j];
                    System.out.println("After snake first user is on "+ first_player);
                    break;
                }
            } 
        }
    }
}
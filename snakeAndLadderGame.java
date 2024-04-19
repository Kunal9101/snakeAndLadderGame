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

        //creating game 
        while(first_player <= 100){
            //creating dice
            int dice = rand.nextInt(1,7);
            System.out.println("User get " + dice);
            first_player = first_player + dice;
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


package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
        Move playerMove;
        Move cpMove;
	
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
		
        int playerScore;
        int cpScore;
	int roundsToWin = 2;
        int random;
        boolean loopController = true;
        
        while(loopController) {
            playerScore = 0;
            cpScore = 0;
            loopController = true;
            System.out.println("\nWelcome to Rock, Paper, Scissors. Please choose an option:\n1. Start game\n2. Change number of rounds\n3. Exit application");
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch(input) {
                case 1:
                    while(loopController) {
                        loopController = true;
                        System.out.println("\nThis match will be first to 2 wins.\nThe computer has selected its move. Select your move:\n1. Rock\n2. Paper\n3. Scissors");
                        System.out.print("> ");
                        input = sc.nextInt();
                        
                        switch(input) {
                            case 1:
                                playerMove = rock;
                                break;
                            case 2:
                                playerMove = paper;
                                break;
                            case 3:
                                playerMove = scissors;
                                break;
                            default:
                                System.out.println("Invalid Move!");
                                continue;
                        }
                        
                        random = (int) Math.floor(Math.random()*3) + 1;
                        switch(random) {
                            case 1:
                                cpMove = rock;
                                break;
                            case 2:
                                cpMove = paper;
                                break;
                            //only possible values for int random are 1, 2, or 3. This way, cpMove will always be initialized
                            default:
                                cpMove = scissors;
                                break;
                        }
                        
                        System.out.print("Player chose " + playerMove.getName() + ". Computer chose " + cpMove.getName() + ". ");
                        
                        switch(Move.compareMoves(playerMove, cpMove)) {
                            case 0:
                                playerScore = playerScore + 1;
                                System.out.println("Player wins round!");
                                break;
                            case 1:
                                cpScore = cpScore + 1;
                                System.out.println("Computer wins round!");
                                break;
                            default:
                                System.out.println("Round is tied!");
                                break;
                        }
                        
                        System.out.println(playerScore + " - " + cpScore);
                        
                        if(playerScore == roundsToWin) {
                            System.out.println("\nPlayer wins!");
                            loopController = false;
                        } else if (cpScore == roundsToWin) {
                            System.out.println("\nComputer wins!");
                            loopController = false;
                        }
                    }
                    loopController = true;
                    break;
                case 2:
                    System.out.println("\nHow many wins are needed to win a match?");
                    System.out.print("> ");
                    input = sc.nextInt();
                    roundsToWin = input;
                    System.out.println("\nNew setting has been saved!");
                    break;
                case 3:
                    System.out.println("\nThank you for playing!");
                    loopController = false;
                    break;
                default:
                    System.out.println("Error: Invalid Input");
            }
        }
    }
}
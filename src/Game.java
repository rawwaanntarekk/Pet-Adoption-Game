import java.util.Scanner;

public class Game {

    Player player;

    public Game(){
        player = new Player();
    }

    public  void showMenu(){
        System.out.println("1. Adopt a pet");
        System.out.println("2. Feed pet");
        System.out.println("3. Play with pet");
        System.out.println("4. Check pet status");
        System.out.println("5. End game");
    }

    public void ChooseOption(){

        Scanner scanner = new Scanner(System.in);
        int option;

       do {
           System.out.print("Please choose an option:");
           option = scanner.nextInt();
       } while (option < 1 || option > 5);

        switch(option){
            case 1:
                player.adoptPet();
                break;
            case 2:
                player.feedPet();
                break;
            case 3:
                player.playWithPet();
                break;
            case 4:
                player.checkPetStatus();
                break;
            case 5:
                player.endGame();
                break;
        }

    }

    public  void StartGame(){
        showMenu();
        ChooseOption();

    }


}

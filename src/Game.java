import java.util.Scanner;

public class Game {

    Player player;

    public Game() {
        player = new Player();
    }

    private void showMenu() {
        System.out.println("1. Adopt a pet");
        System.out.println("2. Feed pet");
        System.out.println("3. Play with pet");
        System.out.println("4. Check pet status");
        System.out.println("5. End game");
    }

    private void ChooseOption() {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMenu();
            System.out.print("Choose an option from [1 to 5]: ");
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }
            switch (option) {
                case 1 -> player.adoptPet();
                case 2 -> player.feedPet();
                case 3 -> player.playWithPet();
                case 4 -> player.CheckPetStatus();
                case 5 -> player.endGame();
            }

            System.out.println();

        } while (true);


    }

    public void StartGame() {
        ChooseOption();

    }


}

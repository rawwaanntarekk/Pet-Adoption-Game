import java.util.Scanner;

import static java.lang.System.exit;

public class Player {

    private Pet pet;

    private String EnterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a name for your pet: ");
        return scanner.nextLine();
    }


    public void adoptPet() {
        String name = EnterName();
        pet = new Pet(name);
        System.out.println(pet.getName() + " has been adopted.");
    }

    public void feedPet() {
        try {
            if (pet == null)
                throw new Exception("You must adopt a pet first.");

            if(pet.getHungerLevel() >= 90){
                System.out.println(pet.getName() + " is already full. You can feed it later.");
                return;
            }

            pet.IncreaseHungerLevel();
            pet.DecreaseHappinessLevel();

            System.out.println(pet.getName() + " has been fed.");
            CheckEndGame();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public void playWithPet() {
        try {
            if (pet == null)
                throw new Exception("You must adopt a pet first.");

            if(pet.getHappinessLevel() >= 90){
                System.out.println(pet.getName() + " is already happy. You can play with it later.");
                return;
            }

            pet.IncreaseHappinessLevel();
            pet.DecreaseHungerLevel();

            System.out.println(pet.getName() + " played and is happier now.");
            CheckEndGame();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void CheckPetStatus() {
        try {
            if (pet == null)
                throw new Exception("You must adopt a pet first.");
            System.out.println(pet);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void CheckEndGame() {
        if(pet != null){
            if (pet.getHungerLevel() <= 0 || pet.getHappinessLevel() <= 0)
            {
                System.out.println("Game Over. Your pet's condition has reached a critical level.");
                System.out.println(pet.toString());
                exit(0);
            }
        }



    }

}

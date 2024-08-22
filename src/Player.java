import java.util.Scanner;

import static java.lang.System.exit;

public class Player {

    Pet pet;

    private String EnterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a name for your pet: ");
        return scanner.nextLine();
    }


    public void adoptPet() {
        String name = EnterName();
        pet = new Pet(name);
        System.out.println(pet.Name + " has been adopted.");
    }

    public void feedPet() {
        try {
            if (pet == null)
                throw new Exception("You must adopt a pet first.");

            if(pet.HungerLevel >= 90){
                System.out.println(pet.Name + " is already full. You can feed it later.");
                return;
            }

            pet.IncreaseHungerLevel();
            pet.DecreaseHappinessLevel();

            System.out.println(pet.Name + " has been fed.");
            CheckEndGame();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public void playWithPet() {
        try {
            if (pet == null)
                throw new Exception("You must adopt a pet first.");

            if(pet.HappinessLevel >= 90){
                System.out.println(pet.Name + " is already happy. You can play with it later.");
                return;
            }

            pet.IncreaseHappinessLevel();
            pet.DecreaseHungerLevel();

            System.out.println(pet.Name + " played and is happier now.");
            CheckEndGame();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void CheckEndGame() {
        try {
            if (pet == null)
                throw new Exception("You must adopt a pet first.");
            if (pet.HungerLevel >= 100 || pet.HappinessLevel <= 0)
                endGame();
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

    public void endGame() {
        if(pet != null){
            if (pet.HungerLevel <= 0 || pet.HappinessLevel <= 0)
            {
                System.out.println("Game Over. Your pet's condition has reached a critical level.");
                System.out.println(pet.toString());
            }
        }
        exit(0);


        exit(0);
    }

}

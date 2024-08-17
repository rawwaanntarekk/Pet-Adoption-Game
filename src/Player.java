public class Player {

    Pet pet;


    public void adoptPet(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void feedPet(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void playWithPet(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void checkPetStatus(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endGame(){
        System.out.println("Game Over. Your pet's condition has reached a critical level.");
        System.out.println(pet.toString());
    }

}

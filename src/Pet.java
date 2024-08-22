public class Pet {
    private final String Name;

    private int HungerLevel;

    private int HappinessLevel;

    public String getName() {
        return Name;
    }

    public int getHungerLevel() {
        return HungerLevel;
    }


    public int getHappinessLevel() {
        return HappinessLevel;
    }



    public Pet(String name) {
        Name = name;
        HungerLevel = 50;
        HappinessLevel = 50;
    }

    @Override
    public String toString() {
        return Name + "'s hunger level is " + HungerLevel + "\n"
                + Name + "'s happiness level is " + HappinessLevel + ".";
    }

    public void IncreaseHungerLevel() {
        HungerLevel += 10;
    }

    public void IncreaseHappinessLevel() {
        HappinessLevel += 10;
    }

    public void DecreaseHungerLevel() {
        HungerLevel -= 20;
    }

    public void DecreaseHappinessLevel() {
        HappinessLevel -= 10;
    }

}

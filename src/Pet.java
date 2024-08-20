public class Pet {
    String Name;
    int HungerLevel;

    int HappinessLevel;

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

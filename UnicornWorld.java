// Unicorn class definition
class Unicorn {
    private String name;
    private String color;
    private int magicPower; // Magic power level (0-100)

    // Constructor
    public Unicorn(String name, String color, int magicPower) {
        this.name = name;
        this.color = color;
        this.magicPower = magicPower;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower >= 0 && magicPower <= 100) {
            this.magicPower = magicPower;
        } else {
            System.out.println("Magic power must be between 0 and 100.");
        }
    }

    // A method for the unicorn to use its magic
    public void useMagic() {
        if (magicPower > 0) {
            System.out.println(name + " the " + color + " unicorn is using magic! ✨");
            magicPower -= 10; // Decrease magic power by 10 each time
        } else {
            System.out.println(name + " is out of magic!");
        }
    }

    // A method for the unicorn to recharge its magic
    public void rechargeMagic() {
        magicPower = 100;
        System.out.println(name + " has recharged its magic power to full!");
    }

    // toString method for a nice display of the unicorn's state
    @Override
    public String toString() {
        return "Unicorn{name='" + name + "', color='" + color + "', magicPower=" + magicPower + "}";
    }
}

// Main class to run the code
public class UnicornWorld {
    public static void main(String[] args) {
        // Creating a unicorn
        Unicorn twilight = new Unicorn("Twilight", "purple", 80);

        // Displaying the unicorn's details
        System.out.println(twilight);

        // Using magic
        twilight.useMagic();
        twilight.useMagic();

        // Recharge the unicorn's magic
        twilight.rechargeMagic();

        // Display the final state of the unicorn
        System.out.println(twilight);
    }
}

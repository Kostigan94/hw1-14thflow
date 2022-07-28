package guru;

public class Airplane {
    private String brand;
    private int age;
    private boolean serviceable;
    private int flying;

    public Airplane(String brand, int age, boolean serviceable, int flying) {
        this.brand = brand;
        this.age = age;
        this.serviceable = serviceable;
        this.flying = flying;
    }

    public void toFly() {
        if (serviceable) {
            System.out.println("Flying towards the Sun");
        } else {
            System.out.println("Looking for dispersal field");
        }
    }

    public void toCheckState() {
        if (age <= 1 & flying < 750) {
            System.out.println("There should be no breakdowns, we fly further");
        } else if (age > 2) {
            System.out.println("Time for a scheduled check");
        } else if (age > 5 && flying > 5000) {
            System.out.println("Major check required");
        }
    }

}
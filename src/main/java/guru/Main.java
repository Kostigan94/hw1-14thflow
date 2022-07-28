package guru;

public class Main {
    public static void main(String[] args) {
        Airplane A319 = new Airplane("Airbus", 3, false, 500);
        Airplane A380 = new Airplane("Airbus", 11, true, 9760);

    A319.toFly();
    A319.toCheckState();

    A380.toFly();
    A380.toCheckState();
    }
}

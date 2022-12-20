package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int powerNumber = 0;
        powerNumber = numberToPrint;
        for (int powerBy = 1; powerBy < power; powerBy++) {

            powerNumber = powerNumber * numberToPrint;

        }
        System.out.println(powerNumber);

    }

    public static void main(String[] args) {
        new Power().printPower(-10, 3);
    }
}

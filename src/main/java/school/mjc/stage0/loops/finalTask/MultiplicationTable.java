package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int multiplyBy = 1; multiplyBy <= 10; multiplyBy++) {
            int multiplyNumber = numberTableToPrint * multiplyBy;
            System.out.println(multiplyBy + " x " + numberTableToPrint + " = " + multiplyNumber);
        }
    }
}

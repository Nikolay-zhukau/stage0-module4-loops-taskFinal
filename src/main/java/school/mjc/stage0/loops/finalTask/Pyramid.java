package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int row = 0; row < cathetusLength; row++) {
            int numberOfPrintedNumbers = row + 1;
            int spaceCount = cathetusLength - numberOfPrintedNumbers;
            for (int printSpace = 0; printSpace < spaceCount; printSpace++) {
                System.out.print(" ");
            }
            for (int col = 0; col < numberOfPrintedNumbers * 2 + 1; col++) {
                int printedNumbers = numberOfPrintedNumbers - col;
                if (printedNumbers == 0 || printedNumbers == -1) {
                    continue;
                }
                if (printedNumbers < 0) {
                    printedNumbers = printedNumbers * -1;
                }
                System.out.print(printedNumbers);
            }


            System.out.println();

        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}

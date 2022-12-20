package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int row = 0; row < cathetusLength; row++) {
            int printedNumber = row + 1;
            int spaceCount = cathetusLength - printedNumber;
            for (int spaceIn = 0; spaceIn < spaceCount; spaceIn++) {
                System.out.print(" ");
            }
            for (int col = 0; col < printedNumber * 2 + 1; col++) {
                int numByCol = printedNumber - col;
                if (numByCol == 0 || numByCol == -1) {
                    continue;
                }
                if (numByCol < 0) {
                    numByCol = numByCol * -1;
                }
                System.out.print(numByCol);
            }
            for (int spaceIn = 0; spaceIn < spaceCount; spaceIn++) {
                System.out.print(" ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

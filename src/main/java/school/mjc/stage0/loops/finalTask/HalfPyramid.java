package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int row = 0; row < cathetusLength; row++) {
            int star = row + 1;
            int spaceCount = cathetusLength - star;
            for (int spaceIn = 0; spaceIn < spaceCount; spaceIn++) {
                System.out.print(" ");
            }
            for (int col = 0; col < star; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

import java.util.Random;

public class Driver {

    public static void drawBorder(int rows, int cols) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                Text.go(r, c);
                if (r == 1 || r == rows || c == 1 || c == cols) {
                    if ((r + c) % 2 == 0) {
                        Text.color(Text.BRIGHT, Text.WHITE, Text.background(Text.BLUE));
                    } else {
                        Text.color(Text.BRIGHT, Text.WHITE, Text.background(Text.GREEN));
                    }
                    System.out.print("-");
                }
            }
        }
    }

    public static void displayNumbers(int cols) {
        Random rand = new Random();
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = rand.nextInt(100);
        }

        int numSpacing = cols / 4;
        int[] positions = {numSpacing, 2 * numSpacing, 3 * numSpacing};

        for (int i = 0; i < 3; i++) {
            int value = numbers[i];
            Text.go(2, positions[i]);
            if (value < 25) {
                Text.color(Text.BRIGHT, Text.RED, Text.background(Text.BLACK)); // Bright red for <25
            } else if (value > 75) {
                Text.color(Text.BRIGHT, Text.GREEN, Text.background(Text.BLACK)); // Bright green for >75
            } else {
                Text.color(Text.WHITE, Text.background(Text.BLACK)); // Default white
            }
            System.out.print(value);
        }
    }

    public static void drawSeparator(int cols) {
        Text.go(3, 1);
        for (int c = 1; c <= cols; c++) {
            if (c == 1 || c == cols) {
                Text.color(Text.BRIGHT, Text.MAGENTA, Text.background(Text.BLACK));
            } else {
                Text.color(Text.BRIGHT, Text.CYAN, Text.background(Text.BLACK));
            }
            System.out.print("-");
        }
    }

    public static void displayCenteredText(int rows, int cols, String text) {
        Text.go(rows / 2, cols / 2 - text.length() / 2);
        Text.color(Text.BRIGHT, Text.YELLOW, Text.background(Text.BLUE));
        System.out.print(text);
    }
}


/**
 */
public class Example1
{
    
    public static void printSquare(int n) {
        for (int j = 0; j < n; j++) {
            printRow(n);
        }
    }
    
    public static void printRectangle(int height, int width) {
        for (int j = 0; j < height; j++) {
            printRow(width);
        }
    }
    
    public static void printTriangle(int height) {
        for (int j = 0; j < height; j++) {
            printRow(j + 1);
        }
    }
    
    public static void printRow(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("X");
        }
        System.out.print("\n");
    }
    
    public static void printPyramid(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                System.out.print(" ");
            }
            printRow(2 * j + 1);
        }
    }
    
    
}

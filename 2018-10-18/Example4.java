
/**
 * For loops!
 */
public class Example4
{
    public static void main() {
        printNTimes("This is not a test.", 10);
    }
    
    // prints something n times    
    public static void printNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}

public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            // Add more sophisticated error handling as needed (e.g., logging, alternative calculations)
        }
    }
}
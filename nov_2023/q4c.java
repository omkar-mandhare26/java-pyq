package nov_2023;
// Create a package named Series having series:
// i) Fibonacci series
// ii) Cube of numbers
// iii) Square of numbers
// g three different classes to print
// Write a java program to enerate 'n' terms of the above series
import nov_2023.Series.Fibonacci;
import nov_2023.Series.Cube;
import nov_2023.Series.Square;

public class q4c {
    public static void main(String[] args) {
        int n =7;

        System.out.println("Fibonacci Series:");
        Fibonacci fib = new Fibonacci();
        fib.generate(n);

        System.out.println("Cube of Numbers:");
        Cube cube = new Cube();
        cube.generate(n);

        System.out.println("Square of Numbers:");
        Square square = new Square();
        square.generate(n);
    }

}

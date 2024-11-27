package nov_2023.Series;

public class Fibonacci {
    public void generate(int n) {
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}

package nov_2023.Series;

public class Cube {
    public void generate(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}

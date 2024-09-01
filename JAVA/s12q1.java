package series;

public class s12q1 {
    public static void printSquareSeries(int n) {
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; // example value
        printSquareSeries(n);
    }
}
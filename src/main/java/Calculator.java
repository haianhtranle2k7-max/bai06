public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return a / b;
    }
}
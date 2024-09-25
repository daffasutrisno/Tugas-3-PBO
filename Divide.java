public class Divide {
    public double operate(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol.");
        }
        return a / b;
    }
}

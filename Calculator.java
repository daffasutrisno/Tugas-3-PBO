import java.util.Scanner;

public class Calculator {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Meminta input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double a = scanner.nextDouble();

        // Meminta input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.next();

        // Meminta input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double b = scanner.nextDouble();

        // Menghitung hasil
        try {
            double result = calculate(a, b, operator);
            System.out.println("Hasil: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public double calculate(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return new Add().operate(a, b);
            case "-":
                return new Subtract().operate(a, b);
            case "*":
                return new Multiply().operate(a, b);
            case "/":
                return new Divide().operate(a, b);
            default:
                throw new IllegalArgumentException("Operator tidak valid: " + operator);
        }
    }

    // Tambahkan metode main agar bisa dieksekusi langsung
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start(); // Memulai proses input dan kalkulasi
    }
}

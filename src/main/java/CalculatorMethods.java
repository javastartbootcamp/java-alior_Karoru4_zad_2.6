public class CalculatorMethods {

    void isEven(int even) {
        boolean isEven = (even % 2) == 0;
        System.out.println("Czy ta liczba " + even + " jest parzysta? " + isEven);
    }

    void isOdd(int odd) {
        boolean isOdd = (odd % 2) != 0;
        System.out.println("Czy liczba " + odd + " jest nieparzysta? " + isOdd);
    }

    void circleFiled(double r) {
        double filed = (Math.PI * r * r);
        System.out.println("Pole koła o promieniu " + r + " wynosi: " + filed + " jednostek kwadratowych");
    }

    void power(int p) {
        double pow = (Math.pow(p, 2));
        System.out.println(p + " do kwadratu wynosi: " + pow);
    }
}


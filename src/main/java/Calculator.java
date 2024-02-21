public class Calculator implements Icalculator{
    @Override
    public int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    @Override
    public int substraction(int a, int b) {
        int substraction = a - b;
        return substraction;
    }

    @Override
    public int multiplication(int a, int b) {
        int multiplication = a*b;
        return multiplication;
    }

    @Override
    public int division(int a, int b) {
        int division = a / b;
        return division;
    }
}

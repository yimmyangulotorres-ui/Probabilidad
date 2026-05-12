public class Main {

    public static void main(String[] args) {

        PositiveNumberAdder adder = new PositiveNumberAdder();
        MessagePrinter printer = new MessagePrinter();

        int result = adder.addPositiveNumbers(5, 10);

        printer.printMessage("Resultado: " + result);
    }
}

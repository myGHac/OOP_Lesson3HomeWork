package additional_task;

public class ColorPrinter extends Printer {

    @Override
    public void print(String value) {

        System.out.println((char) 27 + "[35m" + value);
    }

}

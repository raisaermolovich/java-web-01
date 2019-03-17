package by.epam.javatraining.yermalovich.task01.view;

public class ConsolePrinter implements Printable {

    @Override
    public void print(Object message) {
        System.out.println(message);
    }
}

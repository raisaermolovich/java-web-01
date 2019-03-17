package by.epam.javatraining.yermalovich.task01.view;

import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectOutputPathInFilePrinter;

import java.io.FileOutputStream;
import java.io.IOException;


public class FilePrinter implements Printable{

    private String outputPath;

    public FilePrinter(String outputPath) {
        this.outputPath = outputPath;
    }

    @Override
    public void print(Object message) {
        try {
            try {
                FileOutputStream stream = new FileOutputStream(outputPath);
                byte[] bytes = message.toString().getBytes();
                stream.write(bytes);
                stream.flush();
                stream.close();
            } catch (IOException e) {
                throw new IncorrectOutputPathInFilePrinter(e);
            }
        } catch (IncorrectOutputPathInFilePrinter e) {
            System.out.println(e);
            LogPrinter.LOGGER.error(e);
        }
    }
}

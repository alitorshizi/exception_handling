package ir.torshizi.exception_handling.exception_handling.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileNotFoundException extends MainException {
    public FileNotFoundException(String fileName) {
        super(generateMessage(fileName));
    }

    private static String generateMessage(String fileName) {
        return String.format("The file '%s' could not be found!", fileName);
    }

}

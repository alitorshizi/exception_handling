package ir.torshizi.exception_handling.exception_handling.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileStorageException extends MainException {

    public FileStorageException() {
        super(generateMessage());
    }

    private static String generateMessage() {
        return "Can not access to file storage device!";
    }
}

package ir.torshizi.exception_handling.exception_handling.exceptions;
import org.springframework.util.StringUtils;

import java.util.Map;

public class EntityNotFoundException extends MainException {

    public EntityNotFoundException(Class<?> clazz, String... searchParamsMap) {
        super(generateMessage(getClassName(clazz), toMap(String.class, String.class, searchParamsMap)));
    }

    private static String generateMessage(String entity, Map<String, String> searchParams) {
        return StringUtils.capitalize(entity) +
                " was not found for parameters " +
                searchParams;
    }

}

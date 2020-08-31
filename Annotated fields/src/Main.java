import java.lang.reflect.*;
import java.util.ArrayList;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        var annotatedFields = new ArrayList<String>();
        for (Field fl : object.getClass().getDeclaredFields()) {
            if (fl.getDeclaredAnnotations().length > 0) {
                annotatedFields.add(fl.getName());
            }
        }
        return annotatedFields.toArray(String[]::new);
    }

}
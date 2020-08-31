import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        var publicMethods = new ArrayList<String>();
        for (Field fl : object.getClass().getDeclaredFields()) {
            int modifiers = fl.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                publicMethods.add(fl.getName());
            }
        }
        return publicMethods.toArray(String[]::new);
    }

}
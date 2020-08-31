import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        var privateMethods = new ArrayList<String>();
        for (Field fl : object.getClass().getDeclaredFields()) {
            int modifiers = fl.getModifiers();
            if (Modifier.isPrivate(modifiers)) {
                privateMethods.add(fl.getName());
            }
        }
        Collections.sort(privateMethods);
        return privateMethods;
    }

}
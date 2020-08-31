import java.lang.reflect.Field;
/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */
class FieldGetter {

    public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        try {
            return object.getClass().getField(fieldName).get(object);
        } catch (Exception ignored) {
            return null;
        }
    }

}
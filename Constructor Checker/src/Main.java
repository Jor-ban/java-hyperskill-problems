import java.lang.reflect.Constructor;


class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            Class[] params = constructor.getParameterTypes();
            if (params.length == 0) {
                return true;
            }
        }
        return false;
    }
}
import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String clsName : classNames) {
            for(Method mth : Class.forName(clsName).getMethods()) {
                if (methodName.equals(mth.getName())) {
                    return clsName;
                }
            }
        }
        return null;
    }
}
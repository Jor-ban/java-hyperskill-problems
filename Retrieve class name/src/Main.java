/**
 Get name of the class for the object provided.
 */
class ClassGetter {

    public String getObjectClassName(Object object) {
        return object.getClass().getName();
    }

}
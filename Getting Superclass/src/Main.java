class SuperClassGetter {

    public Class getSuperClassByName(String name) throws ClassNotFoundException {
        return Class.forName(name).getSuperclass();
    }

    public Class getSuperClassByInstance(Object object) {
        return object.getClass().getSuperclass();
    }
}
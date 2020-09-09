class Box<T extends Animal> {
    T animal;
    public void add(T animal) {
        this.animal = animal;
    }
}

// Don't change the code below
class Animal {}

class CakeBox {

    private Cake cake;

    public void put(Cake cake) {
    	this.cake = cake;
    }
    public Cake get() {
        return this.cake;
    }
}

/**
    Box for pies
*/
class PieBox {

    private Pie pie;

    public void put(Pie pie) {
    	this.pie = pie;
    }
    public Pie get() {
        return this.pie;
    }
}


/**
    Box for tarts
*/
class TartBox {

    private Tart tart;

    public void put(Tart tart) {
    	this.tart = tart;
    }
    public Tart get() {
        return this.tart;
    }
}

class Box<T> {
    T t;

    public void put(T obj) {
        this.t = obj;
    }
    public T get() {
        return this.t;
    }
}

// Don't change classes below
class Cake { }

class Pie { }

class Tart { }
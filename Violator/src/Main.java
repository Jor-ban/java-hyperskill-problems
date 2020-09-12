import java.util.List;
/**
 * Class to work with
 */

class Violator {

    public static List<Box<? extends Bakery>> defraud() {
        var list = new ArrayList<Box<? extends Bakery>>();
        var paperBox = new Box();
        paperBox.put(new Paper());
        list.set(0, paperBox);
        return list;
    }

}
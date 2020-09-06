class Sum {
    public static int sumOfAreas(Shape[] array) {
        int sum = 0;
        for (Shape shp : array) {
            if (shp.getClass() == Square.class) {
                int side = ((Square) shp).getSide();
                sum += side * side;
            } else if (shp.getClass() == Rectangle.class) {
                sum += ((Rectangle) shp).getHeight() * ((Rectangle) shp).getWidth();
            }
        }
        return sum;
    }
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
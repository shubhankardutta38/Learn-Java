abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }

}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing c circle");
    }
}

class TestAbstraction {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        Circle c = new Circle();
        c.draw();
        Shape s1 = new Rectangle();
        s1.draw();
        Shape s2 = new Circle();
        s2.draw();
    }
}

package Interface.eg4;

interface Drawable {
    public void draw(); // single prototype
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}

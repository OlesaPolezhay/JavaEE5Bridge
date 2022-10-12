public class BridgePatternDemo {
    public static void main(String[] args) {

        Shape redCircle = new Circle(5, 3, 12, new RedPen());
        redCircle.draw();

        Shape greenCircle = new Circle(4, 3, 10, new GreenPen());
        greenCircle.draw();
    }
}

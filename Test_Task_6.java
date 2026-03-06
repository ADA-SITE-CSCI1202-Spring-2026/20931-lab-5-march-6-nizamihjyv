public class Test_Task_6 {

    public static void main(String[] args) {

        Point p = new Point(2,3);
        Circle c = new Circle(new Point(5,5), 10);

        p.moveUp();
        p.moveRight();

        c.moveLeft();
        c.moveDown();

        p.display();
    }
}
public class Test_Task_6 {

    public static void main(String[] args) {

        // create a point
        Point p = new Point(2, 3);
        System.out.print("Point: ");
        p.display();

        // move the point
        p.moveUp();
        p.moveRight();

        System.out.print("Point after moving: ");
        p.display();

        // create a circle
        Circle c = new Circle(new Point(5, 5), 10);
        System.out.println("Circle center before moving:");
        c.center.display();

        // move the circle
        c.moveLeft();
        c.moveDown();

        System.out.println("Circle center after moving:");
        c.center.display();
    }
}
public class Test_Task_6 {

    public static void main(String[] args) {

        Point p = new Point(2, 3);
        System.out.print("Point: ");
        p.display();

        p.moveUp();
        p.moveRight();

        System.out.print("Point after moving: ");
        p.display();

        Circle c = new Circle(new Point(5, 5), 10);
        System.out.println("Circle center before moving:");
        c.center.display();

        c.moveLeft();
        c.moveDown();

        System.out.println("Circle center after moving:");
        c.center.display();
    }
}
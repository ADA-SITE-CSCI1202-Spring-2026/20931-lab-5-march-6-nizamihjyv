public class Rectangle_Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(15,10);
        Rectangle r3 = new Rectangle(5,10);

        System.out.println(r1.equals(r2)); // false because different
        System.out.println(r1.equals(r3)); // true because same!
    }
}

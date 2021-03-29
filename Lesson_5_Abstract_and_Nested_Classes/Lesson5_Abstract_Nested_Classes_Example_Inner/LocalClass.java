
package Lesson5_Abstract_Nested_Classes_Example_Inner;


class OuterClass4 {

    public void print() {
        final String s = "test: ";

        class Point {

            private int x;
            private int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return s + "(" + x + "," + y + ")";
            }
        };
        System.out.println(new Point(1, 2));
    } // method print
} // class OC

public class LocalClass {

    public static void main(String[] args) {
        new OuterClass4().print();
    }
}

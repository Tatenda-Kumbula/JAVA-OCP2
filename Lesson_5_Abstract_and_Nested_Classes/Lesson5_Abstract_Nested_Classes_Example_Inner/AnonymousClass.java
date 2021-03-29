
package Lesson5_Abstract_Nested_Classes_Example_Inner;


public class AnonymousClass {

    public static void main(String[] args) {
        new OClass().print();
    }
}

class OClass {

    public void print() {
        final String s = "test: ";
//Anonymous class begins here
        System.out.println(new Object() {
            private int x = 1;
            private int y = 2;
            public String toString() {
                return s + "(" + x + "," + y + ")";
            }
        });
//Anonymous class ends here
    }
}

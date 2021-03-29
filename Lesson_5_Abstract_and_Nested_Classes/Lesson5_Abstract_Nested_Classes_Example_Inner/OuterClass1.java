
package Lesson5_Abstract_Nested_Classes_Example_Inner;

public class OuterClass1 {

    int outerVariable = 100;

    class MemberClass {

        int innerVariable = 20;

        int getSum(int parameter) {
            return innerVariable + outerVariable + parameter;
        }
    }

    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        MemberClass inner = outer.new MemberClass();
        System.out.println(inner.getSum(3));
        outer.run();
    }

    void run() {
        MemberClass localInner = new MemberClass();
        System.out.println(localInner.getSum(5));
    }
}

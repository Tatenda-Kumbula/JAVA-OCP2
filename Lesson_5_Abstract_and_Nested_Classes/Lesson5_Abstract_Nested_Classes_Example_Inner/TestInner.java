
package Lesson5_Abstract_Nested_Classes_Example_Inner;

public class TestInner {

    public static void main(String args[]) {
        //create instance of outer class first:
        OuterClass outClass = new OuterClass();

         //create instance of inner class:
        OuterClass.InnerClass inner = outClass.new InnerClass();

        inner.accessOuter();
    }

}

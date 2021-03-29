
package Lesson5_Abstract_Nested_Classes_Immutable;


public class HelloWorldAnonymousClasses {

    interface CompStringLength {

        public void computeLength(String str);
    }

    static CompStringLength strlength = new CompStringLength() {

        @Override
        public void computeLength(String str) {

            int strlen = str.length();

            System.out.println("length of a string " + strlen);
        }
    };

    public static void main(String args[]) {
        strlength.computeLength("helloworld");
    }

}

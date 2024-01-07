package extends1.access.parent;

import extends1.access.child.Child;
import org.w3c.dom.ls.LSOutput;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }

}

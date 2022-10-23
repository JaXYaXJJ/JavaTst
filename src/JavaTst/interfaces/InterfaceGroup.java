package JavaTst.interfaces;

public class InterfaceGroup {

    interface InterfaceOne {
        void methodOne();
    }

    interface InterfaceTwo extends InterfaceOne {
        void methodTwo();
    }
}

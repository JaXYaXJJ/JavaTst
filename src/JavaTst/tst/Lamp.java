package JavaTst.tst;

public class Lamp {

        String color;
        int vat;
        boolean isOn; //default false

        public void turnLightOn() {
            this.isOn = true;
        }

        public  void turnLightOff() {
            isOn = false;
        }

        public boolean isLightOn() {
            return isOn;
        }

        public void printLightStauts() {

            System.out.println(isOn ? "Light is on!" : "Light is off!");
        }
}

//public class JavaTst.tst.Main {
//    public static void main(String[] args) {
//
//        JavaTst.tst.Lamp led = new JavaTst.tst.Lamp();
//        JavaTst.tst.Lamp halogen = new JavaTst.tst.Lamp();
//
//        led.color = "White";
//        halogen.color = "Yellow";
//
//        led.turnLightOn();
//
//        led.printLightStauts();
//        halogen.printLightStauts();
//
//    }
//}

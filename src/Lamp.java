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

//public class Main {
//    public static void main(String[] args) {
//
//        Lamp led = new Lamp();
//        Lamp halogen = new Lamp();
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

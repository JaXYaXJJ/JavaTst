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

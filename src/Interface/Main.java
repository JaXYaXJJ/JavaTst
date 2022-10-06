package Interface;

public class Main {
    public static void main(String[] args) {

        Camera galaxy = new Smartphone();
        GPS iphone = new Smartphone();
        Smartphone xiaomi = new Smartphone();

        xiaomi.getCoordinates();
        xiaomi.startCamera();
        xiaomi.stopCamera();
        galaxy.takePhoto();
        iphone.getCoordinates();
        xiaomi.takePhoto();
    }
}

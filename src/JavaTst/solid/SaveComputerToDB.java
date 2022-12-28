package JavaTst.solid;

public class SaveComputerToDB implements ISaveInterface {

    public void save(String path, Computer cmp) {
        System.out.println("Save to DB" + path + ", " + cmp);
    }
}

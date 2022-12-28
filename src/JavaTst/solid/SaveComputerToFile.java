package JavaTst.solid;

public class SaveComputerToFile implements ISaveInterface {

    public void save(String path, Computer cmp) {
        System.out.println("Save to file" + path + ", " + cmp);
    }
}

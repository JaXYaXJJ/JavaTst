package Constructor;

public class Programmer {

    String name;
    String college;
    String [] programmingLangs;

    public Programmer(String name, String college, String[] programmingLangs) {
        this.name = name;
        this.college = college;
        this.programmingLangs = programmingLangs;
    }


    public boolean isInArray(String language) {

        for (int i = 0; i < programmingLangs.length; i++) {
            if (language == programmingLangs[i]) {
                return true;
            }
        }
        return false;
    }

    public void intro() {
        System.out.println("Programmer name is : " + this.name + " and college is : " + this.college);
    }
}

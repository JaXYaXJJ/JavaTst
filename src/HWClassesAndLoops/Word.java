package HWClassesAndLoops;

public class Word {

    private String hebrew;
    private String english;
    String russian; //public tst

    public Word (String heb, String eng, String rus) {

        this.setEnglish(eng);
        this.setHebrew(heb);
    }

    //setters + getters

    public void setHebrew(String hebrew) {
        this.hebrew = hebrew;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getHebrew() {
        return this.hebrew;
    }

    public String getEnglish() {
        return this.english;
    }

    @Override
    public String toString() {
        return this.getHebrew() + " : " + this.getEnglish();
    }
}

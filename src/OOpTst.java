public class OOpTst {
    public static void main(String[] args) {

        NorthCity cityLink;
        cityLink = new NorthCity();

        NorthCity cityLink2 = new NorthCity();

        cityLink.Oslo = "Capital of Norway";
        cityLink.Nuuk = "Capital of Greenland";
        cityLink.Vik = "Some city in south Iceland";

        System.out.println(cityLink.Oslo + "\nTemp in Oslo: " + cityLink.temp);
        System.out.println(cityLink2.Oslo + "\nTemp in Oslo: " + cityLink.temp);

    }
}

class NorthCity {
    String Oslo, Nuuk, Vik;
    int temp;

    {
        Oslo = "Oslo: Into constructor";
        temp = 5;
    }

    NorthCity() {}

    NorthCity(String Oslo, int temp) {
        this.Oslo = Oslo;
    }
}
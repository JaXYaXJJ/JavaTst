package JavaTst.enums;

public enum EGeomType {
    POINT("point"),
    LINE("line"),
    TRIANGLE("triangle"),
    RECTANGLE("rectangle"),
    ELLIPSE("ellipse");

    private String value;

    EGeomType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

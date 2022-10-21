package ClassWork.exOne;

public enum ECoverage {

    SILVER(0.6),
    GOLD(0.7),
    PLATINUM(0.9);

    private double coverage;

    ECoverage(double coverage) {
        this.coverage = coverage;
    }

    public double getCoverage() {
        return this.coverage;
    }
}

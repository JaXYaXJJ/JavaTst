package ClassWork.exOne;

public class Patient extends User {

    private long patientId;
    private boolean isInsured;
    private InsurancePlan insurancePlan;

    Patient() {}

    Patient(long patientId, boolean isInsured) {
        this.patientId = patientId;
        this.isInsured = isInsured;
    }

    public InsurancePlan getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(InsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }
}


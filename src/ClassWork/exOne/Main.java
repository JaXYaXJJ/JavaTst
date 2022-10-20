package ClassWork.exOne;

public class Main {
    public static void main(String[] args) {
        InsurancePlan insurancePlan = new PlatinumPlan();
        Patient patient = new Patient();

        patient.setInsurancePlan(insurancePlan);
        double[] payments = Billing.computerPayment(patient, 1000.0);
    }
}

package ClassWork.exOne;

public class Main {
    public static void main(String[] args) {

        InsurancePlan insurancePlan = new PlatinumPlan();
        InsurancePlan goldPlan = new GoldPlan();
        InsurancePlan silverPlan = new SilverPlan();

        Patient patient = new Patient();
        Patient patientTwo = new Patient();
        Patient patientThree = new Patient();

        patient.setInsurancePlan(insurancePlan);
        patientTwo.setInsurancePlan(goldPlan);
        patientThree.setInsurancePlan(silverPlan);

        double[] payments = Billing.computerPayment(patient, 1000.0);

        System.out.println("Insurance company will pay : " + payments[0]);
        System.out.println("Patient will pay : " + payments[1]);
    }
}

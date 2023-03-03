package class29;

public class InsuranceTask {
    public abstract class Insurance {
        String insuranceName;
        abstract void getQuote();
        abstract void cancelInsurance();

        Insurance(String insuranceName){
            this.insuranceName=insuranceName;
        }

    }
    class Car extends Insurance{
        String carModel;

        Car(String insuranceName,String carModel) {
            super(insuranceName);
            this.carModel=carModel;
        }


        @Override
        void getQuote() {
            System.out.println(insuranceName+" quote is 2000$ a year");
        }

        @Override
        void cancelInsurance() {
            System.out.println("You can cancel your car insurance any time you want without any penalty");

        }
    }
    class Pet extends Insurance{
        String petType;

        Pet(String insuranceName,String petType) {
            super(insuranceName);
            this.petType=petType;
        }

        @Override
        void getQuote() {
            System.out.println(petType+"'s insurance 580$ a year");
        }

        @Override
        void cancelInsurance() {
            System.out.println("You can cancel your "+insuranceName+" anytime");

        }
    }
    class Health extends Insurance{

        Health(String insuranceName) {
            super(insuranceName);
        }

        @Override
        void getQuote() {
            System.out.println("Your health insurance is 3400$ per year");
        }

        @Override
        void cancelInsurance() {
            System.out.println("You can cancel your "+insuranceName+" anytime with %7 fee");

        }}}
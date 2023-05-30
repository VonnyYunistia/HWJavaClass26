package HWJavaClass26;

import java.util.ArrayList;

abstract class Insurance {
    public String insuranceName;

    public double getQuote() {
        return 0;
    }

    public abstract void cancelInsurance();
}

class Car extends Insurance {
    private String carModel;

    public Car(String insuranceName, String carModel) {
        this.insuranceName = insuranceName;
        this.carModel = carModel;
    }

    public double getQuote() {
        // Implementation of getting a quote for car insurance.
        // This is left as an exercise for the reader.
        return 0.0;
    }

    public void cancelInsurance() {
        // Implementation of cancelling a car insurance.
        // This is left as an exercise for the reader.
    }
}

class Pet extends Insurance {
    private String petType;

    public Pet(String insuranceName, String petType) {
        this.insuranceName = insuranceName;
        this.petType = petType;
    }

    public double getQuote() {
        // Implementation of getting a quote for pet insurance.
        // This is left as an exercise for the reader.
        return 0.0;
    }

    public void cancelInsurance() {
        // Implementation of cancelling a pet insurance.
        // This is left as an exercise for the reader.
    }
}

class Health extends Insurance {
    public Health(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getQuote() {
        // Implementation of getting a quote for health insurance.
        // This is left as an exercise for the reader.
        return 0.0;
    }

    public void cancelInsurance() {
        // Implementation of cancelling a health insurance.
        // This is left as an exercise for the reader.
    }
}

class InsuranceTest {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();

        insurances.add(new Car("Car Insurance 1", "Model 1"));
        insurances.add(new Pet("Pet Insurance 1", "Type 1"));
        insurances.add(new Health("Health Insurance 1"));

        for (Insurance insurance : insurances) {
            System.out.println("Insurance: " + insurance.insuranceName);
            System.out.println("Quote: " + insurance.getQuote());
            insurance.cancelInsurance();
            System.out.println();
        }
    }
}















}

package Employee;

import Vehicle.Gender;
import Vehicle.Person;

public class employee extends Person {
    double totalSalary;

    public employee(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, first_name, last_name, gender, vehicle);
        this.totalSalary = totalSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}

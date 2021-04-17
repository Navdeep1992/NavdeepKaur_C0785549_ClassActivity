package Employee;

import Vehicle.Gender;

public class faculty extends employee{

    public faculty(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, first_name, last_name, gender, vehicle, totalSalary);
        Object department;
    }

    public String getDepartment() {
        String department;
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }
    
}

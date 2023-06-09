package all;

import java.util.Objects;

public class Employee {
    int empId;
    String empName;
    String address;

    Double salary;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return empId == employee.empId && empName.equals(employee.empName) && address.equals(employee.address);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, address, salary);
    }

    public Employee(int empId, String empName, String address, Double salary) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    @Override
//    public int compareTo(Employee o) {
//         if(this.equals(o))
//             return 0;
//         else
//             return 1;
//
//    }
}

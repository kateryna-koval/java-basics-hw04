public class Employee implements Payable{
  public String name;
  public String employeeId;
  public double averageMonthlySalary;

  // TODO fix class declaration and declare variables here

  public Employee(String employeeId, String name) {
    this.name = name;
    this.employeeId = employeeId;
  }

  // TODO fill in code here

  public String getEmployeeId() {
    return employeeId;
  }

  // TODO fill in code here and replace the return statement

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  // TODO fill in code here

  public String getName() {
    return name;
  }

  // TODO fill in code here and replace the return statement

  public void setName(String name) {
    this.name = name;
    // TODO fill in code here
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  // TODO fill in code here and replace the return statement

  @Override
  public String toString() {
    return "employee ID is: " + employeeId + ", employee name is: " + name
        + ", employee average monthly salary is: " + String.format("%.2f", averageMonthlySalary);
  }

  // TODO fill in code here and replace the return statement, be sure to format double value

  @Override
  public void calculatePay() {
  }
}

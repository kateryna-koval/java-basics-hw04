public class SalariedEmployee extends Employee{
  public String socialSecurityNumber;
  public double fixedMonthlyPayment;

  // TODO fix class declaration and declare variables here

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  // TODO fill in code here

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  // TODO fill in code here and replace the return statement

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  // TODO fill in code here

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  // TODO fill in code here and replace the return statement

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  // TODO fill in code here

  public String getName() {
    return name;
  }

  public void calculatePay() {
  }

  public double getAverageMonthlySalary() {
    averageMonthlySalary = fixedMonthlyPayment;
    return averageMonthlySalary;
  }

  // TODO fill in code here

}

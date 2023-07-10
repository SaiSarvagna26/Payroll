package Payroll;


class Employee{
    public double calculatePay(int salary) {
        return salary*25;
    }
    public double calculatePay(int hourlyRate,int hoursWorked){
        return hourlyRate*hoursWorked;
    }
}
class Payroll{
    public static void main(String[] args) {
        Employee employee=new Employee();
        System.out.println(employee.calculatePay(1000000));
        System.out.println(employee.calculatePay(3,24));
    }
}
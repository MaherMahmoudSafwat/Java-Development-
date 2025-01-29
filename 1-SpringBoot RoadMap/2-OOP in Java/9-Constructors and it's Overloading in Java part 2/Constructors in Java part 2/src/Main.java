public class Main {
    public static void main(String[] args)
    {
        //Applying Constructor Overloading
        Employee S1 = new Employee();
        System.out.println("Employee ID in S1 " + S1.getEmp_ID());
        System.out.println("Employee Name in S2 " + S1.getName());
        System.out.println("Employee Department in S1 " + S1.getEmp_ID());
        System.out.println("Employee Salary in S1 " + S1.getSalary());
        System.out.println("Employee Bonus in S1 " + S1.getBouns());
        System.out.println("Employee Resident in S1 " + S1.getResident());
        Employee S2 = new Employee(123,"Ahmed");
        System.out.println("Employee ID in S2 " + S2.getEmp_ID());
        System.out.println("Employee Name in S2 " + S2.getName());
        System.out.println("Employee Department in S2 " + S2.getDepart());
        System.out.println("Employee Salary in S2 " + S2.getSalary());
        System.out.println("Employee Bonus in S2 " + S2.getBouns());
        System.out.println("Employee Resident in S2 " + S2.getResident());
        Employee S3 = new Employee(123,"Ahmed",true);
        System.out.println("Employee ID in S3 " + S3.getEmp_ID());
        System.out.println("Employee Name in S3 " + S3.getName());
        System.out.println("Employee Department in S3 " + S3.getDepart());
        System.out.println("Employee Salary in S3 " + S3.getSalary());
        System.out.println("Employee Bonus in S3 " + S3.getBouns());
        System.out.println(("Employee Resident in S3 " + S3.getResident()));
        Employee S4 = new Employee(123,"Ahmed","Software Engineering",50.000,10.000,true);
        System.out.println("Employee ID in S4 " + S4.getEmp_ID());
        System.out.println("Employee Name in S4 " + S4.getName());
        System.out.println("Employee Department in S4 " + S4.getDepart());
        System.out.println("Employee Salary in S4 " + S4.getSalary());
        System.out.println("Employee Bonus in S4 " + S4.getBouns());
        System.out.println("Employee Resident in S4 " + S4.getResident());

        //Applying Method Overloading
        S4.setSalary(10000,5000);
    }
}
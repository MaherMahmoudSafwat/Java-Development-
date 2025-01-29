public class Employee
{
    private int Emp_ID;
    private String Name;
    private String Depart;
    private Double Salary;
    private Double Bouns;
    private Boolean Resident;

    //Constructor Overloading
    Employee()
    {
        Emp_ID = 12345;
        Name = "Ahmed";
        Depart = "Software Engineering";
        Salary = 50.000;
        Bouns = 10.000;
        Resident = true;
    }
    Employee(int ID, String name)
    {
        Emp_ID = ID;
        Name = name;
    }
    Employee(int ID, String name, boolean IsResident)
    {
        /*
        The this keyword in Java refers to the current object of the class.It can be used in several contexts,
        and it helps to distinguish between instance variables and local variables (variables with the same name).
        Additionally, this can be used to call other constructors or access instance methods.
        */
        this(ID,name);
        Resident = IsResident;
    }
    Employee(int ID, String Name, String Department, double Salary, Double bonus, Boolean IsResident)
    {
        this(ID,Name,IsResident);
        Depart = Department;
        //This is used here to distinguish between the variable of class and the variable given or and assigned by the parameter
        this.Salary = Salary;
        Bouns=bonus;
    }

    public void setEmp_ID(int emp_ID) {
        Emp_ID = emp_ID;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }

    public String getDepart() {
        return Depart;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setBouns(Double bouns) {
        Bouns = bouns;
    }

    public Double getBouns() {
        return Bouns;
    }

    public void setResident(Boolean resident) {
        Resident = resident;
    }

    public Boolean getResident() {
        return Resident;
    }

    //Method Overloading
    public void setSalary(double s, double b)
    {
        Salary = s;
        Bouns = b;
    }
}

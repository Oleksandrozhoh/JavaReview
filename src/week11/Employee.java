package week11;

public class Employee  extends Person{

    private double salary;
    private String employeeID, jobTitle;


    public Employee(String name, int age, char gender, double salary, String employeeID, String jobTitle) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        if(salary==0){
            System.err.println("Salary can not be zero");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle==null){
            System.err.println("JobTitle can not be null");
            System.exit(1);
        }
        if(jobTitle.isEmpty()){
            System.err.println("JobTitle can not be empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(getName()+" is working....");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", salary=" + salary +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

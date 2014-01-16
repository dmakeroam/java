package JavaII;
public class Employee {
    private static int n;
    private long empId;
    private String empName;
    private String empSurName;
    private String empPosition;
    private double empSalary;
    private double empBonus;

    public Employee() {
        this(null,null,null,0.0,0.0);
    }

    public Employee(String name, String surname, String pos, double sal, double bo) {
        this.empName = name;
        this.empSurName = surname;
        this.empPosition = pos;
        this.empSalary = sal;
        this.empBonus = bo;
        this.genEmployeeId();
    }
    
    public long genEmployeeId(){
        n++;
        this.empId=20000+n;
        return this.empId;
    }

    public long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurName() {
        return empSurName;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public double getEmpBonus() {
        return empBonus;
    }

    public void setEmpName(String name) {
        this.empName = name;
    }

    public void setEmpSurName(String sur) {
        this.empSurName = sur;
    }

    public void setEmpPosition(String pos) {
        this.empPosition = pos;
    }

    public void setEmpSalary(double sal) {
        this.empSalary = sal;
    }

    public void setEmpBonus(double bonus) {
        this.empBonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", empSurName=" + empSurName + ", empPosition=" + empPosition + ", empSalary=" + empSalary + ", empBonus=" + empBonus + '}';
    }
    
}

package JavaII;
public class TestEmployee {
    public static void main(String[] args) {
        Employee [] emp=new Employee[10];
        for(int i=0;i<emp.length;i++){
            emp[i]=new Employee();
            emp[i].setEmpName("A");
            emp[i].setEmpSurName("B");
            emp[i].setEmpPosition("Manager");
            emp[i].setEmpSalary(2000);
            emp[i].setEmpBonus(500);
            System.out.println("EMP ID : "+emp[i].getEmpId());
            System.out.println("EMP Name : "+emp[i].getEmpName());
            System.out.println("EMP Surname : "+emp[i].getEmpSurName());
            System.out.println("EMP Position : "+emp[i].getEmpPosition());
            System.out.println("EMP Salary : "+emp[i].getEmpSalary());
            System.out.println("EMP Bonus : "+emp[i].getEmpBonus());
            System.out.println(emp[i].toString());
            System.out.println("-----------------------------------------------");
        }
    }
}

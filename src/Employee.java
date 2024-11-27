public class Employee {
    String name;
    int id;
    boolean attendance = false;
    int normalWorkDay=20;
    int salaryPerHour=20;
    double dailySalary=0;
    public void attendance(boolean a){
        if (a){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
    public void EmployeeWages(){
        if(attendance){
            dailySalary=normalWorkDay*salaryPerHour;
            System.out.println(dailySalary);
        }
        else {
            dailySalary=0;
            System.out.println(dailySalary);
        }
    }
    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

}

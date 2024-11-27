public class Employee {
    String name;
    int id;
    public void attendance(boolean a){
        if (a){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }
}

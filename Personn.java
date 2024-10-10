public class Personn {
     
    String name;
    int age;
    
    
    public Personn(String name, int age) {
           this.name = name;
           this.age = age;
       }
   
       // Method to display name and age
       public void display() {
           System.out.println("Name: " + name);
           System.out.println("Age: " + age);
       
   }

}
 class Employee extends Personn {
    private double salary;

    // Constructor for Employee class
    public Employee(String name, int age, double salary) {
        super(name, age);  
        this.salary = salary;
    }

    // Method to display name, age, and salary
    public void display() {
        super.display();  // Calling the display method of the Person class
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an object of the Person class
        Personn person1 = new Personn("Rhodah Mulera", 40);
        System.out.println("Person Details:");
        person1.display();  // Calling display method of the Person class
        
        System.out.println();

        // Creating an object of the Employee class
        Employee employee1 = new Employee("Ouma Mulera", 28, 75000.00);
        System.out.println("Employee Details:");
        employee1.display();  // Calling display method of the Employee class
    
}

}

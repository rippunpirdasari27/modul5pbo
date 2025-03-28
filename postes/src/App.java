// Kelas Person
class Person { 
    private String name; 
    private int age; 

    // Konstruktor
    public Person(String n, int a) { 
        name = n; 
        age = a; 
    } 

    // Method untuk menampilkan data
    public void display() { 
        System.out.println("Name: " + name + ", Age: " + age); 
    }  
} 

// Kelas Employee yang merupakan turunan dari Person
class Employee extends Person { 
    private double salary; 

    // Konstruktor Employee, memanggil konstruktor Person
    public Employee(String n, int a, double s) { 
        super(n, a); // Memanggil konstruktor superclass
        salary = s;  
    } 

    // Method untuk menampilkan gaji
    public void showSalary() { 
        System.out.println("Salary: " + salary); 
    } 
} 

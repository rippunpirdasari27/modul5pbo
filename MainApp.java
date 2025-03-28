package com.university.main;
import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        // Membuat array berisi 5 objek Student dengan data dummy
        Student[] students = {
            new Student("S001", "Alice", 20, 3.8),
            new Student("S002", "Bob", 22, 3.6),
            new Student("S003", "Charlie", 21, 3.9),
            new Student("S004", "David", 23, 3.7),
            new Student("S005", "Eva", 19, 3.5)
        };

        // Menampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

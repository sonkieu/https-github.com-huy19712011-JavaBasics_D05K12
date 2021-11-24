package B14_MiniProject;

import B14_MiniProject.models.Student;
import B14_MiniProject.services.StudentDataService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        StudentDataService service = new StudentDataService();

        List<Student> students = service.read("./resources/student-input.txt");

        for (int i = 0; i < students.size(); ++i) {

            System.out.println(students.get(i));
        }

        // write to file "./resources/student-output.txt"
        service.write("./resources/student-output.txt", students);

    }

}

/*
-- class Student: name, id, phone, address, ... + methods
-- ArrayList<Student> => sort, search, add, delete, update, ...
*/
/*
-- B1: Class
-- B2: array (list) of students
*/
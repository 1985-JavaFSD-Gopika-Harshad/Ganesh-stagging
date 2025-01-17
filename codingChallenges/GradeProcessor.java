import java.util.LinkedHashMap;
import java.util.Map;

public class GradeProcessor {
    public static void main(String[] args) {
     
        Map<Integer, String> studentGrades = new LinkedHashMap<>();
       studentGrades.put(101, "A");
        studentGrades.put(102, "B");
        studentGrades.put(103, "A+");

        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
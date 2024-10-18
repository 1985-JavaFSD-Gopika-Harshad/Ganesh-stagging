import java.util.ArrayList;
import java.util.Collections;

class Emp {
    String n;
    double s;
    
    Emp(String n, double s) {
        this.n = n;
        this.s = s;
    }
}
public class SortEmpExample {
    public static void main(String[] args) {
        ArrayList<Emp> lst = new ArrayList<>();
        lst.add(new Emp("Ganesh", 5000));
        lst.add(new Emp("Rajesh", 6000));
        lst.add(new Emp("Ramesh", 4500));
        Collections.sort(lst, (a, b) -> Double.compare(b.s, a.s));
        for(Emp e : lst) {
            System.out.println(e.n + ": " + e.s);
        }
    }
}

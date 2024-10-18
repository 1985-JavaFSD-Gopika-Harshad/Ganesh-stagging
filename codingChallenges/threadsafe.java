import java.util.concurrent.ConcurrentHashMap;

public class threadsafe {
    private ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

    public void add(int k, String v) {
        map.put(k, v);
    }
    public String get(int k) {
        return map.get(k);
    }
    public void remove(int k) {
        map.remove(k);
    }
    public static void main(String[] args) {
        threadsafe ex = new threadsafe();
        ex.add(1, "Ganesh");
        ex.add(2, "Rajesh");
        ex.add(3, "Ramesh");
        System.out.println("Key 1: " + ex.get(1));
        System.out.println("Key 2: " + ex.get(2));
        ex.remove(1);
        System.out.println("After removal, Key 1: " + ex.get(1));
    }
}

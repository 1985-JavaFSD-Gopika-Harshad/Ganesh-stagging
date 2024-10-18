public class Pair<T, U> {
    private T f;
    private U s;

    public Pair(T f, U s) {
        this.f = f;
        this.s = s;
    }
    public T getF() {
        return f;
    }
    public void setF(T f) {
        this.f = f;
    }
    public U getS() {
        return s;
    }
    public void setS(U s) {
        this.s = s;
    }
    public static void main(String[] args) {
        Pair<String, Integer> sg = new Pair<>("Ganesh", 85);
        System.out.println("Student: " + sg.getF());
        System.out.println("Grade: " + sg.getS());
        sg.setF("Rajesh");
        sg.setS(92);
        System.out.println("Updated Student: " + sg.getF());
        System.out.println("Updated Grade: " + sg.getS());
    }
}

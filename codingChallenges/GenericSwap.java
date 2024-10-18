public class GenericSwap {
    public static <T> void swap(T[] arr) {
        if (arr.length > 1) {
            T temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }
    public static void main(String[] args) {
        String[] strArr = {"Ganesh", "Rajesh", "Anil", "Suresh"};
        swap(strArr);
        for (String s : strArr) {
            System.out.print(s + " ");
        }
        System.out.println();
        Integer[] intArr = {1, 2, 3, 4};
        swap(intArr);
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }
}

public class ArraySum {

    public int sumOfArray(Integer[] a, int index) {
        return sumOfArray(a, index, 0);
    }

    private int sumOfArray(Integer[] a, int index, int start) {
        if (start > index) {
            return 0;
        }
        return a[start] + sumOfArray(a, index, start + 1);
    }
}


import java.util.Arrays;

public class MyIntArrayList {

    public int[] elements;
    private int size;

    public MyIntArrayList() {
        this.elements = new int[0];
    }

        // var args
    public void add(int... elements) {
        for (int element : elements) {
            checkSize(this.size + 1);
            this.elements[this.size] = element;
            this.size++;
        }
    }

    private void checkSize(int s) {
        if (this.elements.length < s) {
            this.elements = Arrays.copyOf(this.elements, s * 2);
        }
    }
}

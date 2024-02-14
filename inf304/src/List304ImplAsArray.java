
import java.util.Arrays;

public class List304ImplAsArray implements List304 {
    int size;
    Integer[] array = new Integer[10];

    @Override
    public void deleteOfvalue(int val) throws ValueOutOfBoundsException {

    }

    @Override
    public void add(Integer e) throws EmptyElementException {

        if (e == null) {
            throw new EmptyElementException();
        }

        if (size ==  array.length) {
            Integer[] ar1 = new Integer[(int) (array.length*1.5)];
            for (int i = 0; i < array.length; i++) {
                ar1[i] = array[i];
            }
            array = ar1;
        }
        array[size] = e;
        size++;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index > array.length){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        Integer[] arNew = new Integer[array.length];

        if (index > (size-1)) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index + 1; i < array.length; i++){
            array[i - 1] = array[i];
        }
        array = arNew;
    }

    @Override
    public Integer pop(int index) throws IndexOutOfBoundsException{

        if (index > (size-1)) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index + 1; i < array.length; i++){
            array[i - 1] = array[i];
        }
        return array[index];
    }
    public Integer pop() {
        return array[size--];
    }

    @Override
    public String toString() {
        return "List304ImplAsArray{" + "array=" + Arrays.toString(array) + '}';
    }
}
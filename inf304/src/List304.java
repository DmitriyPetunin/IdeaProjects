public interface List304 {
    /**
     Список из однотипных элементов Integer
     позиционный(каждый элемент соотвествует опредлённой позиции)
     */
    void add(Integer e) throws EmptyElementException;

    Integer get(int index) throws IndexOutOfBoundsException;

    int getSize();
    void delete(int index) throws IndexOutOfBoundsException;

    void deleteOfvalue(int val) throws ValueOutOfBoundsException;

    Integer pop(int index);
    Integer pop();

}

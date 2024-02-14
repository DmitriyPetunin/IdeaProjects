package ru.itis.inf304.homeWork0912;

public class Array {
    public int[] array;
    public int inputElement;
    public int findLessElement;

    public Array(int[] array, int inputElement) {
        this.array = array;
        this.inputElement = inputElement;
        setSignInputElement(inputElement);
        setLessThanSmallestElement(inputElement);
    }
    public void findLess(int[] randomArray, int randomElement ){
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > randomElement) {
                continue;
            } else findLessElement = randomArray[i];
        }
        System.out.println(findLessElement);
    }
    public int getFindLessElementArray() {
        return array[0];
    }

    public void setSignInputElement(int inputElement) throws InvalidSignElementException{
        if (inputElement < 0) {
            throw new InvalidSignElementException();
        }
    }
    public void setLessThanSmallestElement(int inputElement) throws InvalidLessThanSmallestElementException{
        if (inputElement < getFindLessElementArray()) {
            throw new InvalidLessThanSmallestElementException();
        }
    }
}

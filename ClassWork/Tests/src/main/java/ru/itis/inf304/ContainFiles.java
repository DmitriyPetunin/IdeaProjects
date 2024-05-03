package ru.itis.inf304;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.Stack;

public class ContainFiles {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String data = "{{[]}}";

        try (FileWriter writer = new FileWriter("goodData.json")) {
            gson.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void containText(FileInputStream fis1,FileInputStream fis2) {
        try (FileOutputStream result = new FileOutputStream("test_result_fos.txt")) {
            int charCode1;
            while ((charCode1 = fis1.read()) != -1) {
                char character = (char) charCode1;
                result.write(character);
                System.out.println(character);
            }
            int charCode2;
            while ((charCode2 = fis2.read()) != -1){
                char character = (char) charCode2;
                result.write(character);
                System.out.println(character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void containBin(String name1, String name2){
        String message1 = "Hello";
        String message2 = "World";
        try (DataOutputStream dos1 = new DataOutputStream(new FileOutputStream(name1));
             DataOutputStream dos2 = new DataOutputStream(new FileOutputStream(name2));
             DataInputStream dis1 = new DataInputStream(new FileInputStream(name1));
             DataInputStream dis2 = new DataInputStream(new FileInputStream(name2));
            DataOutputStream dosResult = new DataOutputStream(new FileOutputStream("resultBin.bin"))){

            dos1.writeBytes(message1);
            dos2.writeBytes(message2);
            dis1.transferTo(dosResult);
            dis2.transferTo(dosResult);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int correct(String nameFile) throws FileNotFoundException {
        if (nameFile.isEmpty()){
            throw new NullPointerException("имя файла пустое");
        }
        File file = new File(nameFile);
        if (!file.exists()){
            throw new FileNotFoundException("файл не найден");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {
            String line;
            StringBuilder str = new StringBuilder();
            while ((line = reader.readLine()) != null){
                str.append(line);
            }
            String substring = str.substring(1,str.length()-1);
            return compare(substring);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
    public static int compare(String str){
        System.out.println(str);
        Stack<Character> stack = new Stack<>();
        int position = 0;
        char current,b;
        for (int i = 0; i < str.length(); i++){
            position = i;
            current = str.charAt(i);
            if (current == '{' || current == '['){
                stack.push(current);
            } else {
                b = stack.peek();
                if (b == '[' && current == ']'){
                    b = stack.pop();
                } else if (b == '{' && current == '}') {
                    b = stack.pop();
                } else {
                    return i;
                }
            }
        }
        if (!stack.isEmpty()){
            return position;
        }
        return 0;
    }
}

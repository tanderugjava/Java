package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> stringList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringList.add(scanner.nextLine());
            }
            scanner.close();

            for (int i = 0; i < stringList.size(); i++) {
                  String[] text = stringList.get(i).split(" ");
                  if(Integer.parseInt(text[1]) <= 0){
                      throw new IllegalArgumentException();
                  }
            }

            } catch(FileNotFoundException e){
                System.out.println("Файл не найден");
            } catch(IllegalArgumentException e){
                System.out.println("Некорректный входной файл");
                return null;
            }
            return stringList;
        }
    }

package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int year;

    public Person(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", year=" + year + '}';
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            List<String> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            scanner.close();

            for (String s : list) {
                String[] text = s.split(" ");
                if (Integer.parseInt(text[1]) <= 0) {
                    throw new IllegalArgumentException();
                } else {
                    Person person = new Person(text[0], Integer.parseInt(text[1]));
                    personList.add(person);
                }
            }
        } catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch(IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
            return null;
        }
        return personList;
    }
}

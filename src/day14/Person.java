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
        return  name + " " + year;
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                if (Integer.parseInt(line[1]) <= 0)
                    throw new IllegalArgumentException();

                Person person = new Person(line[0], Integer.parseInt(line[1]));
                personList.add(person);
                }
            scanner.close();
        } catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch(IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
            return null;
        }
        return personList;
    }
}

package day9;

public class Teacher extends Human{
    String subjectName;

    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.name);
    }
}

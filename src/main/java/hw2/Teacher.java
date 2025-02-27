package hw2;

public class Teacher {
    public static void main(String[] arg){

        Teacher firstTeacher = new Teacher("Smirnov Natalya","Math");

        firstTeacher.printInfo();

        firstTeacher.setSubject("Literature");

        firstTeacher.printInfo();

    }

    String name;
    String subject;

    Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    String getName(){
        return this.name;
    }

    String getSubject(){
        return this.subject;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }

   void printInfo(){
        System.out.println("Учитель: " + name + ", Предмет: " + subject);
    }

}

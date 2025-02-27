package hw2;

public class StudentGroup {
    public static void main(String[] arg){

        StudentGroup firstGroup = new StudentGroup("M11", 32);

        firstGroup.printInfo();

        firstGroup.setGroupName("QA");
        firstGroup.setStudentCount(100);

        firstGroup.printInfo();


    }

    String groupName;
    int studentCount;

    StudentGroup(String someGroupNme, int someStudentCount){
        this.groupName = someGroupNme;
        this.studentCount = someStudentCount;
    }

    String getGroupName(){
        return this.groupName;
    }

    int getStudentCount(){
        return this.studentCount;
    }

    public void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    public void setStudentCount(int newGroupCount){
        this.studentCount = newGroupCount;
    }

    void printInfo(){
        System.out.println("Группа: " + groupName + ", количество студентов: " + studentCount);
    }

}

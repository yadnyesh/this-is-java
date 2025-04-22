package io.yadnyesh.jennyslectures;

public class StudentInfo {
    String name;
    int rollno;
    int age;

    void display() {
        System.out.println("The student " + name + " has " + rollno + " and age: " + age);
    }

}

class StudentMain {
    public static void main(String[] args) {
        StudentInfo yadnyesh = new StudentInfo();
        yadnyesh.name = "yadnyesh";
        yadnyesh.rollno = 47;
        yadnyesh.age = 44;
        yadnyesh.display();
    }
}

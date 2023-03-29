package Q10;
//Write a program to count the number of student registered in a school
class Student {
    static int count = 0;
    int id;
    String name;

    public Student(String name) {
        this.id = ++count;
        this.name = name;
    }
    public static void main(String[] args) {
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Doe");
        Student student3 = new Student("Jim Smith");

        System.out.println("Number of students registered: " + Student.count);
    }
}


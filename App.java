package mystudent;
public class App {
    public static void main(String [] args) {

        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Louie";
        myStudent.major = "Lawyer";
        myStudent.gpa = 4.00;
        myStudent.age = 21;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent2.firstName = "Emma";
        myStudent2.lastName = "Layala";
        myStudent2.major = "Science";
        myStudent2.gpa = 3.9;
        myStudent2.age = 22;
        myStudent2.onProbation = true;

        System.out.println(myStudent.firstName);

        System.out.println(myStudent2.gpa);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 152003235
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student frank = Student.addStudent("Frank", Person.Gender.Male,  100.0 ,11);
        Student jess = Student.addStudent("Jessica", Person.Gender.Female,  100.0, 11);
        Student me = Student.addStudent("Isaac", Person.Gender.Male,  100, 10);
        Student tyler = Student.addStudent("Tyler", Person.Gender.Male, 100.001, 10);
        Student michael = Student.addStudent("Michael", Person.Gender.Male, 100.0, 10);
        Student jim = Student.addStudent("Jim", Person.Gender.Male, 100.0, 9);
        Student sarah = Student.addStudent("Sarah", Person.Gender.Female, 100.0, 12);
        Student jiffy = Student.addStudent("Jiff Y", Person.Gender.Male, 100.0, 12);
        Student chris = Student.addStudent("Christopher", Person.Gender.Male, 100.0, 10);
        Student samantha = Student.addStudent("Samantha", Person.Gender.Female, 100.0, 10);
        Teacher yee = Teacher.addTeacher("Yee", Person.Gender.Male, -10, 5.0001);
        Teacher ayala = Teacher.addTeacher("Ayala", Person.Gender.Female, 100, 2);
        Teacher arreola = Teacher.addTeacher("Arreola", Person.Gender.Female, 100, 6.1111);
        Teacher mcintosh = Teacher.addTeacher("McIntosh", Person.Gender.Female, 100, 8);
        
        
        double val = me.getWeight();
        
        //Person.devPrintAttributes();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Course ASL2 = Course.addCourse("American Sign Language 2",Course.Type.Language, 1);
        Course CS2 = Course.addCourse("Computer Science 2",Course.Type.Elective, 2);
        Course MathAnalysis = Course.addCourse("Math Analysis H",Course.Type.Math, 3);
        Course English10H = Course.addCourse("English 10 H",Course.Type.English, 4);
        
        me.addCourse(CS2);
        yee.addCourse(CS2);
        
        jim.addCourse(MathAnalysis);
        ayala.addCourse(MathAnalysis);
        
        chris.addCourse(English10H);
        mcintosh.addCourse(English10H);
        
        sarah.addCourse(ASL2);
        samantha.addCourse(ASL2);
        arreola.addCourse(ASL2);
        
        Course.devPrintAttributes();
        
        me.setBirthdate(23, 5, 2000);
        System.out.println(me.getAge());
        
        Student billy = Student.addStudent("Billy",Person.Gender.Male,150,10);
        billy.addCourse(CS2);
        
       // Student billy = new Student(Person.Gender.Male,"billy",150,10);
        System.out.println(billy.getName());
        Person.devPrintAttributes();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Teacher.printNames();
        
        System.out.println("");
        arreola.printStudentNames();
    }
}

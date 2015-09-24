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
        Student grill_generic = Student.addStudent("grill", Person.Gender.Female,  100.0 ,10);
        Student boy_generic = Student.addStudent("boy", Person.Gender.Male,  100.0, 10);
        Student me = Student.addStudent("Isaac", Person.Gender.Male,  100, 10);
        Student tyler = Student.addStudent("Tyler", Person.Gender.Male, 100.001, 10);
        Student michael = Student.addStudent("Michael", Person.Gender.Male, 100.0, 10);
        Person yee = Person.addPerson("YEEEEEEEEEE", Person.Gender.Male, -10);
        
        double val = me.getWeight();
        
        //Person.devPrintAttributes();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Course ASL2 = Course.addCourse("American Sign Language 2",Course.Type.Language, 1);
        Course CS2 = Course.addCourse("Computer Science 2",Course.Type.Elective, 2);
        Course MathAnalysis = Course.addCourse("Math Analysis H",Course.Type.Math, 3);
        Course English10H = Course.addCourse("English 10 H",Course.Type.English, 4);
        
        Course.devPrintAttributes();
        
        me.setBirthdate(23, 5, 2000);
        System.out.println(me.getAge());
        
        Student billy = Student.addStudent("Billy",Person.Gender.Male,150,10);
        billy.addCourse(CS2);
        
       // Student billy = new Student(Person.Gender.Male,"billy",150,10);
        System.out.println(billy.getName());
        Person.devPrintAttributes();
    }
}

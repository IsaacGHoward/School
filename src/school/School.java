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
        Person wimin = Person.addPerson("grill", Person.Gender.Female,  120.0);
        Person satan_lord_of_darkness = Person.addPerson("satan, lord of darkness", Person.Gender.Male,  666.6);
        Person gilligan = Person.addPerson("gilligan", Person.Gender.Male,  9001);
        Person skipper = Person.addPerson("skipper", Person.Gender.Male, 100.001);
        
        double val = wimin.getWeight();
        
        Person.devPrintAttributes();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Course ASL2 = Course.addCourse("American Sign Language 2",Course.Type.Language, 1);
        Course CS2 = Course.addCourse("Computer Science 2",Course.Type.Elective, 2);
        Course MathAnalysis = Course.addCourse("Math Analysis H",Course.Type.Math, 3);
        Course English10H = Course.addCourse("English 10 H",Course.Type.English, 4);
        
        Course.devPrintAttributes();
    }
}

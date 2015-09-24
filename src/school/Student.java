/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


public class Student extends Person {
    private int gradeLevel;
    private Course theCourse;
    public static Student addStudent(String _name, Gender _gender, double _weight, int _grade)
    {
        Student temp = new Student(_gender, _name, _weight, _grade);
        addPerson(temp);
        return(temp);
        
    }
    Student(Gender _gender, String _name, double _weight, int _grade)
    {
        super(_gender,_name,_weight);
        gradeLevel = _grade;
    }
    public void setGrade(int _grade)
    {
        gradeLevel = _grade;
    }
    public int getGrade()
    {
        return(gradeLevel);
    }
    
    public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            _course.addStudent(this);
        }
    }
    public static void printNames()
    {
        System.out.println("students");
        for (Person temp : people)
        {
            if( temp instanceof Student)
            {
                System.out.println(temp.getName());
            }
        }
    }
  
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


public class Student extends Person {
    private int gradeLevel;
    private Course courses[] = new Course[4];
    //private Course theCourse;
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
    
    public boolean addCourse(Course _course)
    {
//        if(theCourse == null)
//        {
//            theCourse = _course;
//            _course.addStudent(this);
//        }
        if(!setCourseOK(_course))
            return(false);
        if(!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course);
        return(true);
    }
    public boolean setCourseOK(Course _course)
    {
        if(_course == null)
            return(false);
        if(courses[_course.getPeriod()-1] != null)
            return(false);
        if(courses[_course.getPeriod()-1] == _course) //maybe remove if error
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course)
    {
        courses[_course.getPeriod()-1]=_course;
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

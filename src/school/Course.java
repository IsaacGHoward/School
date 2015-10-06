/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;

public class Course {
    enum Type {
        Math,Science,English,History,Language,Elective,PE
    }
    public static final int numPeriods = 4;
    private String name;
    private Type type;
    private int period;
    private boolean honors;
    private static ArrayList<Course> courses = new ArrayList<Course>();
    
    //private Student theStudent;
    private ArrayList<Student> students = new ArrayList<Student>();
   
    private Teacher theTeacher;
    public static Course addCourse(String _name, Type _type, int _period, boolean _honors)
    {
        Course temp = new Course(_name, _type, _period, _honors);
        courses.add(temp);
        return(temp);
        
    }
    Course()
    {
        name = "NA";
        type = Type.Elective;
        period = 0;
    }
    Course(String _name, Type _type, int _period, boolean _honors)
    {
        name = _name;
        type = _type;
        period = _period;
        honors = _honors;
    }
     public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }
    
    public void setType(Type _type)
    {
        type = _type;
    }
    public Type getType()
    {
        return(type);
    }
    
    public void setPeriod(int _period)
    {
        period = _period;
    }
    public int getPeriod()
    {
        return(period);
    }
    public Student getStudent(int index)
    {
        return(students.get(index));
    }
    public int getNumStudents()
    {
        return(students.size());
        
    }
    public Teacher getTeacher()
    {
        return(theTeacher);
    }
    public void setHonors(boolean _honors)
    {
        honors = _honors;
    }
    public boolean getHonors()
    {
        return(honors);
    }
    
//    public int getNumClasses()
//    {
//        return(students.size());
//        
//    }
    
    
    public boolean addStudent(Student _student, double _grade)
    {
        if(!setStudentOK(_student))
            return(false);
        if(!_student.setCourseOK(this))
            return(false);
        _student.setCourseDoIt(this);
        setStudentDoIt(_student);
        _student.setGradeScore(_grade,this);
        _student.addNumClasses();
        return(true);
    }
     
    public boolean addTeacher(Teacher _teacher)
    {
        if(!setTeacherOK(_teacher))
            return(false);
        if(!_teacher.setCourseOK(this))
            return(false);
        _teacher.setCourseDoIt(this);
        setTeacherDoIt(_teacher);
        return(true);
    }
    public boolean setStudentOK(Student _student)
    {
        if(_student == null)
            return(false);
        return(true);
    }
    public boolean setTeacherOK(Teacher _teacher)
    {
        if(_teacher == null)
            return(false);
        if(theTeacher != null)
            return(false);
        return(true);
    }
    public void setStudentDoIt(Student _student)
    {
        students.add(_student);
    }
    public void setTeacherDoIt(Teacher _teacher)
    {
        theTeacher = _teacher;
    }
    public static void printNames()
    {
        System.out.println("Course");
        for (Course temp : courses)
        {
            if( temp != null)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void devPrintAttributes()
    {
        System.out.println("name  type  period ");
        for (Course temp : courses)
        {
            if( temp != null)
            {
                System.out.println(temp.getName() + "  " + temp.getType() + "  " +  temp.getPeriod());
            }
        }
    }
//    public static void printNames(Gender _gender)
//    {
//        System.out.println(_gender + " people");
//        for (Person temp : people)
//        {
//            if( _gender == temp.gender)
//            {
//
//                System.out.println(temp.getName());
//            }
//
//        }
//    }
    public String toString()
    {
        return(name + " " + type + " " + period );
    }
}

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
    private String name;
    private Type type;
    private int period;
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private Student theStudent;
    private Teacher theTeacher;
    public static Course addCourse(String _name, Type _type, int _period)
    {
        Course temp = new Course(_name, _type, _period);
        courses.add(temp);
        return(temp);
        
    }
    Course()
    {
        name = "NA";
        type = Type.Elective;
        period = 0;
    }
    Course(String _name, Type _type, int _period)
    {
        name = _name;
        type = _type;
        period = _period;
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
    public String getStudent()
    {
        return(theStudent.getName());
    }
    
    public void addStudent(Student _student)
    {
        if(theStudent == null)
        {
            theStudent = _student;
            _student.addCourse(this);
        }
    }
     
    public void addTeacher(Teacher _teacher)
    {
        if(theTeacher == null)
        {
            theTeacher = _teacher;
            _teacher.addCourse(this);
        }
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

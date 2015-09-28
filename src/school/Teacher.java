/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 152003235
 */
public class Teacher extends Person{
    private double meanGrade;
    //private Course theCourse;
    public static int numCourses = 4;
    private Course courses[] = new Course[numCourses];
    public static Teacher addTeacher(String _name, Gender _gender, double _weight, double _mean)
    {
        Teacher temp = new Teacher(_gender, _name, _weight, _mean);
        addPerson(temp);
        return(temp);
        
    }
    Teacher(Gender _gender, String _name, double _weight, double _mean)
    {
        super(_gender,_name,_weight);
        if(_mean >= 0 && _mean <=10)
        meanGrade = _mean;
        else if(_mean <= 0)
        meanGrade = 0;
        else 
        meanGrade = 10;
    }
    public void setMean(int _mean)
    {
        meanGrade = _mean;
    }
    public double getMean()
    {
        return(meanGrade);
    }
    //public void printStudentNames()
//    {
//        
//        System.out.println("Students of"+" " + getName() + ":");
//        for(int a=0; a<numCourses;a++)
//        {
//        if(courses[a].getStudents() != null && courses[a] != null)
//        System.out.println(courses[a].getStudents());
//        else
//        System.out.println("no one");
//        }
//        
//    }
    public void printStudentNames()
    {
        System.out.println("Students of "+ getName()+ " :");
        for(Course temp : courses)
        {
            if(temp != null)
            {
                for(int i=0;i<temp.getNumStudents();i++)
                {
                    System.out.println(temp.getStudent(i).getName());
                }
            }
        }
        
    }
    public boolean addCourse(Course _course)
    {
//        if(theCourse == null)
//        {
//            theCourse = _course;
//            _course.addTeacher(this);
//        }
        if(!setCourseOK(_course))
            return(false);
        if(!_course.setTeacherOK(this))
            return(false);
        _course.setTeacherDoIt(this);
        setCourseDoIt(_course);
        return(true);
    }
    public boolean setCourseOK(Course _course)
    {
        if(_course == null)
            return(false);
        if(courses[_course.getPeriod()-1] != null)
            return(false);
        if(courses[_course.getPeriod()-1] == _course)
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course)
    {
        courses[_course.getPeriod()-1]=_course;
    }
    public static void printNames()
    {
        System.out.println("teachers");
        for (Person temp : people)
        {
            if( temp instanceof Teacher)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void devPrintAttributes()
    {
        System.out.println("name  gender  weight  meanlevel ");
        for (Person temp : people)
        {
            if( temp instanceof Teacher)
            {
                System.out.println(temp.getName() + "  " + temp.getGender() + "  " +  temp.getWeight());
            }
        }
    }
  
}

    


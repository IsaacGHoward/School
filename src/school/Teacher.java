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
    private Course theCourse;
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
    public void printStudentName()
    {
        
        System.out.println("Students of"+" " + getName() + ":");
        
        if(theCourse.getStudent() != null && theCourse != null)
        System.out.println(theCourse.getStudent());
        else
        System.out.println("no one");
        
    }
    
    public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            _course.addTeacher(this);
        }
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

    


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


public class Student extends Person {
    private int gradeLevel;
    private static int numStudents = 0;
    private int numClasses =0;
    private Course courses[] = new Course[Course.numPeriods];
    private double grades[] = new double[Course.numPeriods];
    //private double gpa;
    //private Course theCourse;
    public static Student addStudent(String _name, Gender _gender, double _weight, int _grade)
    {
        Student temp = new Student(_gender, _name, _weight, _grade);
        numStudents++;
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
    public void setGradeScore(double _grade,Course _course)
    {
        grades[_course.getPeriod()-1] = _grade;
    }
    public double getGradeScore(int _period)
    {
        return(grades[_period -1]);
    }
    public void printGradeScore(int _period)
    {
        System.out.println(grades[_period -1]);
    }
    public void addNumClasses()
    {
        numClasses++;
    }
    public double getGPA()
    {
        double test1=0;
        for(int i=0;i<=Course.numPeriods-1;i++)
        {
            test1+=grades[i];
        }
        if(numClasses!=0)
        return(test1/numClasses);
        else
        return(0.0);
    }
    public void printGPA()
    {
        double test1=0;
        for(int i=0;i<=Course.numPeriods-1;i++)
        {
            test1+=grades[i];
        }
        if(numClasses != 0)
        System.out.println("GPA for " + getName() + " : " + test1/numClasses);
        else
        System.out.println("NO CLASSES D: D:");    
    }
    public static void printNamesGPAGreaterThan(double _gpa)
    {
        System.out.println(_gpa + "<= people");
        for (Person temp : people)
        {
            if( temp instanceof Student)
            {
                
                if(((Student)temp).getGPA() > _gpa)
                System.out.println(temp.getName());
            }

        }
    }
    public static Student getHighestGPA()
    {
        Student bestStudent = null;
        for (Person temp : people)
        {
            if( temp instanceof Student)
            {  
                if(bestStudent == null || ((Student)temp).getGPA() > bestStudent.getGPA())
                bestStudent = (Student)temp;
            }
        }
        return(bestStudent);
        
    }
    
    public boolean addCourse(Course _course, double _grade)
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
        grades[_course.getPeriod()-1] = _grade;
        numClasses++;
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
    public void printTeacherNames()
    {
        System.out.println("Teachers of "+ getName()+ " :");
        for(Course temp : courses)
        {
            if(temp != null)
            {
                    System.out.println(temp.getTeacher().getName());
            }
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
    public static void printNamesInHonors()
    {
        System.out.println("Students enrolled in honors classes :");
        for (Person temp : people)
        {
            
            if( temp instanceof Student)
            {
                if(temp != null)
                {
                    boolean one = false;
                    Student student = (Student)temp;
                    for(Course i : student.courses)
                    {
                        if(i != null)
                        {
                            if(i.getHonors() == true && one == false)
                            {
                                System.out.println(temp.getName());
                                one = true;
                            }
                        }
                    }
                }
               
            }
        }
        
    }
    public boolean isInHonors()
    {
        for(int i=0; i<Course.numPeriods;i++)
        {
            if(courses[i] != null)
            {
            if(courses[i].getHonors())
                return(true);
            }
            
        }
        return(false);
    }
    public Teacher getNicestTeacher()
    {
        System.out.println("Nicest teacher of " + getName() + " :");
        Teacher meanTest = null;
        for (Course temp : courses)
        {
            if(temp!=null)
            {
                if(meanTest == null || temp.getTeacher().getMean() < meanTest.getMean() )
                {
                   meanTest = temp.getTeacher(); 
                }
            }
        }
        return(meanTest);
    }
  
}

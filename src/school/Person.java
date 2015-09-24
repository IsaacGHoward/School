/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author 152003235
 */
public class Person {
    enum Gender {
        Male,Female
    }
    
    public static int numPeople = 10;
    private static int currentPeopleIndex = 0;
    //private static Person people[] = new Person[numPeople];
    protected static ArrayList<Person> people = new ArrayList<Person>();
    private Gender gender;
    private String name;
    private double weight;
    
    private Course theCourse;
    
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    public static Person addPerson(String _name, Gender _gender, double _weight)
    {
        Person temp = new Person(_gender, _name, _weight);
        people.add(temp);
        return(temp);
        
    }
    public static void addPerson(Person _person)
    {
        people.add(_person);
    }
    Person()
    {
        name = "None";
        gender = Gender.Female;
        weight = 100.0;
    }
    Person( Gender _gender, String _name, double _weight)
    {
        gender = _gender;
        name = _name;
        weight = _weight;
        
    }
    public void setBirthdate(int _day, int _month, int _year)
    {
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        if(month < birthMonth )
        {
            return((year-birthYear)-1);
        }
        else if(month == birthMonth && day < birthDay)
        {
            return((year-birthYear)-1);
        }
        else if(month >= birthMonth || day >= birthDay || day < birthDay )
        {
            return(year-birthYear);
        }
        return(0); 
    }
   
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }
    
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return(gender);
    }
    
    public int getNumPeople()
    {
        return(numPeople);
    }
    
    public double getWeight()
    {
        return(weight);
    }
    public void setWeight(double _weight)
    {
        weight = _weight;
    }
    
    public static void printNames()
    {
        System.out.println("people");
        for (Person temp : people)
        {
            if( temp != null)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void devPrintAttributes()
    {
        System.out.println("name  gender  weight class ");
        for (Person temp : people)
        {
            if( temp != null)
            {
                System.out.println(temp.getName() + "  " + temp.getGender() + "  " +  temp.getWeight());
            }
        }
    }
    public static void printNames(Gender _gender)
    {
        System.out.println(_gender + " people");
        for (Person temp : people)
        {
            if( _gender == temp.gender)
            {

                System.out.println(temp.getName());
            }

        }
    }
    public String toString()
    {
        return(name + " " + gender + " " + weight );
    }
}

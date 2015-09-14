/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;

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
    private static ArrayList<Person> people = new ArrayList<Person>();
    private Gender gender;
    private String name;
    private double weight;
    public static Person addPerson(String _name, Gender _gender, double _weight)
    {
        Person temp = new Person(_gender, _name, _weight);
        people.add(temp);
        return(temp);
        
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
    public static void devPrintNames()
    {
        System.out.println("name  gender  weight ");
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

package it.develhope.Interfaces;

public class CollegePerson {
    protected String name;
    protected String surname;
    protected int collegeId;



    public String goToCollege(){
        return "Im " + name+ " " + surname + " "+ collegeId;
    }
}


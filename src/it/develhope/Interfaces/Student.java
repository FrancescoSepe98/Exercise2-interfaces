package it.develhope.Interfaces;

public class Student extends CollegePerson implements ILearningPerson {
    protected int academicYear;

    public Student (String name,String surname,int Id,int year){
        this.name=name;
        this.surname=surname;
        this.collegeId=Id;
        this.academicYear=year;
    }

    @Override
    public String studyAtHome() {

        return goToCollege() + " and i prefer to study from home";
    }

}

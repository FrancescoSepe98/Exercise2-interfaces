package it.develhope.Interfaces;

public class Professor extends CollegePerson implements ITeachingPerson {
    protected String teachingSubject;
    public Professor (String name,String surname,int Id,String subject){
        this.name=name;
        this.surname=surname;
        this.collegeId=Id;
        this.teachingSubject=subject;
    }

    @Override
    public String teachToOtherPeople() {
        return goToCollege() + " and Im a teacher";
    }
}

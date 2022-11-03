package it.develhope.Interfaces;

public class Assistant extends CollegePerson implements ITeachingPerson,ILearningPerson{

    protected boolean isGoingToBeAPhD;

    public Assistant(String name,String surname,int id,boolean willBeAPhD){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.isGoingToBeAPhD=willBeAPhD;
    }

    @Override
    public String studyAtHome() {
        return " I prefer to study from home";
    }

    @Override
    public String teachToOtherPeople() {
        return " Also im an Assistant";
    }
}

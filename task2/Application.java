public class Application {
    private PersonalInformation personalInformation;
    private Education[] educationList;
    private Expectations expectations;
    private Experience[] experienceList;

    public Application (PersonalInformation personalInformation,Education[] educationList,Expectations expectations,Experience[] experienceList){
        System.out.println("Application");
        this.personalInformation = personalInformation;
        this.educationList = educationList;
        this.expectations = expectations;
        this.experienceList = experienceList;
    }
    
    private void fillApplication() {
    }
    private void addExperience(Experience experience){
    }
    private void editPersonalInformation(){
    }
    private void addEducation(Education education){
    }
    private void editExpectations(){
    }
    private void deleteExperience(Experience experience){
    }
    private void deleteEducation(Education education){
    }
}
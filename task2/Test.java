public class Test {
    public static void main(String[] args){
        Education education = new Education ();
        Experience experience = new Experience();        
        PersonalInformation personalInformation = new PersonalInformation(); 
        Expectations expectations = new Expectations();


Education[] educationList = {education};
Experience[] experienceList = {experience};



        Application application = new Application(personalInformation,educationList,expectations,experienceList);

Application[] applicationList = {application};

        SearchSystem searchSystem = new SearchSystem(applicationList);


}
}



 








 




   


    
public class PersonalInformation {
    private String lastName;
    private String firstName;
    private String birthDate;
    private String phoneNumber;
    private String mail;
    private String skype;

    public PersonalInformation (){
        System.out.println("PersonalInformation");
    }
    
    private String getFullName(){
        return lastName + firstName;
    }
}
package week4.day4;

public class User {
    public User(String name, String phoneNumber, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    //네임
    private String name;
    public String getName () {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    //phoneNumnber
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    private String phoneNumber; // "01012345678" --> 0없어짐
    private int age;
    private String Password;


    public String getGetPassword () {
        // --> 접근제어 로직  (Getter)
        return Password;
    }
    public void setGetPassword (String getPassword){
        //-->본인 확인 로직 (Setter)
        this.Password = getPassword;
    }
}

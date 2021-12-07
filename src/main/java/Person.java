public class Person {

    // Instance variables
    private String name ;
    private String email;
    private String phoneNum;
    private char gender;
    private int age;

    private String date;
    private String destination;
    private String departureTime;

    //Constructors
    public Person()
    {

    }

    public Person(String name, String email, String phoneNum, char gender, int age, String datetoLeave, String destination, String departureTime)
    {
        //Validating input
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.gender = gender;

        if(age >0)
            this.age = age;
    }


    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >0)
            this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", date='" + date + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}

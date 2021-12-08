public class Person {

    // Instance variables - this is the information we need to have and grab from the user
    private String name ; // "sally"
    private String email; // "sally@gmail.com"
    private String phoneNum; // "678-575-9449"
    private char gender; // 'F' or 'M'
    private int age; // 35


    //Constructors
    public Person()
    {

    }

    // we created a constructor that would have all these information
    public Person(String name, String email, String phoneNum, char gender, int age)
    {
        //Validating input
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.gender = gender;

        // here we just said that an invalid input of anything less than 0 (you cannot be -1 years old)
        if(age >0)
            this.age = age;


    }


    // Methods - getters and setters which allow us to grab and set the data
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


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}


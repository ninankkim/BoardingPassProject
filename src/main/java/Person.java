public class Person {

    // these are instance variables - this is the information that needs to live inside the class
    private String name; // "sally"
    private String email; // "sally@gmail.com"
    private String phoneNum; // "678-575-9449"
    private char gender; // 'F' or 'M'
    private int age; // 35

    // we have two constructors, the first one is our default constructor
    public Person()
    {

    }

    // we created a constructor that would take in all this information
    // just because the variable isn't passed into the constructor, doesn't mean it doesn't live in our class
    public Person(String name, String email, String phoneNum, char gender, int age)
    {
        // here we are just validating input, so when we do this.name = name refers to the variable name and assigns it
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.gender = gender;

        // here we just said that an invalid input of anything less than 0 (you cannot be -1 years old)
        if(age >0)
            this.age = age;
    }

    // getters and setters are methods and is a form of encapsulation that allow us to grab and set data
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

    // this is the toString() method that will neatly print out the user information when evoked
    @Override
    public String toString() {
        return
                "Full Name = " + name + '\n' +
                "Email = " + email + '\n' +
                "Phone Number = " + phoneNum + '\n' +
                "Gender = " + gender + '\n' +
                "Age = " + age;
    }
}


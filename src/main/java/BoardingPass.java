import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BoardingPass {
    // these are also instance variables or some call them attributes and, they live inside the class
    private int boardingNum;
    private String dateToLeave;
    private String origin;
    private String destination;
    private String eta;
    private String departureTime;
    private int ticketPrice;
    private Person person;
    private float ticketPriceAfterDiscount;

    // these are constructors and the first one is a default constructor
    public BoardingPass()
    {

    }
    // this is our BoardingPass constructor that takes in these parameters that we're working with
    // constructors are special methods that are called when an object is instantiated
    // and the purpose of them are to initialize newly created objects before they are used
    // constructors share the same name as the class and, they do not have a return type ever

    // just because the variable isn't passed into the constructor, doesn't mean it doesn't live in our class
    public BoardingPass(String dateToLeave , String origin, String destination, String departureTime, Person person) {

        this.dateToLeave = dateToLeave;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.person = person;

        // here we declare a Random class that we used generate random data or information
        Random random = new Random();
        // we put the bound as 251, which means we're going to find an integer between 0 and 250
        // but when we do +150, this changes the range - so we now find a random integer between 150 and 400
        this.ticketPrice = random.nextInt(251) + 150;

        if (person.getAge() <= 12) {
            ticketPriceAfterDiscount = ticketPrice - (ticketPrice * .5f);
            if (person.getGender() == 'F') {
                ticketPriceAfterDiscount = ticketPriceAfterDiscount - (ticketPriceAfterDiscount * .25f);
            }
        } else if (person.getAge() >= 60) {
            ticketPriceAfterDiscount = ticketPrice - (ticketPrice * .6f);
            if (person.getGender() == 'F') {
                ticketPriceAfterDiscount = ticketPriceAfterDiscount - (ticketPriceAfterDiscount * .25f);
            }
        } else if (person.getGender() == 'F') {
            ticketPriceAfterDiscount = ticketPrice - (ticketPrice * .25f);
        } else {
        ticketPriceAfterDiscount = ticketPrice;
    }

        // we put the departure time in an array so 10:00 and AM would be 2 items in the array
        // because we are splitting from the spaces

        // for us to find the correct ETA we need to take our user input and split it by space - so when the user enters 10:00 AM
        // it gives us a string array that looks like this -> [10:00, AM] - this allows us to work with the time and whether its morning or night
        String timeParts [] = departureTime.split(" "); // [10:00, AM]

        // now we have to split it even further by splitting the first item in that array by its semicolon
        // so now, we have an arraylist that looks like this -> [10, 00] and this allows us to take the hours and minutes
        String hoursMinutesParts [] = timeParts[0].split(":");
        // [10, 00]
        int hours = Integer.parseInt(hoursMinutesParts[0]);

        // this if statement deals with whether the user input is PM or AM
        // if the item in index 1 is equals to the string "PM" then add 12 to the hours
        // because in 24 hour time, if the user put in 5:00 PM that's 17:00 so 5 + 12 = 17 OR 7:00 PM is 19:00 so 7 + 12 = 19
        // so this code here allows us to work with 24 hour time and tells us if the user input said 5:00 PM
        // then we're going to add 12 to give us the 24-hour version of that time
        if(timeParts[1].equals("PM")){
            hours = hours + 12;
        // but if the user inputs that their departure time is 12:00 AM, then we're going to keep the hours at 0
        // because first, 12:00 AM is actually 0:00 AND when we begin adding flight time to hours variable
        // think about it - so if they leave at 0:00 and their flight time is 3, then their arrival time is 3 AM
        } else if (timeParts[1].equals("AM") && hours == 12){
            hours = 0;
        }

        // here we created an int variable that will calculate flight time and ThreatLocalRandom is a new way to generate a random number
        // so, it will generate a random flightTime between 1 and 10 - so your flight could be 1 hour, or 7 hours, or 10 hours
        int flightTime = ThreadLocalRandom.current().nextInt(1, 10);
        // here we take the hours and add flight time, so if the randomly generated number was 2 and the departure time was 1
        // that means the flight time will change the hours by adding 2
        hours = hours + flightTime;
        // here we just declare a String and, it's undefined because we don't know what it is until we've defined it below
        String amOrPm;

        // now these are our edge cases, because if the user said their departure time is 12:00 PM and, we added 12 that would give us 24
        // and, then we would subtract 24 and 24-24 gives us 0, which is then 0:00 or 12:00 AM in 24 hr time and amOrPm would then be 'AM'
        if(hours >= 24){
            hours = hours - 24;
            amOrPm = "AM";
        // here if the user types in 10:00 PM and, we ADD 12 - that would give us 22:00 PM in 24 hour time
        // and because 22 is larger than 12, then we would subtract 12, which would give us 10:00 PM
        } else if (hours >= 12){
            hours = hours - 12;
            amOrPm = "PM";
        } else {
            amOrPm = "AM";
        }

        // convert back to 12 hr time
        if (hours == 0){
            hours = 12;
        }

        this.eta = hours + ":" + hoursMinutesParts[1] + " " + amOrPm;

        // here we created a new ArrayList called listOfBoardingNums
        ArrayList<Integer> listOfBoardingNums = new ArrayList<>();
        // it's going to be a list that starts from 1 to 100
        for(int i = 1; i <= 1000; i++){
            listOfBoardingNums.add(i);
        }
        // from there we use something called Collections.shuffle that will shuffle the list
        // so if our list from above looks like [5, 4, 6, 10] - it will shuffle to [10, 4, 5, 6] constantly
        // hence, our chances that the user will get the same number will be pretty slim
        Collections.shuffle(listOfBoardingNums);
        for(int i = 0; i < 1; i++){
            this.boardingNum = listOfBoardingNums.get(i);
        }
    }

    // Methods
    public int getBoardingNum() {
        return boardingNum;
    }

    public void setBoardingNum(int boardingNum) {
        this.boardingNum = boardingNum;
    }

    public String getDate() {
        return dateToLeave;
    }

    public void setDate(String date) {
        this.dateToLeave = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDateToLeave() {
        return dateToLeave;
    }

    public void setDateToLeave(String dateToLeave) {
        this.dateToLeave = dateToLeave;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return
                "<====================================================================>\n" +
                "BOARDING PASS TICKET" + '\n' +
                "<====================================================================>\n" +
                "BoardingPassInformation: " + " \n" +
                "Boarding Number = " + boardingNum + "\n" +
                "Departure Date = " + dateToLeave + '\n' +
                "Origin = " + origin + '\n' +
                "Destination = " + destination + '\n' +
                "Estimated Time of Arrival = " + eta + '\n' +
                "Departure Time = " + departureTime + '\n' +
                "Ticket Price = " + ticketPrice + '\n' +
                        "Ticket Price After Discount = " + ticketPriceAfterDiscount + '\n' +

                        "Personal Flyer Information: " + " \n"
                        + person + '\n' +

                "<====================================================================>\n"
                ;
    }
}

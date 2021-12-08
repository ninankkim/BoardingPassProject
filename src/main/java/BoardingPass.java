import java.util.Random;

public class BoardingPass {

    // Instance variables
    private String boardingNum;
    private String dateToLeave;
    private String origin;
    private String destination;
    private String eta;
    private String departureTime;
    private int ticketPrice;
    private Person person;


    //Constructors

    public BoardingPass()
    {

    }
    //(String boardingNum, String date, String origin, String destination, String eta, String departureTime)
    public BoardingPass(String dateToLeave , String origin, String destination, String departureTime, Person person) {
        this.boardingNum = boardingNum;
        this.dateToLeave = dateToLeave;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.person = person;
        Random random = new Random();
        // generate a random number from 150-400
        // so when we put the number 251, it means it's going to generate a random number from 0 to 250
        // but when we add +150 then we change the range, so the minimum would now be 150 and our max would be 400
        this.ticketPrice = random.nextInt(251)+150;
        // look at the age and gender of the person and update this variable accordingly



        // generate a random number from 0.5-6
        // to get that we need an integer range from 1-12 and then divide the random number by 2
        double flightTime = (random.nextInt(12)+1)/2.0;
        this.eta = flightTime + "hrs";
    }

    // Methods
    public String getBoardingNum() {
        return boardingNum;
    }

    public void setBoardingNum(String boardingNum) {
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
        return "BoardingPass{" +
                "boardingNum='" + boardingNum + '\'' +
                ", dateToLeave='" + dateToLeave + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", eta='" + eta + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", person=" + person +
                '}';
    }
}

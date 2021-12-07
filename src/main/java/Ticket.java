public class Ticket {

    // Variables
    private BoardingPass boardingPass;
    private Person person;
    private double ticketPrice;


    //Constructors
    public Ticket()
    {
    }

    public Ticket(BoardingPass boardingPass, Person person, double ticketPrice) {
        this.boardingPass = boardingPass;
        this.person = person;
        this.ticketPrice = ticketPrice;
    }

    //Getter
    public BoardingPass getBoardingPass()
    {
        return this.boardingPass;
    }

    public void setBoardingPass(BoardingPass boardingPass)
    {
        this.boardingPass = boardingPass;
    }


    public Person getPerson()
    {
        return this.person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public double getTicketPrice()
    {
        return this.ticketPrice;
    }

    public void setTicketPrice(double ticketPrice)
    {
        //
        //person.getAge()
        this.ticketPrice = ticketPrice;

       // compare person.getGender()
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "boardingPass=" + boardingPass.toString() +
                ", person=" + person.toString() +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}

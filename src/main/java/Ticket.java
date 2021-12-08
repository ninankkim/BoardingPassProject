public class Ticket {

    // Variables
    private Person person;
//    private double ticketPrice;

    //Constructors
    public Ticket()
    {
    }

    public Ticket(Person person) {
        this.person = person;
//        this.ticketPrice = ticketPrice;
    }

    //Getter


    public Person getPerson()
    {
        return this.person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    //    public double getTicketPrice()
//    {
//        return this.ticketPrice;
//    }
//
//    public void setTicketPrice(double ticketPrice)
    {
        //
//        //person.getAge()
//        this.ticketPrice = ticketPrice;

        // compare person.getGender()
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "person=" + person +
                '}';
    }
}

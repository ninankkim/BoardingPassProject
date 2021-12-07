public class BoardingPass {

    // Instance variables
    private String boardingNum;
    private String dateToLeave;
    private String origin;
    private String destinationLeave;
    private String eta;
    private String departureTime;


    //Constructors

    public BoardingPass()
    {

    }
    //(String boardingNum, String date, String origin, String destination, String eta, String departureTime)
    public BoardingPass(String boardingNum, String dateToLeave  , String origin, String destinationLeave, String eta, String departureTime) {
        this.boardingNum = boardingNum;
        this.dateToLeave = dateToLeave;
        this.origin = origin;
        this.destinationLeave = destinationLeave;
        this.eta = eta;
        this.departureTime = departureTime;
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
        return destinationLeave;
    }

    public void setDestination(String destination) {
        this.destinationLeave = destinationLeave;
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

    @Override
    public String toString() {
        return "BoardingPass{" +
                "boardingNum='" + boardingNum + '\'' +
                ", dateToLeave='" + dateToLeave + '\'' +
                ", origin='" + origin + '\'' +
                ", destinationLeave='" + destinationLeave + '\'' +
                ", eta='" + eta + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}

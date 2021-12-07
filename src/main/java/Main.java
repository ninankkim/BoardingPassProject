import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // we have an array list that will hold our ticket information
    public static ArrayList<Ticket> ticketList = new ArrayList<>();
    // main method
    public static void main(String[] args) {

        // we just set choice to 0 for our switch statements
        int choice = 0;
        // we create a new instance of a ticket
        Ticket ticket = new Ticket();

        // create a do while loop that really is just to take user input and make it almost like a user lobby/menu
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\n----------------------------------------------------\n");
            System.out.println("Please enter from the following choice");
            System.out.println("1. Enter Ticket Information \n2. Write to file \n3. Print Ticket Info \n4. Exit");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    ticket  = enterInfo();
                    break;

                case 2:
                    // we need to create something where the information will now be put into a text file
                    writeInfoToFile(ticket, "OutputFile.txt");
                     break;

                case 3:
                    // this just prints the ticket
                    System.out.println("Printing Ticket..");
                    printTicketInfo(ticket);
                    break;

                case 4:
                    // this just exits out of the whole program
                    System.out.println("Exiting ..");
                    choice = 4;
                    break;

                default:
                    break;
            }

        }while(choice != 4);

    }

    private static Ticket enterInfo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scanner.nextLine();

        System.out.println("Please Enter your email");
        String email = scanner.nextLine();

        System.out.println("Please Enter your phone number");
        String phoneNum = scanner.nextLine();

        System.out.println("Please Enter your gender");
        char gender = scanner.next().charAt(0);

        System.out.println("Please Enter your age");
        int age = scanner.nextInt();

        System.out.println("Please Enter your name");
        String date = scanner.nextLine();

        System.out.println("Please Enter your name");
        String destination = scanner.nextLine();

        System.out.println("Please Enter your name");
        String depatureTime = scanner.nextLine();

        Person person = new Person(name, email, phoneNum, gender, age, date, destination, depatureTime);

        scanner.nextLine(); // Skipping the buffered newline character
        System.out.println("Please Boarding Pass Number");
        String boardingNum = scanner.nextLine();

        System.out.println("Please Enter date");
        String dateToLeave = scanner.nextLine();

        System.out.println("Please Enter Origin");
        String origin = scanner.nextLine();

        System.out.println("Please Enter Destination");
        String destinationLeave = scanner.nextLine();

        System.out.println("Please Enter ETA");
        String eta = scanner.nextLine();

        System.out.println("Please Enter departure time");
        String departureTime = scanner.nextLine();

//        (boardingNum , date, origin, destination, eta, departureTime )
        BoardingPass boardingPass = new BoardingPass(boardingNum, dateToLeave, origin, destinationLeave, eta, departureTime );

        System.out.println("Please Enter Ticket Price");
        double ticketPrice = scanner.nextDouble();

        Ticket ticket = new Ticket(boardingPass, person, ticketPrice);

        ticketList.add(ticket);

        return ticket;


    }

    private static void printTicketInfo(Ticket ticket)
    {
        for (int i=0; i < ticketList.size(); i++)
        {
            System.out.print(ticketList.get(i).toString());
            System.out.println("");
        }


    }

    private static String writeInfoToFile(Ticket ticket, String filename)
    {

        return "Successfully written data to file ";

    }
}

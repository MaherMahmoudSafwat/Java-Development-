import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        char PassengerClass = 'X';
        double BaggageWeight = 0;
        double Excess=0;
        double Charge = -1;
        int NumberOfPassengers = 0;
        int NumberOfPassengersOfGroups = 0;
        System.out.println("Please enter the number of passengers of the groups ");
        NumberOfPassengersOfGroups = Input.nextInt();
        for(int j =0; j<NumberOfPassengersOfGroups; j++) {
            System.out.println("Please enter the Number Of Passengers of Group no." + (j+1));
            NumberOfPassengers = Input.nextInt();
            for (int i = 0; i < NumberOfPassengers; i++) {
                System.out.println("Please enter the Passenger no." + (i + 1) + " Class");
                PassengerClass = Input.next().charAt(0);
                System.out.println("Please enter Passenger Baggage Weight");
                BaggageWeight = Input.nextDouble();
                switch (PassengerClass) {
                    case 'f':
                    case 'F':
                        if (BaggageWeight > 30) {
                            Excess = BaggageWeight - 30;
                            Charge = Excess * 10;
                        }
                        break;
                    case 'b':
                    case 'B':
                        if (BaggageWeight > 25) {
                            Excess = BaggageWeight - 25;
                            Charge = Excess * 10;
                        }
                        break;
                    case 'e':
                    case 'E':
                        if (BaggageWeight > 20) {
                            Excess = BaggageWeight - 20;
                            Charge = Excess * 10;
                        }
                        break;
                    default:
                        System.out.println("Invalid Passenger Class");
                }
                if(Charge == -1)
                {
                    System.out.println("The User Passenger has no More Charges to Pay.");
                    continue;
                }
                System.out.println("The Total Charges of Passenger no." + (i + 1) + " bag are " + Charge);
                Charge = - 1;
            }
        }
    }
}
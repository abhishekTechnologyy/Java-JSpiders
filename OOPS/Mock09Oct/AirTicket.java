class AirTicket {
    String passengerName;
    String flightCompany;
    String arrivalTime;
    String departureTime;
    double costOfFlight;

    AirTicket(String passengerName, String flightCompany, String arrivalTime, String departureTime,double costOfFlight)
     {
        this.passengerName = passengerName;
        this.flightCompany = flightCompany;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.costOfFlight = costOfFlight;
    }

    void updatePassengerName(String name)
    {
        passengerName = name;
    }
    void updateFlightCompany(String company)
    {
        flightCompany = company;
    }
    void updateArrivalTime(String arrTime)
    {
        arrivalTime = arrTime;
    }
    void updateDepartureTime(String depTime)
    {
        departureTime = depTime;
    }
    void updateCostOfFlight(double cost)
    {
        costOfFlight = cost;
    }

    void flightWork()
    {
        System.out.println("Carry Passengers from one place to destination in less time");
    }
}

class MainClass1
{
    public static void main(String[] args) {
        
        AirTicket a1 = new AirTicket("Abhishek", "Indigo", "11:00 AM", "08:00 AM", 6500);
        
        a1.flightWork();

        System.out.println("Passenger name is : "+a1.passengerName);
        System.out.println("Passenger flight Comapny is : "+a1.flightCompany);
        System.out.println("Passenger Arrival Time is : "+a1.arrivalTime);
        System.out.println("Passenger Departure Time is : "+a1.departureTime);
        System.out.println("Passenger flight Cost is : "+a1.costOfFlight);

        a1.updatePassengerName("Kusum");
        a1.updateFlightCompany("SpiceJet");
        a1.updateArrivalTime("10:00 AM");
        a1.updateDepartureTime("04:30PM");
        a1.updateCostOfFlight(7500);

        System.out.println("updated Value");

        System.out.println("Passenger name is : "+a1.passengerName);
        System.out.println("Passenger flight Comapny is : "+a1.flightCompany);
        System.out.println("Passenger Arrival Time is : "+a1.arrivalTime);
        System.out.println("Passenger Departure Time is : "+a1.departureTime);
        System.out.println("Passenger flight Cost is : "+a1.costOfFlight);

    }
}

// // class TicketCounter 
// // {
// //     int ticketCounter;

// // selling ticket , buying ticlet



// //     void availableTickets;
// //     ticketCounterNo;
// //     buy ticket()
// //     cancel ticket()
// //     viewTotalTicketAvailable
// // }

// class TicketCounter
// {
//     int availableTickets;
//     int ticketCounterNo;
//     int ticketPurchase;

//     TicketCounter(int availableTickets, int ticketCounterNo, int ticketPurchase)
//     {
//         this.availableTickets = availableTickets;
//         this.ticketCounterNo = ticketCounterNo;
//         this.ticketPurchase = ticketPurchase;
//     }
//     void updateAvailableTicket(int tickets)
//     {
//         availableTickets = tickets;
//     }
//     void updateTicketCounterNo(int counter)
//     {
//         ticketCounterNo = counter;
//     }
//     void updateTicketPurchase(int purchase)
//     {
//         ticketPurchase = purchase;
//     }

    

//     void buyTickets()
//     {
//         if(availableTickets >= ticketPurchase)
//         {
//             availableTickets = availableTickets - ticketPurchase;
//             System.out.println("Booking successful");
//         }        
//     }
//     void viewTotalTicketAvailable()
//     {
//         System.out.println("total tickets are :" +availableTickets);
//     }
   
//     void cancelTicket(int noOfTicketsReturned)
//     {
//         availableTickets = availableTickets + noOfTicketsReturned;
//     }

// }
// class MainClass14
// {
//     public static void main(String[] args) {
//         TicketCounter t1 = new TicketCounter(100, 2, 50);
//         t1.buyTickets();
//         t1.viewTotalTicketAvailable();
//         t1.cancelTicket(25);
//     }
// }

class TicketCounter
{
    int ticketCounteNumber;
    int availableTickets;

    TicketCounter(int ticketCounteNumber, int availableTickets) {
        this.ticketCounteNumber = ticketCounteNumber;
        this.availableTickets = availableTickets;
    }

    void buyTickets(int n)
    {
        System.out.println("buying "+n+" tickets");
        if(n<availableTickets)
        {
            availableTickets = availableTickets - n;
            System.out.println("buy ticket successful");
        }
        else{
            System.out.println("Insufficient tickets");
        }
    }

    void cancelTicket(int n)
    {
        System.out.println("Cancelling" +n+" tickets");
        availableTickets = availableTickets + n;
    }
    
    void viewAllAvailableTickets()
    {
        System.out.println("available tickets are :"+availableTickets);
    }
}
package bookingticket;

public class conformedTicket extends waitingTicket {
	int SeatNo=12;
	public void display(){
		System.out.println(Source);
		System.out.println(Destination);
		System.out.println(Ticket_Price);
		System.out.println(status);
		System.out.println(SeatNo);
	}

}

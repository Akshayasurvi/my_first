package ticketBooking;

public class ticketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t;
		t=new waitingTicket();
		t.setDetails();
		t=new conformTicket();
		t.setDetails();

	}

}

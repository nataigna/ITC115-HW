
public abstract class LibraryItem {
	int number;
	String title;
	String reserve;
	String checkin;
	String checkout;
	double payfines;
	
	public LibraryItem(int number, String title,  String reserve, String checkin, String checkout, double payfines) {
		this.number = number;
		this.title = title;
		this.reserve = reserve;
		this.checkin = checkin;
		this.checkout = checkout;
		this.payfines = payfines;
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public double getPayfines() {
		return payfines;
	}

	public void setPayfines(double payfines) {
		this.payfines = payfines;
	}
	public String toString() {
		String outputString = "( Item number " + number + ", title " + title + ", Reservation " + reserve +", Check in date "+ checkin +", Check out date "+ checkout + ", PayFines if needes "+ payfines + " dollars )";
		return outputString;
	} 

}

package pack1.MyIOCDemo1;
@Component("Chai")
public class Chair {
	private int SeatNo;
	private String colour;
	
	public int getSeatNo() {
		return SeatNo;
	}
	@Autowired
	public Chair(int seatNo, String colour) {
		super();
		SeatNo = seatNo;
		this.colour = colour;
	}
	public void setSeatNo(int seatNo) {
		SeatNo = seatNo;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Chair [SeatNo=" + SeatNo + ", colour=" + colour + "]";
	}
	
	

}

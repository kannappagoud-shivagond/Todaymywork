package pack1.AssignmentOnIOCByAnnotations;

import org.springframework.stereotype.Component;

@Component("chair")
public class Chair {
	
	private int seatNo;
	private String colour;
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Chair [seatNo=" + seatNo + ", colour=" + colour + "]";
	}
	public Chair() {
		super();
	}
	

}

package training.iqgateway.springboot.SpringBootOffence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TM_OFFENCE")
public class OffenceEO {
	
	@Id
	@Column(name="OFFENCE_ID")
	private Integer Offence_id;
	
	@Column(name="OFFENCE_TYPE")
	private String Offence_type;
	
	@Column(name="PENALITY")
	private Integer penality;
	
	@Column(name="VEHICLE_TYPE")
	private String vehicle_Type;
	
	
	
	public OffenceEO()
	{
		
	}



	public OffenceEO(Integer offence_id, String offence_type, Integer penality, String vehicle_Type) {
		super();
		this.Offence_id = offence_id;
		this.Offence_type = offence_type;
		this.penality = penality;
		this.vehicle_Type = vehicle_Type;
	}



	public Integer getOffence_id() {
		return Offence_id;
	}



	public void setOffence_id(Integer offence_id) {
		Offence_id = offence_id;
	}



	public String getOffence_type() {
		return Offence_type;
	}



	public void setOffence_type(String offence_type) {
		Offence_type = offence_type;
	}



	public Integer getPenality() {
		return penality;
	}



	public void setPenality(Integer penality) {
		this.penality = penality;
	}



	public String getVehicle_Type() {
		return vehicle_Type;
	}



	public void setVehicle_Type(String vehicle_Type) {
		this.vehicle_Type = vehicle_Type;
	}



	@Override
	public String toString() {
		return "OffenceEO [Offence_id=" + Offence_id + ", Offence_type=" + Offence_type + ", penality=" + penality
				+ ", vehicle_Type=" + vehicle_Type + "]";
	}
	
	

}

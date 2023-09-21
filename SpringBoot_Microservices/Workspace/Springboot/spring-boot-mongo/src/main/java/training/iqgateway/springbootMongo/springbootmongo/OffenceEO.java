package training.iqgateway.springbootMongo.springbootmongo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TM_OFFENCES")
public class OffenceEO {
	
	@Id
	private String id;
	
	@Id
	@NotNull
	private Integer OffenceID;
	
	@NotEmpty
	private String OffenceType;
	
	@NotNull
	private Integer penality;
	
	@NotEmpty
	private String VehicleType;

	
	
	public OffenceEO()
	{
		
	}
	
	public OffenceEO(String id, Integer offenceID, String offenceType, Integer penality, String vehicleType) {
		super();
		this.id = id;
		this.OffenceID = offenceID;
		this.OffenceType = offenceType;
		this.penality = penality;
		this.VehicleType = vehicleType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOffenceID() {
		return OffenceID;
	}

	public void setOffenceID(Integer offenceID) {
		OffenceID = offenceID;
	}

	public String getOffenceType() {
		return OffenceType;
	}

	public void setOffenceType(String offenceType) {
		OffenceType = offenceType;
	}

	public Integer getPenality() {
		return penality;
	}

	public void setPenality(Integer penality) {
		this.penality = penality;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "OffenceEO [id=" + id + ", OffenceID=" + OffenceID + ", OffenceType=" + OffenceType + ", penality="
				+ penality + ", VehicleType=" + VehicleType + "]";
	}
	
	
	

}

package tms.iqgateway.entities;

public class VehicleEO {
	
	
	private String VehicleNumber;
	
	private String vehicleName;
	
	private String vehicleType;
	
	private String vehicleColor;
	
	private String vehicleDOM;
	
	private String ManufacturerName;
	
	public VehicleEO()
	{
		
	}

	
	
	
	public VehicleEO(String vehicleNumber, String vehicleName, String vehicleType, String vehicleColor,
			String vehicleDOM, String manufacturerName) {
		super();
		VehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
		this.vehicleDOM = vehicleDOM;
		ManufacturerName = manufacturerName;
	}




	@Override
	public String toString() {
		return "VehicleEO [VehicleNumber=" + VehicleNumber + ", vehicleName=" + vehicleName + ", vehicleType="
				+ vehicleType + ", vehicleColor=" + vehicleColor + ", vehicleDOM=" + vehicleDOM + ", ManufacturerName="
				+ ManufacturerName + "]";
	}




	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleDOM() {
		return vehicleDOM;
	}

	public void setVehicleDOM(String vehicleDOM) {
		this.vehicleDOM = vehicleDOM;
	}

	public String getManufacturerName() {
		return ManufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		ManufacturerName = manufacturerName;
	}
	
	

}

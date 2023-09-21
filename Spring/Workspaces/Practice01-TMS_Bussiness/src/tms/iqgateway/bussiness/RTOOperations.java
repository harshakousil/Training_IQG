package tms.iqgateway.bussiness;

import tms.iqgateway.entities.OwnerEO;
import tms.iqgateway.entities.VehicleEO;

public interface RTOOperations {
	
	public int addVehicle(VehicleEO vehicle);
	
	public int removeVehicle(VehicleEO vehicle);
	
	public int ModifyVehicle(VehicleEO vehicle);
	
	public int transferVehicle(VehicleEO vehicle);
	
	
	public int addOwner(OwnerEO owner);
	
	public int modifyOwner(OwnerEO owner);
	
	public int removeOwner(OwnerEO owner);
	
	//and other operations

}

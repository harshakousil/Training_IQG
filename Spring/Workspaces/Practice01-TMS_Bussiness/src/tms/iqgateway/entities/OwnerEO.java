package tms.iqgateway.entities;

public class OwnerEO {
	
	private String ownerId;
	
	private String owneName;
	
	private String ownerDOB;
	
	private String ownerTempAddress;
	
	private String ownerPermanentAddress;
	
	private String ownerIdentityProof;
	
	private String ownerMobileNum;
	
	
	
	public OwnerEO()
	{
		
	}


	
	

	public OwnerEO(String ownerId, String owneName, String ownerDOB, String ownerTempAddress,
			String ownerPermanentAddress, String ownerIdentityProof, String ownerMobileNum) {
		super();
		this.ownerId = ownerId;
		this.owneName = owneName;
		this.ownerDOB = ownerDOB;
		this.ownerTempAddress = ownerTempAddress;
		this.ownerPermanentAddress = ownerPermanentAddress;
		this.ownerIdentityProof = ownerIdentityProof;
		this.ownerMobileNum = ownerMobileNum;
	}





	public String getOwnerId() {
		return ownerId;
	}



	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}



	public String getOwneName() {
		return owneName;
	}



	public void setOwneName(String owneName) {
		this.owneName = owneName;
	}



	public String getOwnerDOB() {
		return ownerDOB;
	}



	public void setOwnerDOB(String ownerDOB) {
		this.ownerDOB = ownerDOB;
	}



	public String getOwnerTempAddress() {
		return ownerTempAddress;
	}



	public void setOwnerTempAddress(String ownerTempAddress) {
		this.ownerTempAddress = ownerTempAddress;
	}



	public String getOwnerPermanentAddress() {
		return ownerPermanentAddress;
	}



	public void setOwnerPermanentAddress(String ownerPermanentAddress) {
		this.ownerPermanentAddress = ownerPermanentAddress;
	}



	public String getOwnerIdentityProof() {
		return ownerIdentityProof;
	}



	public void setOwnerIdentityProof(String ownerIdentityProof) {
		this.ownerIdentityProof = ownerIdentityProof;
	}



	public String getOwnerMobileNum() {
		return ownerMobileNum;
	}



	public void setOwnerMobileNum(String ownerMobileNum) {
		this.ownerMobileNum = ownerMobileNum;
	}





	@Override
	public String toString() {
		return "OwnerEO [ownerId=" + ownerId + ", owneName=" + owneName + ", ownerDOB=" + ownerDOB
				+ ", ownerTempAddress=" + ownerTempAddress + ", ownerPermanentAddress=" + ownerPermanentAddress
				+ ", ownerIdentityProof=" + ownerIdentityProof + ", ownerMobileNum=" + ownerMobileNum + "]";
	}

	
	
}

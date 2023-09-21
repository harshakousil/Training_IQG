package training.iqgateway.business;

public class CurrencyConverterImpl implements CurrencyConverter {

	private Customer customerRef;
	
	public CurrencyConverterImpl()
	{
		
	}
	
	
	public CurrencyConverterImpl(Customer customerRef) {
		super();
		this.customerRef = customerRef;
	}


	public Customer getCustomerRef() {
		return customerRef;
	}


	public void setCustomerRef(Customer customerRef) {
		this.customerRef = customerRef;
	}


	@Override
	public String dollarToRS(double dollars) {
		// TODO Auto-generated method stub
		return "Hello ,"+customerRef.getName()+ " Your Converted Amount is " + dollars *85;
	}

	@Override
	public String poundsToRS(double pounds) {
		// TODO Auto-generated method stub
		return "Hello ,"+customerRef.getName()+ " Your Converted Amount is " + pounds *73.9;
	}

	@Override
	public String riyalsToRS(double riyals) {
		// TODO Auto-generated method stub
		return "Hello ,"+customerRef.getName()+ " Your Converted Amount is " + riyals *68.67;
	}

	@Override
	public String yensToRS(double yens) {
		// TODO Auto-generated method stub
		return "Hello ,"+customerRef.getName()+ " Your Converted Amount is " + yens *33.33;
	}

	@Override
	public String pesosToRS(double pesos) {
		// TODO Auto-generated method stub
		return "Hello ,"+customerRef.getName()+ "Your Converted Amount is " + pesos *45.00;
	}

}

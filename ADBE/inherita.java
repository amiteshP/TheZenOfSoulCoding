class Vehicle{
	static int countMile;
	static HashMap<String, String> vehicaleKeys;
	public void go(String key){
		if(vehicleKeys.get(key)!=null)
			this.start();	
	}

	private void start(){
		count++;
	}
}

class DirtBike extends Vehicle{
	private static final String DIRTNAME = "COLDOZER";
	public static String getName(){
		return DIRTNAME;
	}
}
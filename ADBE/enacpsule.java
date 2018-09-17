class Encapsulation{
	private int id;
	private String name;

	public void setName(String name){
		if(name.length()>4)
			this.name = name;
		else
			System.out.print("Failed to set Name. Ensure length > 3");
	}

	public String getName(){
		return this.name;
	}

}
interface ShapeProperties{
	final int PI = 3.14;
	public abstract String getShapeName();
	public int getFlavorID();
}

class Rectangle implements ShapeProperties{
	private String name;
	Rectangle(String name){
		this.name = name;
	}
	public String getShapeName(){
		return this.name;
	}
	public int getFlavorID(){
		return PI*(this.name.charAt(0)-'0');
	}
}

public enum Level{
	HIGH(1),
	Med(2),
	Low(3);

	private final int levelCode;

	private Level(int levelCode){
		this.levelCode = levelCode;
	}

	public int getLevelCode(){
		return this.levelCode;
	}
}
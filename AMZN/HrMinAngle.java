class Solution{
	public static double returnAngle(double h, double m){
		double hrAngle = (h*60+m)*0.5; //360/(12*60) = 0.5 ---> Angle covered by hour hand in a min
		double minAngle = (h*60+m)*6; //360/60 = 6 ---> Angle covered by min hand in a min

		return (minAngle-hrAngle);
	}

	static public void main(String args[]){
		System.out.println(returnAngle(12, 0.3));
	}
}
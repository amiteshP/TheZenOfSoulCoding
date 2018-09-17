class Solution{
	class Point{
		int x, y;
		Point(int a, int b){
			this.x = a;
			this.y = b;
		}
	}

	public static int getDistance(Point a, Point b){
		return ((a.x-b.x)*(a.x-b.x) - (a.y-by)*(a.y-b.y));
	}


	public boolean isSquare(Point a, Point b, Point c, Point d){
		int d1 = getDistance(a, b);
		int d2 = getDistance(a, c);
		int d3 = getDistance(a, d);

		if(d1==d2 && (d3==2*d1) && (d3==2*d2) && (d3==getDistance(b,c)))
			return (2*d2 == getDistance(b, c));

		if(d3==d2 && (d1==2*d3) && (d1==2*d2) && (d1==getDistance(b,c)))
			return (2*d2 == getDistance(b, c));

		if(d1==d3 && (d2==2*d1) && (d2==2*d3) && (d2==getDistance(b,c)))
			return (2*d3 == getDistance(b, c));

		return false;
	}
}
public class checkLineIntersect{
	static class Point{
		int x;
		int y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	//Given three collinear points 'p', 'q', 'r'
	//check if 'q' lies on line 'pr'
	public static boolean onSegment(Point p, Point q, Point r){
		if(q.x<=Math.max(p.x, r.x) && q.x>=Math.min(p.x, r.x) 
			&& q.y<=Math.max(p.y, r.y) && q.y>=Math.min(p.y, r.y))
			return true;
		return false;
	}

	//Find Orientation of triplet 'p', 'q', 'r'
	//0->Collinear
	//1->Clockwise
	//2->Counter-Clockwise
	public static int findOrientation(Point p, Point q, Point r){
		int val = (q.y-p.y)*(r.x-q.x)-(q.x-p.x)*(r.y-q.y);
		if(val==0)
			return val;
		return (val>0)?1:2;
	}

	//Method for checking line intersection
	//lines -- p1q1, p2q2
	public static boolean checkIntersection(Point p1, Point q1, Point p2, Point q2){
		int o1 = findOrientation(p1, q1, p2);
		int o2 = findOrientation(p1, q1, q2);
		int o3 = findOrientation(p2, q2, p1);
		int o4 = findOrientation(p2, q2, q1);

		//General Case
		if(o1!=o2 && o3!=o4)
			return true;

		//Special case
		//p1q1p2 are collinear and p2 lies on p1q1
		if(o1 == 0 && onSegment(p1, p2, q1)) return true;
		//p1q1q2 are collinear and q2 lies on p1q1
		if(o2 == 0 && onSegment(p1, q2, q1)) return true;
		//p2q2p1 are collinear and p1 lies on p2q2
		if(o3 == 0 && onSegment(p2, p1, q2)) return true;
		//p2q2q1 are collinear and q1 lies on p2q2
		if(o4 == 0 && onSegment(p2, q1, q2)) return true;

		return false;
	}

	static public void main(String args[]){
		Point p1 = new Point(1, 1);
		Point q1 = new Point(10, 1);
		Point p2 = new Point(1, 2);
		Point q2 = new Point(10, 2);
		System.out.println(checkIntersection(p1, q1, p2, q2));
		Point p3 = new Point(10, 0);
		Point q3 = new Point(0, 10);
		Point p4 = new Point(0, 0);
		Point q4 = new Point(10, 10);
		System.out.println(checkIntersection(p1, q1, p2, q2));
	}
}
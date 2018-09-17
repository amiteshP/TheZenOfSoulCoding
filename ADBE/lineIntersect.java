/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	static class Point{
		int x; int y;
		Point(int a, int b){
			x=a;y=b;
		}
	}

	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int x1 = rdi.nextInt();
			int y1 = rdi.nextInt();
			Point p1 = new Point(x1, y1);
			int x2 = rdi.nextInt();
			int y2 = rdi.nextInt();
			Point p2 = new Point(x2, y2);
			int x3 = rdi.nextInt();
			int y3 = rdi.nextInt();
			Point p3= new Point(x3, y3);
			int x4 = rdi.nextInt();
			int y4 = rdi.nextInt();
			Point p4 = new Point(x4, y4);
			boolean res = checkIntersection(p1, p2, p3, p4);
			if(res==true)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	public static boolean checkIntersection(Point p1, Point p2, Point p3, Point p4)
	{
		int o1 = findOrientation(p1, p2, p3);
		int o2 = findOrientation(p1, p2, p4);
		int o3 = findOrientation(p3, p4, p1);
		int o4 = findOrientation(p3, p4, p2);

		if(o1!=o2 && o3!=o4)
			return true;

		else
		{
		//Special case
		//p1p2p3 are collinear and p3 lies on p1p2
		if(o1 == 0 && onSegment(p1, p3, p2)) return true;
		//p1p2p4 are collinear and p4 lies on p1p2
		if(o2 == 0 && onSegment(p1, p4, p2)) return true;
		//p3p4p1 are collinear and p1 lies on p3p4
		if(o3 == 0 && onSegment(p3, p1, p4)) return true;
		//p3p4p2 are collinear and p2 lies on p3p4
		if(o4 == 0 && onSegment(p3, p2, p4)) return true;
		}
		return false;
	}

	public static int findOrientation(Point p, Point q, Point r){
		int val = (q.y-p.y)*(r.x-q.x)-(q.x-p.x)*(r.y-q.y);
		if(val==0)
			return val;
		return (val>0)?1:2;
	}

	//Given three collinear points 'p', 'q', 'r'
	//check if 'q' lies on line 'pr'
	public static boolean onSegment(Point p, Point q, Point r){
		if(q.x<=Math.max(p.x, r.x) && q.x>=Math.min(p.x, r.x) 
			&& q.y<=Math.max(p.y, r.y) && q.y>=Math.min(p.y, r.y))
			return true;
		return false;
	}
}


package io.github.gitzzg.Chapter1;

public class MyPoint implements Point {
	private double x, y;
	public static Point ORIGIN = new MyPoint();
	
	private MyPoint() {
		
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double amplitude() {
		return Math.atan(y/x);
	}

	@Override
	public double distanceTo(Point point) {
		if(point.equals(this)) {
			return 0.0;
		} else if (!(point instanceof MyPoint)) {
			throw new IllegalArgumentException("use a MyPoint object!");
		} else {
			MyPoint that = (MyPoint)point;
			double dx = that.x - this.x;
			double dy = that.y - this.y;
			return Math.sqrt(dx*dx+dy*dy);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (!(obj instanceof MyPoint)) {
			return false;
		}
		MyPoint that = (MyPoint)obj;
		return (that.x == this.x && that.y == this.y);
	}
	
	@Override
	public double magnitude() {
		return Math.sqrt(x*x + y*y);
	}
	
	@Override
	public String toString() {
		return String.format("(%.2f, %.2f)", x, y);
	}

	@Override
	public double xCoordinate() {
		return x;
	}

	@Override
	public double yCoordinate() {
		return y;
	}

}

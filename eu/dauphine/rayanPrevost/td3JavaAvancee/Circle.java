package eu.dauphine.rayanPrevost.td3JavaAvancee;

public class Circle {

	private final Point center;
	private int radius;
	
	public Circle(Point p, int radius) {
		this.center = new Point(p.getX(),p.getY());
		this.radius = radius;
				
	}
	
	
	public Point getCenter() {
		return new Point(center);
	}

	@Override
	public String toString() {
		String res = "Le cercle à un rayon de "+this.getRadius()+ " , Le centre du cercle est le point : "+this.center.displayPoint();
		res += " L'air de ce cercle est "+ this.area()+" cm^2";
		return res;
	}

	
	public void translate(int dx, int dy) {
		Point copy_point = new Point(this.center.getX(),this.center.getY());
		this.center.setX(copy_point.getX()+dx);
		this.center.setY(copy_point.getY()+dy);
	}
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		double res = Math.PI*this.getRadius()*this.getRadius(); 
		return res;
	}
	
	public boolean contains(Point p) {
		boolean res = false;
		double resCalculX = Math.pow((p.getX()-this.center.getX()), 2);
		double resCalculY = Math.pow((p.getY()-this.center.getY()), 2);
		
		if(Math.sqrt(resCalculX+resCalculY)<this.radius) {
			res = true;
		}
		return res;
	}

	public boolean contains(Point p, Circle...circles) {
		for(Circle c: circles)
			if(c.contains(p))
				return true;
		return false;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return ((Circle) obj).radius == radius && ((Circle) obj).center.equals(center); 
	}
	

}

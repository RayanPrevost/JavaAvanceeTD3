package eu.dauphine.rayanPrevost.td3JavaAvancee;

public class Point {


	private int x;
	private int y;
	static int instanceCreate = 0;
	
	public Point(int px, int py) {
		this.x = px;
		this.y = py;
		instanceCreate++;
	}
	
	public Point(Point p2) {
		this.x = p2.getX();
		this.y = p2.getY();
	}
	
	private static void afficher() {
		Point p = new Point(2,5);
		System.out.println("("+p.getX()+","+p.getY()+")");
		System.out.println("Nombres d'instances de Point : "+getInstanceCreate());
	}
	
	public boolean isSameAs(Point p) {
		boolean response = false;
		if(this.getX() == p.getX() && this.getY() ==p.getY()) {
			response = true;
		}
		return response;
	}
	
	
	public static int getInstanceCreate() {
		return instanceCreate;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public String displayPoint() {
		return  "("+this.getX()+","+this.getY()+")";
	}
	
	public Point translate(int dx, int dy) {
		return new Point(this.x+dx,this.y+dy);

	}
	
	
	/*public void draw(Graphics g) {
		g.drawLine(0,0, this.getX(), this.getY());
	}*/
	
}

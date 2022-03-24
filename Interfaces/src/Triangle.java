
public class Triangle {
	private float width;
	private float heigth;
	
	public Triangle(float width, float heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeigth() {
		return heigth;
	}
	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}
	
	public float area() {
		return (getWidth() * getHeigth())/2;
	}
	
}

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public abstract class Zone {

	private int width;
	private int height;
	private Color color;
	private ZoneGenerator zoneMaker = new ZoneGenerator();
	
	public Zone(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void drawSelf() {
		
	}
	
	public Zone GenerateNeighbor() {
		return zoneMaker.makeZone(this.toString());
	}

}

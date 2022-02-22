import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public abstract class Zone {

	protected Color color;
	protected ZoneGenerator zoneMaker = new ZoneGenerator();
	protected int width;
	protected int height;
	
	public Zone(Color color, int height, int width) {
		this.color = color;
		this.height = height;
		this.width = width;
	}
	
	public abstract void drawSelf(Graphics painter, int currentX, int currentY);
	
	public abstract Zone GenerateNeighbor();
}

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public abstract class Zone {

	// each zone type class has these variables that need to be accessed by the children
	protected Color color;
	protected ZoneGenerator zoneMaker = new ZoneGenerator();
	protected int width;
	protected int height;
	
	/**
	 * Constructor to be used by the children of the Zone class, fills the color/height/width
	 * @param color
	 * @param height
	 * @param width
	 */
	public Zone(Color color, int height, int width) {
		this.color = color;
		this.height = height;
		this.width = width;
	}
	
	/**
	 * Renders the zone on the canvas using the painter and its current position
	 * @param painter
	 * @param currentX
	 * @param currentY
	 */
	public abstract void drawSelf(Graphics painter, int currentX, int currentY);
	
	/**
	 * Picks a new zone at random using the probabilities specified in order to create a potential neighbor
	 * @return new Zone type object
	 */
	public abstract Zone GenerateNeighbor();
}

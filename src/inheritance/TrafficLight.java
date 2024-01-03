package inheritance;

public class TrafficLight {
	// Enum representing the possible states of a traffic light
	public enum LightColor {
		RED, YELLOW, GREEN
	}

	private LightColor currentColor;

	// Constructor to initialize the current color
	public TrafficLight() {
		this.currentColor = LightColor.RED; // Default to red
	}

	// Method to change the traffic light color
	public void changeColor() {
		switch (currentColor) {
		case RED:
			currentColor = LightColor.GREEN;
			break;
		case YELLOW:
			currentColor = LightColor.RED;
			break;
		case GREEN:
			currentColor = LightColor.YELLOW;
			break;
		}
	}

	// Method to get the current traffic light color
	public LightColor getCurrentColor() {
		return currentColor;
	}

	// Main method to test the TrafficLight class
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();

		System.out.println("Initial traffic light color: " + trafficLight.getCurrentColor());

		// Change the traffic light color and display the new color
		trafficLight.changeColor();
		System.out.println("New traffic light color: " + trafficLight.getCurrentColor());
	}
}

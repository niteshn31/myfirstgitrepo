package inheritance;

import java.util.Scanner;

//Main class to test the interface and classes
public class MediaRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose a media player: ");
		System.out.println("1. AudioPlayer");
		System.out.println("2. VideoPlayer");

		int choice = scanner.nextInt();

		MediaPlayer mediaPlayer;

		// Create an instance based on user choice
		if (choice == 1) {
			mediaPlayer = new AudioPlayer();
		} else if (choice == 2) {
			mediaPlayer = new VideoPlayer();
		} else {
			System.out.println("Invalid choice. Exiting...");
			return;
		}

		// Use the interface methods for the selected player
		mediaPlayer.play();
		mediaPlayer.pause();
		mediaPlayer.stop();

		// Call the specific methods based on the type of player
		if (mediaPlayer instanceof AudioPlayer) {
			((AudioPlayer) mediaPlayer).skipTrack();
		} else if (mediaPlayer instanceof VideoPlayer) {
			((VideoPlayer) mediaPlayer).forward();
		}

		// Close the scanner
		scanner.close();
	}
}

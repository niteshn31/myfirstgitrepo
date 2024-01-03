package inheritance;

//Define an interface
interface MediaPlayer {
	void play();

	void stop();

	void pause();
}

//Implement the interface for an AudioPlayer
class AudioPlayer implements MediaPlayer {
	@Override
	public void play() {
		System.out.println("AudioPlayer is playing the audio.");
	}

	@Override
	public void stop() {
		System.out.println("AudioPlayer stopped.");
	}

	@Override
	public void pause() {
		System.out.println("AudioPlayer paused.");
	}

	// Additional method specific to AudioPlayer
	public void skipTrack() {
		System.out.println("Skipped to the next track.");
	}
}

//Implement the interface for a VideoPlayer
class VideoPlayer implements MediaPlayer {
	@Override
	public void play() {
		System.out.println("VideoPlayer is playing the video.");
	}

	@Override
	public void stop() {
		System.out.println("VideoPlayer stopped.");
	}

	@Override
	public void pause() {
		System.out.println("VideoPlayer paused.");
	}

	// Additional method specific to VideoPlayer
	public void forward() {
		System.out.println("VideoPlayer is fast forwarding.");
	}
}

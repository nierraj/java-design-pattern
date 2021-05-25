package com.structural.adaptor.example2;

public class AudioPlayer implements MediaPlayer {

	MediaAdaptor adaptor;

	public void play(String audioType, String fileName) {
		if ("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("Playing MP3 file " + fileName);
		} else if ("vlc".equalsIgnoreCase(audioType)
				|| "mp4".equalsIgnoreCase(audioType)) {
			adaptor = new MediaAdaptor(audioType);
			adaptor.play(audioType, fileName);
		} else {
			System.out.println("Invalid media type.");
		}
	}

}

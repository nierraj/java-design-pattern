package com.structural.adaptor.example2;

public class MediaAdaptor implements MediaPlayer {

	AdvanceMediaPlayer player;

	public MediaAdaptor(String audioType) {

		if ("vlc".equalsIgnoreCase(audioType)) {
			player = new VlcPlayer();
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			player = new Mp4Player();
		}

	}

	public void play(String audioType, String fileName) {
		if ("vlc".equalsIgnoreCase(audioType)) {
			player.playVLC(fileName);
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			player.playMP4(fileName);
		}
	}

}

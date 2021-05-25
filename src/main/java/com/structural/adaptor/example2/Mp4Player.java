package com.structural.adaptor.example2;

public class Mp4Player implements AdvanceMediaPlayer {

	public void playVLC(String fileName) {

	}

	public void playMP4(String fileName) {
		System.out.println("Playing Mp4 file " + fileName + " .");
	}

}

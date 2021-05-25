package com.behavioral.iterator;

public class Channel {

	private double frequency;
	private ChannelType type;

	public Channel(double frequency, ChannelType type) {
		super();
		this.frequency = frequency;
		this.type = type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", type=" + type + "]";
	}

}

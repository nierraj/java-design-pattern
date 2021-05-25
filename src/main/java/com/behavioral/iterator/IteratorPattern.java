package com.behavioral.iterator;

public class IteratorPattern {

	public static void main(String[] args) {

		ChannelCollection cl = populateChannels();
		System.out.println("********All Channels*********\n");
		ChannelIterator iterator = cl.iterator(ChannelType.ALL);
		while (iterator.hasNext()) {
			Channel ch = iterator.next();
			System.out.println(ch);
		}
		System.out.println("\n!!!!!!!!!!!!!!English Channels!!!!!!!!!!!!!!!!\n");
		iterator = cl.iterator(ChannelType.ENGLISH);
		while (iterator.hasNext()) {
			Channel ch = iterator.next();
			System.out.println(ch);
		}

	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelType.HINDI));
		channels.addChannel(new Channel(100.5, ChannelType.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelType.HINDI));
		channels.addChannel(new Channel(103.5, ChannelType.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelType.HINDI));
		channels.addChannel(new Channel(106.5, ChannelType.FRENCH));
		return channels;
	}
}

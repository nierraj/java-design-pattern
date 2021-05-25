package com.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

	List<Channel> channels;

	public ChannelCollectionImpl() {

		channels = new ArrayList<Channel>();

	}

	public void addChannel(Channel ch) {
		channels.add(ch);
	}

	public void removeChannel(Channel ch) {
		channels.remove(ch);
	}

	public ChannelIterator iterator(ChannelType type) {
		return new ChannelIteratorImpl(type, channels);
	}

	private class ChannelIteratorImpl implements ChannelIterator {

		private ChannelType type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelType type, List<Channel> channels) {
			super();
			this.type = type;
			this.channels = channels;
		}

		@Override
		public boolean hasNext() {

			while (position < channels.size()) {

				Channel ch = channels.get(position);
				if (ch.getType().equals(type) || type.equals(ChannelType.ALL)) {
					return true;
				} else {
					position++;
				}

			}
			return false;
		}

		@Override
		public Channel next() {
			Channel channel = channels.get(position);
			position++;
			return channel;
		}

	}

}

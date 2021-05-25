package com.behavioral.iterator;

public interface ChannelCollection {

	public void addChannel(Channel ch);

	public void removeChannel(Channel ch);

	public ChannelIterator iterator(ChannelType type);

}

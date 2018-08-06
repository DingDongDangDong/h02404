package kr.ac.halla.ice.advanced_programming.week5;

import java.util.Date;

public class Citation {
	private String sourceID;
	private String destinationID;
	private long timestamp;

	public Citation(String sourceID, String destinationID, long timestamp) {
		this.sourceID = sourceID;
		this.destinationID = destinationID;
		this.timestamp = timestamp;
	}

	public String getSourceID() {
		return sourceID;
	}

	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}

	public String getDestinationID() {
		return destinationID;
	}

	public void setDestinationID(String destinationID) {
		this.destinationID = destinationID;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return this.sourceID + " cited " + this.destinationID + " at " + new Date(timestamp);
	}
}

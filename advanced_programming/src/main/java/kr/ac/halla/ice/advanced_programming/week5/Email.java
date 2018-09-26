package kr.ac.halla.ice.advanced_programming.week5;

public class Email {
	private Integer senderID;
	private Integer receiverID;
	
	public Email(Integer senderID, Integer receiverID) {
		this.senderID = senderID;
		this.receiverID = receiverID;
	}

	public Integer getSenderID() {
		return senderID;
	}

	public void setSenderID(Integer senderID) {
		this.senderID = senderID;
	}

	public Integer getReceiverID() {
		return receiverID;
	}

	public void setReceiverID(Integer receiverID) {
		this.receiverID = receiverID;
	}
}

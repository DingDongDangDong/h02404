package kr.ac.halla.ice.advanced_programming.week6;

public class Citation implements Comparable<Citation> {

	private Integer left;
	private Integer right;
	private Long timestamp;

	public Citation(int left, int right, long timestamp) {
		this.left = left;
		this.right = right;
		this.timestamp = timestamp;
	}

	public Integer getLeft() {
		return left;
	}

	public void setLeft(Integer left) {
		this.left = left;
	}

	public Integer getRight() {
		return right;
	}

	public void setRight(Integer right) {
		this.right = right;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return this.left + " -> " + this.right + " at " + this.timestamp;
	}

	// Compares this object with the specified object for order. Returns a negative
	// integer, zero, or a positive integer as this object is less than, equal to,
	// or greater than the specified object.
	@Override
	public int compareTo(Citation o) {
		if (this.timestamp < o.timestamp)
			return -1;
		else if (this.timestamp == o.timestamp)
			return 0;
		else
			return 1;
	}
}

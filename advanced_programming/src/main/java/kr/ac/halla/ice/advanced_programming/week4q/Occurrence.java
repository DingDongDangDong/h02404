package kr.ac.halla.ice.advanced_programming.week4q;

public class Occurrence {
	private Integer id;
	private Integer occurrence;

	public Occurrence(Integer id, Integer occurrence) {
		this.id = id;
		this.occurrence = occurrence;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOccurrence() {
		return occurrence;
	}

	public void setOccurrence(Integer occurrence) {
		this.occurrence = occurrence;
	}

	@Override
	public String toString() {
		return this.id + "\t" + this.occurrence;
	}
}

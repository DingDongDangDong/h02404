package kr.ac.halla.ice.advanced_programming.week7;

public class ComparableRelationship implements Comparable<ComparableRelationship> {
	private String subject;
	private String predicate;
	private String object;

	/**
	 * Constructor
	 * 
	 * @param subject
	 * @param predicate
	 * @param object
	 */
	public ComparableRelationship(String subject, String predicate, String object) {
		this.subject = subject;
		this.predicate = predicate;
		this.object = object;
	}

	@Override
	public String toString() {
		return this.subject + " " + this.predicate + " " + this.object;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	@Override
	public int compareTo(ComparableRelationship o) {
		return this.subject.compareTo(o.subject);
	}
}

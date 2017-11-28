package set;

import java.util.Objects;

public class Item implements Comparable<Item> {
	private String description;
	private int partNumber;

	public Item(String description, int partNumber) {
		this.description = description;
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "[description=" + description + ",partNumber=" + partNumber + "]";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(description, other.description) && partNumber == other.partNumber;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(description, partNumber);
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return Integer.compare(partNumber, o.partNumber);
	}

}

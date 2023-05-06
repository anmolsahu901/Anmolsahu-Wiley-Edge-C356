package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<GeniusStudent> {

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {

		return o1.getName().compareTo(o2.getName());
		
	}

}

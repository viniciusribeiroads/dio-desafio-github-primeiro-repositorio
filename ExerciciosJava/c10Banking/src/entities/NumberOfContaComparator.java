package entities;

import java.util.Comparator;

public class NumberOfContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		
		if (o1.getAgencyNumber() < o2.getAgencyNumber()) {
			return -1;
		}
		
		if (o1.getAgencyNumber() > o2.getAgencyNumber()) {
			return 1;
		}
		
		return 0;
	}

}

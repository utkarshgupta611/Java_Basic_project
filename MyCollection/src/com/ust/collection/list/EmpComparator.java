package com.ust.collection.list;

import java.util.Comparator;

public class EmpComparator implements Comparator<Emp> {

	private SortField sortField;

	public EmpComparator(SortField sortField) {
		this.sortField = sortField;

	}

	@Override
	public int compare(Emp e1, Emp e2) {

		int val = 0;
		switch (sortField) {
		case NAME:
			val = e1.getName().compareTo(e2.getName());
			break;
		case MOBILE:
			val = (int)(e1.getMobile()-e2.getMobile());
			break;

		default:
			val = e1.getId()-e2.getId();
			break;
		}
		return val;
		

	}

}
//		return e1.getId()-e2.getId();
// 		return (int)(e1.getMobile()-e2.getMobile());
//		return e1.getName().compareTo(e2.getName());
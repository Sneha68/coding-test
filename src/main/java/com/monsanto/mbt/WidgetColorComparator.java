package com.monsanto.mbt;

import java.util.Comparator;

public class WidgetColorComparator implements Comparator<Widget> {

	@Override
	public int compare(Widget w1, Widget w2) {
	//logic to compare widgets based on color, null scenarios handled	
		int compareValue = 0;
		if(w1==null && w2!=null){
			compareValue= -1;
		}else if(w1!=null && w2==null){
			compareValue = 1;
		}
		else if(w1!=null && w2!=null){
			compareValue = w1.getColor().compareTo(w2.getColor());
		}
		return compareValue;
	}	

}

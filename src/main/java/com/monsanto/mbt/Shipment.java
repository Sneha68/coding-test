package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.List;

public class Shipment {

private List<Widget> widgets = new ArrayList<Widget>();

public List<Widget> getWidgets() {
	return widgets;
}

public void setWidgets(List<Widget> widgets) {
	this.widgets = widgets;
}

}

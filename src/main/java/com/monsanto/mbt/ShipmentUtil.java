package com.monsanto.mbt;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShipmentUtil {

	private static WidgetDateComparator wdc = new WidgetDateComparator();
	private static WidgetColorComparator wcc = new WidgetColorComparator();

  //logic to create shipment
	private static Shipment createShipment(List<Widget> widgets, Comparator<Widget> widgetCompare) {
		Shipment shipment = null;
		//if widgets are more than 10 then return null and log message
		if(widgets.size()>10){
			System.out.println("Only 10 widgets can be added to shipment");
		}else{
			Collections.sort(widgets, widgetCompare);
			shipment = new Shipment();
			shipment.setWidgets(widgets);
		}
		return shipment;
	}

	//method to create shipment with widgets sorted by date
	public static Shipment createShipmentSortDate(List<Widget> widgets) {
		Shipment shipment = createShipment(widgets, wdc);
		return shipment;
	}

	//method to create shipment with widgets sorted by color
	public static Shipment createShipmentSortColor(List<Widget> widgets) {
		Shipment shipment = createShipment(widgets, wcc);
		return shipment;
	}

}

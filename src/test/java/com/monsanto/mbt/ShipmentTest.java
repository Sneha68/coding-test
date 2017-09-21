package com.monsanto.mbt;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShipmentTest {

	@Test
	public void testShipment_Sorted_By_Color() {
		// Implement your solution to get list of shipments
		List<Widget> testWidgets = WidgetUtils.getSampleWidgets().subList(0, 10);
		Shipment shipmentColor = ShipmentUtil
				.createShipmentSortColor(testWidgets);
		List<Widget> shipmentWidgets = shipmentColor.getWidgets();		
		assertTrue(shipmentWidgets.get(0).getColor().equals("Blue")
				&& shipmentWidgets.get(1).getColor().equals("Blue")
				&& shipmentWidgets.get(4).getColor().equals("Green")
				&& shipmentWidgets.get(7).getColor().equals("Red"));
	}

	@Test
	public void testShipment_Sorted_By_Date() {
		// Implement your solution to get list of shipments
		List<Widget> testWidgets = WidgetUtils.getSampleWidgets().subList(0, 10);		
		Shipment shipmentDate = ShipmentUtil
				.createShipmentSortDate(testWidgets);
		List<Widget> shipmentWidgets = shipmentDate.getWidgets();
		assertTrue(shipmentWidgets.get(0).getProductionDate()
				.equals(WidgetUtils.stringToDateConverter("09-01-2005")) &&
				shipmentWidgets.get(1).getProductionDate()
				.equals(WidgetUtils.stringToDateConverter("01-01-2006")) &&
				shipmentWidgets.get(2).getProductionDate()
				.equals(WidgetUtils.stringToDateConverter("03-09-2006"))&&
				shipmentWidgets.get(9).getProductionDate()
				.equals(WidgetUtils.stringToDateConverter("06-02-2016")));				
	}

}

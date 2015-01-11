package com.padhai.oops.orielly;

public class FindGuitarTest {

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("1", "b1", "m1", "ty1", "bk1", "t1", 10.0);
	}

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar whatEriLikes = new Guitar("1", "b1", "m1", "ty1", "bk1", "t1",
				10.0);
		Guitar guitar = inventory.search(whatEriLikes);

		if (guitar != null) {
			System.out.println("Erin, you might like this: "
					+ guitar.getBuilder() + " " + guitar.getModel() + " "
					+ guitar.getType() + " guitar:\n " + guitar.getBackWood()
					+ " back and sides, \n " + guitar.getTopWood()
					+ " top.\n You can have it for only $" + guitar.getPrice()
					+ "!");
		} else {
			System.out.println("Sorry, Erin, we have nothing for you");
		}
	}
}

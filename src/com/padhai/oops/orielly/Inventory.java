package com.padhai.oops.orielly;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, String builder, String model,
			String type, String backWood, String topWood, double price) {
		Guitar guitar = new Guitar(serialNumber, builder, model, type,
				backWood, topWood, price);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public Guitar search(Guitar searchGuitar) {
		for (Guitar guitar : guitars) {

			String builder = searchGuitar.getBuilder();
			if ((builder != null)
					&& (!builder.equals("") && (!builder.equals(guitar
							.getBuilder())))) {
				/*
				 * continue terminates the rest of the processing of the code
				 * within the loop for the current iteration, but continues the
				 * loop.
				 */
				continue;
			}

			String model = searchGuitar.getModel();
			if ((model != null)
					&& (!model.equals("") && (!model.equals(guitar.getModel())))) {
				continue;
			}

			String type = searchGuitar.getType();
			if ((type != null)
					&& (!type.equals("") && (!type.equals(guitar.getType())))) {
				continue;
			}

			String topWood = searchGuitar.getTopWood();
			if ((topWood != null)
					&& (!topWood.equals("") && (!topWood.equals(guitar
							.getTopWood())))) {
				continue;
			}

			String backWood = searchGuitar.getBackWood();
			if ((backWood != null)
					&& (!backWood.equals("") && (!backWood.equals(guitar
							.getBackWood())))) {
				continue;
			}

			return guitar;
		}
		return null;
	}
}

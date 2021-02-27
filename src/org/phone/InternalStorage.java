package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("processorName - snapdragon");

	}
	private void ramSize() {
		System.out.println("ramSize - 6gb");

	}
	public static void main(String[] args) {
		InternalStorage is = new InternalStorage();
		is.processorName();
		is.ramSize();
		ExternalStorage es = new ExternalStorage();
		es.size();
	}

}

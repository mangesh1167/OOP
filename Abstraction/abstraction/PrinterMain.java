package com.abstraction;

public class PrinterMain {

	public static void main(String[] args) {
		Printer p1 = new InkjetPrinter();
		Printer p2 = new LaserPrinter();

		p1.print();
		p2.print();
	}
}

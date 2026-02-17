package com.multipleinhertance;

public class PaymentGateway implements UPIPayment, CardPayment {
	@Override
	public void payUsingUPI() {
		System.out.println("Pay through GooglePay...!");
	}

	@Override
	public void payUsingCard() {
		System.out.println("Pay through Card...!");
	}
}

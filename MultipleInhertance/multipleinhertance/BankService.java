package com.multipleinhertance;

class BankService implements LoanService, InsuranceService {

	public void applyLoan() {
		System.out.println("Loan applied");
	}

	public void applyInsurance() {
		System.out.println("Insurance applied");
	}

	public static void main(String[] args) {
		BankService b = new BankService();
		b.applyLoan();
		b.applyInsurance();
	}
}

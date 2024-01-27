package com.gentech.oopsConcepts;
class Bank {
	private int accountNo;
	private String bankName;
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo=accountNo;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.setAccountNo(11112222);
		b.setBankName("HDFC");
		String s = b.getBankName();
		int accNo = b.getAccountNo();
		System.out.println("Bank name: "+s+" "
				+ "account number: "+accNo);
	}
}

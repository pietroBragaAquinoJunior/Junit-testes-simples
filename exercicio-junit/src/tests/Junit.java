package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class Junit {

	@Test
	public void financingShouldBeCreatedWhenValidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		Assertions.assertEquals(totalAmount, f.getTotalAmount());
		Assertions.assertEquals(income, f.getIncome());
		Assertions.assertEquals(months, f.getMonths());
	}
	
	@Test
	public void financingShouldThrowExceptionWhenInvalidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 20;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(totalAmount, income, months);
		});
	}
	
	@Test
	public void financingSetTotalAmountShouldUpdateWhenValidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		f.setTotalAmount(70000.0);
		Assertions.assertEquals(f.getTotalAmount(), 70000.0);
	}
	
	@Test
	public void financingSetTotalAmountShouldThrowExceptionWhenInvalidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setTotalAmount(200000.0);
		});
	}
	
	@Test
	public void financingSetIncomeShouldUpdateWhenValidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		f.setIncome(70000.0);
		Assertions.assertEquals(f.getIncome(), 70000.0);
	}
	
	@Test
	public void financingSetIncomeShouldThrowExceptionWhenInvalidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setIncome(10.0);
		});
	}
	
	@Test
	public void financingSetMonthsShouldUpdateWhenValidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		f.setMonths(200);
		Assertions.assertEquals(f.getMonths(), 200);
	}
	
	@Test
	public void financingSetMonthsShouldThrowExceptionWhenInvalidInputs() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setMonths(2);
		});
	}
	
	@Test
	public void financingEntryMethodShouldBeCorrect() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		Assertions.assertEquals(f.entry(), 20000);
	}
	
	@Test
	public void financingQuotaMethodShouldBeCorrect() {
		double totalAmount = 100000;
		double income = 2000;
		int months = 80;
		Financing f = new Financing(totalAmount, income, months);
		double quota = (totalAmount - totalAmount*0.2)/months;
		Assertions.assertEquals(f.quota(), quota);
	}
	
}

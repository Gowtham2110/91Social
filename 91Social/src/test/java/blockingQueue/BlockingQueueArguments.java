package test.java.blockingQueue;

import java.time.LocalDate;

import main.converter.InputCriteriaConveter;

public class BlockingQueueArguments {

	private InputCriteriaConveter inputCriteriaConveter;
	private LocalDate date;

	public InputCriteriaConveter getInputCriteriaConveter() {
		return inputCriteriaConveter;
	}
	public void setInputCriteriaConveter(InputCriteriaConveter inputCriteriaConveter) {
		this.inputCriteriaConveter = inputCriteriaConveter;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}

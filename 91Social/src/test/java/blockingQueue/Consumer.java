package test.java.blockingQueue;

import java.time.LocalDate;
import java.util.concurrent.BlockingQueue;

import main.PricingEngine;
import main.converter.InputCriteriaConveter;

public class Consumer implements Runnable{

	private BlockingQueue<BlockingQueueArguments> sharedQueue;
	private Integer count;

	public Consumer(BlockingQueue<BlockingQueueArguments> sharedQueue, Integer count) {
		super();
		this.sharedQueue = sharedQueue;
		this.count = count;
	}

	@Override
	public void run() {
		int counter = 0;

		while(counter < count) {
			try {
				BlockingQueueArguments blockingQueueArguments = sharedQueue.take();
				PricingEngine pricingEngine = new PricingEngine();
				InputCriteriaConveter converter = blockingQueueArguments.getInputCriteriaConveter();
				LocalDate date = blockingQueueArguments.getDate();
				pricingEngine.calculateEnginePrices(converter, date);
				Thread.sleep(1000);
				counter++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

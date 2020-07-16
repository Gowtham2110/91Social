package test.java.blockingQueue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.converter.InputCriteriaConveter;

public class BlockingQueueTest {
	private final static Logger LOGGER = Logger.getLogger(BlockingQueueTest.class.getName());
	
	public static void main(String[] args) {
		BlockingQueue<BlockingQueueArguments> sharedQueue = new ArrayBlockingQueue<BlockingQueueArguments>(10);
				
		String[] arguments = args;
		if(arguments.length == 0) {
			arguments = new String[] 
				{ "Break,Fork,Pedal,Gear,ChainStay,toptube,saddle,spokes", "2020-10-02"};	
		}
		
		BlockingQueueArguments blockingQueueArguments = new BlockingQueueArguments();
		
		InputCriteriaConveter converter = new InputCriteriaConveter();
		String constituents = arguments[0];
		converter.convertInputCriteriaToModel(constituents);
		blockingQueueArguments.setInputCriteriaConveter(converter);
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(arguments[1], formatter);
			blockingQueueArguments.setDate(date);
			
		} catch(DateTimeParseException exception) {
			LOGGER.log(Level.SEVERE, "Date is not in YYYY-MM-DD format");
			LOGGER.log(Level.INFO, "Exiting");
			return;
		}
				
		int count = 100;
				
		Producer producer1 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread1 = new Thread(producer1);
		
		Consumer consumer1 = new Consumer(sharedQueue, count);
		Thread consumerThread1 = new Thread(consumer1);
		
		Producer producer2 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread2 = new Thread(producer2);
		
		Consumer consumer2 = new Consumer(sharedQueue, count);
		Thread consumerThread2 = new Thread(consumer2);
		

		Producer producer3 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread3 = new Thread(producer3);
				
		Consumer consumer3 = new Consumer(sharedQueue, count);
		Thread consumerThread3 = new Thread(consumer3);
		
		Producer producer4 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread4 = new Thread(producer4);
				
		Consumer consumer4 = new Consumer(sharedQueue, count);
		Thread consumerThread4 = new Thread(consumer4);
		
		Producer producer5 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread5 = new Thread(producer5);
				
		Consumer consumer5 = new Consumer(sharedQueue, count);
		Thread consumerThread5 = new Thread(consumer5);
		
		Producer producer6 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread6 = new Thread(producer6);
				
		Consumer consumer6 = new Consumer(sharedQueue, count);
		Thread consumerThread6 = new Thread(consumer6);
		
		Producer producer7 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread7 = new Thread(producer7);
				
		Consumer consumer7 = new Consumer(sharedQueue, count);
		Thread consumerThread7 = new Thread(consumer7);
		
		Producer producer8 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread8 = new Thread(producer8);
				
		Consumer consumer8 = new Consumer(sharedQueue, count);
		Thread consumerThread8 = new Thread(consumer8);
		
		Producer producer9 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread9 = new Thread(producer9);
				
		Consumer consumer9 = new Consumer(sharedQueue, count);
		Thread consumerThread9 = new Thread(consumer9);		
		
		Producer producer10 = new Producer(sharedQueue, blockingQueueArguments, count);
		Thread producerThread10 = new Thread(producer10);
				
		Consumer consumer10 = new Consumer(sharedQueue, count);
		Thread consumerThread10 = new Thread(consumer10);
		
		producerThread1.start();
		consumerThread1.start();
		
		producerThread2.start();
		consumerThread2.start();
		
		producerThread3.start();
		consumerThread3.start();
		
		producerThread4.start();
		consumerThread4.start();
		
		producerThread5.start();
		consumerThread5.start();
		
		producerThread6.start();
		consumerThread6.start();
		
		producerThread7.start();
		consumerThread7.start();
		
		producerThread8.start();
		consumerThread8.start();
		
		producerThread9.start();
		consumerThread9.start();
		
		producerThread10.start();
		consumerThread10.start();
	}
}

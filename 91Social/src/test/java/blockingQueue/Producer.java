package test.java.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	private BlockingQueue<BlockingQueueArguments> sharedQueue;
	private BlockingQueueArguments blockingQueueArguments;
	private Integer count;

	public Producer(BlockingQueue<BlockingQueueArguments> sharedQueue, BlockingQueueArguments arguments, Integer count) {
		super();
		this.sharedQueue = sharedQueue;
		this.blockingQueueArguments = arguments;
		this.count = count;
	}
	
	@Override
	public void run() {
		int counter = 0;

		while(counter < count) {
			try {
				sharedQueue.put(blockingQueueArguments);
				Thread.sleep(3000);
				counter++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

import java.ujtil.concurrent.BlockingQueue;

class Message{
	private String msg;
	public Message(String msg){
		this.msg = msg;
	}
	public String getMsg(){
		return this.msg;
	}
}

class Producer implements Runnable{
	private BlockingQueue<Message> queue;
	public Producer(BlockingQueue<Message> q)
	{
		this.queue = q;
	}

	@Override
	public void run(){
		for(int i=0; i<100; i++){
			Message msg = new Message("This is ID: "+i);
			try{
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced Process : "+ msg.getMsg());
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}


class Consumer implements Runnable{
	private BlockingQueue<Message> queue;
	public Consumer(BlockingQueue<Message> q)
	{
		this.queue = q;
	}

	@Override
	public void run(){
		try{
			Message msg;
			while((msg = queue.take()).getMsg() !="exit"){
				Thread.sleep(10);
				System.out.println("Consumed ID: " + msg.getMsg());
			}
		}
		catch(InterruptedException e){
			System.out.println(e.printStackTrace());
		}
	}
}


class ProducerConsumerService{
	public void runProducerConsumerService(){
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		new Thread(producer).start();
		new Thread(consumer).start();
		System.out.println("Producer_Consumer Service started.");
	}
}

class PetersonAlgorithm implements Lock{
	private final AtomicIntegerArray wantCS = new AtomicIntegerArray(2);
	private volatile int turn = 1;

	public void requestCS(int i){
		int j = 1-i;
		wantCS.set(i, 1);
		turn = j;
		while(wantCS.get(j)==1 && turn==j);
	}

	public void releaseCS(int i){
		wantCS.set(i, 0);
	}
}
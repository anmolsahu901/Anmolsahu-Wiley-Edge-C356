package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class A6RequestProcessor {
	//threadpool : group of worker threads that are waiting or the job and reused many times.
	
	// ExecutocrService : automatic provides pool of thread

	// threadgroup : provide collecting multiple thread into a single object
	
	//  Executor : components used for managing worker threads efficiently
	
	//ThreadFactory:An object that creates new threads on demand. Using thread factoriesremoves
	//  hardwiring of calls to new Thread,enabling applications to use special thread subclasses,
	//priorities, etc
	
	
	private ExecutorService threadPool;
	private ThreadGroup databaseThreadGroup;
	private ThreadGroup ReportThreadGroup;


	public A6RequestProcessor() {
		threadPool = Executors.newFixedThreadPool(10,new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				// TODO Auto-generated method stub
				return null;
			}

		});

		databaseThreadGroup = new ThreadGroup("Database Thread");
		ReportThreadGroup = new ThreadGroup("Report Thread");
	}

	public void processRequest(Request request) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				if(request.getType()==RequestType.DATABASE_QUERY);
				{
					//set thread to data base thread group
					Thread.currentThread().setThreadGroup(databaseThreadGroup);
					performDatabaseQuery(request);
				}
				else if(request.getType()==RequestType.REPORT_GENERATION)
				{
					Thread.currentThread().setThreadGroup(ReportThreadGroup);
					generateeport(request);
				}

			}};
			threadPool.submit(request);
	}

	void performDatabaseQuery(Request request) {
		// TODO Auto-generated method stub
		System.out.println("processing the database query request");
	}
	private void generateeport(Request request) {
		// TODO Auto-generated method stub
		System.out.println("processing the report generation query request");

	}

	public void shutdown() {
		threadPool.shutdown();
	}
	
	public static void main(String[] args) {

	}

}

enum RequestType{
	DATABASE_QUERY,
	REPORT_GENERATION
}

class Request{
	RequestType type;
	String data;
	public RequestType getType() {
		return type;
	}
	public void setType(RequestType type) {
		this.type = type;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}











package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class A6RequestProcessor {
	//threadpool : group of worker threadsthat are waiting or the joba nd reused many times.
	// threadgroup 
	// ExecutorService : automatic provides pool of thread
	//  Executotr : components used ofr mananging worker thrreads efficently
	// threadgroup : provide collecting multiple thread into a single object
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











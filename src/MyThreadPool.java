import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MyThreadPool {
	
	private List<Runnable>tasks;
	private ExecutorService executorService;
	
	
	public MyThreadPool() {
		tasks = new ArrayList<Runnable>();
		
		generateThreadPool();
	}
	
	public void generateThreadPool(){
		executorService = Executors.newCachedThreadPool();
		
	}

	public void addTask(Runnable runnable){
			tasks.add(runnable);
	}
	
	public void ExecuteMyThreads(){
	
		for (int i = 0; i < tasks.size(); i++) {
			executorService.execute(tasks.get(i));
		}
	}
	
	public int getTaskSize(){
		return tasks.size();
	}
	
	public Runnable getTask(int position){
		return tasks.get(position);
	}

}

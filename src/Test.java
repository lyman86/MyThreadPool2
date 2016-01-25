public class Test {
	public static void main(String[] args) {
		String url = "http://www.baidu.com";
		String url2 = "http://www.imooc.com/course/list?c=android";
		MyThreadPool myThreadPool = new MyThreadPool();
		Task task1 = new Task(url2);
		Task task2 = new Task(url);
		myThreadPool.addTask(task1);
		myThreadPool.addTask(task2);
		myThreadPool.ExecuteMyThreads();
		for (int i = 0; i < myThreadPool.getTaskSize(); i++) {
			((Task)myThreadPool.getTask(i)).setOnOnLoadListener(new OnLoadListener() {
				
				@Override
				public void loadSucess(String sucess) {
					System.out.println(sucess);
					
				}
				
				@Override
				public void loadFailed(String failed) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
	}
}

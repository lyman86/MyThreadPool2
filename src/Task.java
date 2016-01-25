public class Task implements Runnable{
	private String data;
	private String stringData;
	
    private OnLoadListener mListener;
	
	public void setOnOnLoadListener(OnLoadListener onLoadListener){
		mListener = onLoadListener;
	}
	public Task(String data) {
		this.data = data;
	}

	public void run() {
		UrlResponse urlResponse = new UrlResponse();
		stringData = urlResponse.getURLResponse(data);
		if (mListener!=null) {
			if (stringData!=null) {
				mListener.loadSucess(stringData);
			}else{
				mListener.loadFailed("失败");
			}
		}
		
	}

	
}
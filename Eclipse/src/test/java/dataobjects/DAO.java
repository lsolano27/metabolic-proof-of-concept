package dataobjects;

public class DAO {
	private String requestUrl;
	private String requestBrowser;

	public String getURL() {
		return requestUrl;
	}

	public void setURL(String url) {
		this.requestUrl = url;
	}

	public String getBrowser() {
		return requestBrowser;
	}			
				
	public void setBrowser(String browser) {
		this.requestBrowser = browser;
	}

}

package api;
import java.util.List;

public class ResultListDroneDynamics {
	public int count;
	public String next;
	public String previous;
	public List<DroneDynamics> results;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public List<DroneDynamics> getResults() {
		return results;
	}
	public void setResults(List<DroneDynamics> results) {
		this.results = results;
	}
	
}
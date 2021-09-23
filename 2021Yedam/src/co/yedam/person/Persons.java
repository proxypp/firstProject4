package co.yedam.person;

public class Persons {
	private String names;
	private int keys;
	private int weights;
	private String bloods;
	private int ages;
	
	public Persons(String names, int keys, int weights, String bloods, int ages) {
		this.names = names;
		this.keys = keys;
		this.weights = weights;
		this.bloods = bloods;
		this.ages = ages;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getKeys() {
		return keys;
	}
	public void setKeys(int keys) {
		this.keys = keys;
	}
	public int getWeights() {
		return weights;
	}
	public void setWeights(int weights) {
		this.weights = weights;
	}
	public String getBloods() {
		return bloods;
	}
	public void setBloods(String bloods) {
		this.bloods = bloods;
	}
	public int getAges() {
		return ages;
	}
	public void setAges(int ages) {
		this.ages = ages;
	}
	
	
}

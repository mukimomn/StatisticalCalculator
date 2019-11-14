package com.statisticalcalculator.CalcDTO;

public class SaveCalcDTO {
	
	private int calcID;
	private String date;
	private String setNumbers;
	private int count;
	private int maxVal;
	private int minVal;
	private int mean;
	private int median;
	private int mode;
	private int standDev;
	
	public int getCalcID()
	{
		return calcID;
	}
	
	public void setCalcID(int calcID) {
		this.calcID = calcID;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSetNumbers() {
		return setNumbers;
	}
	public void setSetNumbers(String setNumbers) {
		this.setNumbers = setNumbers;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMaxVal() {
		return maxVal;
	}
	public void setMaxVal(int maxVal) {
		this.maxVal = maxVal;
	}
	public int getMinVal() {
		return minVal;
	}
	public void setMinVal(int minVal) {
		this.minVal = minVal;
	}
	public int getMean() {
		return mean;
	}
	public void setMean(int mean) {
		this.mean = mean;
	}
	public int getMedian() {
		return median;
	}
	public void setMedian(int median) {
		this.median = median;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public int getStandDev() {
		return standDev;
	}
	public void setStandDev(int standDev) {
		this.standDev = standDev;
	}
	

}

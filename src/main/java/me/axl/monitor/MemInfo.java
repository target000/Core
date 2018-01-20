
package me.axl.monitor;

public class MemInfo {

    private int availableProcessors;
    private long freeMem;
    private long maxMem;

    public int getAvailableProcessors() {
	return availableProcessors;
    }

    public void setAvailableProcessors(int availableProcessors) {
	this.availableProcessors = availableProcessors;
    }

    public long getFreeMem() {
	return freeMem;
    }

    public void setFreeMem(long freeMem) {
	this.freeMem = freeMem;
    }

    public long getMaxMem() {
	return maxMem;
    }

    public void setMaxMem(long maxMem) {
	this.maxMem = maxMem;
    }

    public MemInfo() {
	availableProcessors = Runtime.getRuntime().availableProcessors();
	freeMem = Runtime.getRuntime().freeMemory();
	maxMem = Runtime.getRuntime().maxMemory();
    }

}

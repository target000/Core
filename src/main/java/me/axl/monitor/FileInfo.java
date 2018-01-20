package me.axl.monitor;

import java.io.File;

public class FileInfo {

    private String rootPath;
    private long rootAbsolutePath;
    private long rootFreeSpace;
    private long rootUsableSpace;

    public FileInfo() {
	File[] roots = File.listRoots();

	rootPath = roots[0].getAbsolutePath();
	rootAbsolutePath = roots[0].getTotalSpace();
	rootFreeSpace = roots[0].getFreeSpace();
	rootUsableSpace = roots[0].getUsableSpace();
    }

    public String getRootPath() {
	return rootPath;
    }

    public void setRootPath(String rootPath) {
	this.rootPath = rootPath;
    }

    public long getRootAbsolutePath() {
	return rootAbsolutePath;
    }

    public void setRootAbsolutePath(long rootAbsolutePath) {
	this.rootAbsolutePath = rootAbsolutePath;
    }

    public long getRootFreeSpace() {
	return rootFreeSpace;
    }

    public void setRootFreeSpace(long rootFreeSpace) {
	this.rootFreeSpace = rootFreeSpace;
    }

    public long getRootUsableSpace() {
	return rootUsableSpace;
    }

    public void setRootUsableSpace(long rootUsableSpace) {
	this.rootUsableSpace = rootUsableSpace;
    }

}

package edu.nefu.gdms.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public interface FileLoaderManager {
	
	public String saveFile(File file,String filename) throws IOException;
	
}

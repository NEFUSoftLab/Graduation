package edu.nefu.gdms.serviceImpl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import edu.nefu.gdms.service.FileLoaderManager;

public class FileLoaderManagerImpl implements FileLoaderManager{
	
	public String saveFile(File file,String filename) throws IOException{
		String realpath = ServletActionContext.getServletContext().getRealPath("/file");
        //D:\apache-tomcat-6.0.18\webapps\struts2_upload\images
        System.out.println("realpath: "+realpath);
        if (file != null) {
            File savefile = new File(new File(realpath), filename);
            if (!savefile.getParentFile().exists())
                savefile.getParentFile().mkdirs();
            FileUtils.copyFile(file, savefile);
           return "success";
        }
		
		return "fail";
	}
	
}

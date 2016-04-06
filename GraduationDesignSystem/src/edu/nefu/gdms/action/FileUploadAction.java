package edu.nefu.gdms.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.nefu.gdms.service.FileLoaderManager;
 
public class FileUploadAction extends ActionSupport {


    private File image; //上传的文件
    private String imageFileName; //文件名称
    private String imageContentType; //文件类型
    //结果
    private String execute;
    private FileLoaderManager fileLoaderManager;

    public String execute() throws Exception {
    	//限制文件格式
//    	String[] fileNameArray = imageFileName.split(".");
//    	System.out.println(imageFileName);
//    	for(String a:fileNameArray){
//    		System.out.println(a);
//    	}
//    	System.out.println(fileNameArray.length);
//    	String fileType = fileNameArray[fileNameArray.length-1];
//    	System.out.println(fileType);
    	
    	
        String execute = fileLoaderManager.saveFile(image,imageFileName);
        return "success";
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

	public String getExecute() {
		return execute;
	}

	public void setExecute(String execute) {
		this.execute = execute;
	}

	public FileLoaderManager getFileLoaderManager() {
		return fileLoaderManager;
	}

	public void setFileLoaderManager(FileLoaderManager fileLoaderManager) {
		this.fileLoaderManager = fileLoaderManager;
	}

    
}

package edu.nefu.gdms.support;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class Jsontool {
	public String toJson(List<?> list) {
		Gson gson=new Gson();
		return gson.toJson(list);
	}
	
}

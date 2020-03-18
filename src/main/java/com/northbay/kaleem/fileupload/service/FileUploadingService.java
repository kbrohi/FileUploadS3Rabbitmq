package com.northbay.kaleem.fileupload.service;

import java.io.File;
import java.io.IOException;

public class FileUploadingService {
	
	public static void readFiles() throws IOException {
		File file = new File(System.getProperty("user.dir") + "//");
		File[] files = file.listFiles();
		if (files != null && files.length > 0) {
			for (File f : files) {
				if (f.getName().contains(".txt")) {
					AmazonS3.uploadFileTos3bucket(f.getName(), f);
				}
			}
		}
	}

}

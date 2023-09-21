package com.itbank.component;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileComponent {

	private String SaveDirectory ="C:\\upload";
	
	public FileComponent() {
		File dir = new File(SaveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	
	public String upload(MultipartFile f) {
		String originalFileName = f.getOriginalFilename();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String filename = sdf.format(new Date())+"_"+originalFileName;
		File dest = new File(SaveDirectory, filename);
		try {
			f.transferTo(dest);
			return filename;
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void delete(String filename) {
		File dest = new File(SaveDirectory, filename);
		dest.delete();
		
	}
}

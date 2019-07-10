package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import model.Patient;

@Controller
public class FileUploadController {
	public static String name="";
	public static String uploadDirectory = System.getProperty("user.dir");
	@RequestMapping("/")
	public String UploadPage(Model model)
	{
		return "uploadview";
	}
	@RequestMapping("/upload")
	public String upload(Model model,@RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file : files) {
			Path fileNameAndPath = Paths.get(uploadDirectory,file.getOriginalFilename());
			//System.out.println(fileNameAndPath.toString());
			fileNames.append(file.getOriginalFilename()+" ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
			if(!file.isEmpty())
			{
				name=uploadDirectory+"\\"+file.getOriginalFilename();
				
			}
			System.out.println(name);
			
			}
		 System.out.println("Name outside"+name);
		 return "uploadstatusview";
	}
	
	@RequestMapping("/result")
	public @ResponseBody 
	Patient result() throws Exception
	{
		Filter filter=new Filter();
		String results[]=filter.filterPatientFromtheFile(name);
		return new Patient(results[0],results[1],results[2],results[3],results[4],results[5]);
	}
}

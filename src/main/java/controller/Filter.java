package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
@Controller
public class Filter {
	public  String[] filterPatientFromtheFile(String source) throws FileNotFoundException {
     
        File file = new File(source);
        Scanner sc = new Scanner(file);
        String result[]=new String[6];
        StringBuffer address = new StringBuffer();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String s[] = str.split(":");
            if (s[0].equals("Name")) {
                result[0]=s[1];
            }
            if (s[0].equals("Phone")) {
                result[4]=s[1];
            }
            if (s[0].equals("Mail")) {
                result[5]=s[1];
            }
            if (s[0].equals("Street Name")) {
                result[1]=s[1];
            }
            if (s[0].equals("City")) {
                result[2]=s[1];
            }
            if (s[0].equals("Postal Code")) {
            	result[3]=s[1];
            }
        }
        return result;
    }	
}



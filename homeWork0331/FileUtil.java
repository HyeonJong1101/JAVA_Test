package homeWork0331;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name;
	
	public FileUtil() {
		
	}
	
	public void operate(String name) throws IOException {
		
		File file = new File(name);
		System.out.println("\n==================================");
		System.out.println(file.getPath());
		System.out.println("==================================");
		
		File[] fileArr = file.listFiles();
		for(File i:fileArr) {
			if(i.isDirectory()) {
				System.out.println(i.getName()+"\t"+"<DIR>");
			}else {
				long lastTime = file.lastModified();
				String pattern = "yyyy-MM-dd-hh:mm:ss";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				System.out.println(i.getName()+"\t\t"+i.length()+"byte\t"+sdf.format(new Date(lastTime)));
			}
		}	
		
		this.name = name;
		select();
	}
	
	public void select() throws IOException {
		System.out.println("==================================");
		System.out.print("[c]새폴더\t[m]하위디렉토리이동[U]상위디렉토리이동[R]이름변경 (종료:X)==>");
		
		String s=br.readLine();
		switch(s) {
		case "c" :
			newfolder();
			break;
		case "m" :
			lowdi();
			break;
		case "U" :
			hidi();
			break;
		case "R" :
			rename();
			break;
		case "X" :
			System.exit(0);
		}
	}
	
	public void newfolder() throws IOException {
		File file = new File(name);
		
		System.out.print("디렉토리 이름 : ");
		String s = br.readLine();
		File newf = new File(file.getPath() + '/' + s);
		newf.mkdir(); 
		
		operate(name);
	}
	
	public void lowdi() throws IOException {
		System.out.print("디렉토리 선택 : ");
		String s = name+"/"+br.readLine();
		
		operate(s);
	}

	
	public void hidi() throws IOException {
		File high = new File(name); 
		if(high.getParent() != null) {
			operate(high.getParent());
		} else {
			System.out.println("디렉토리가 없습니다.");
		}
	}
	
	public void rename() throws IOException {
		System.out.print("디렉토리 선택 : ");
		String old = br.readLine();
		File oldn = new File(name+"/"+old); 
		
		System.out.print("이름변경 : ");
		String re = br.readLine();
		File rename = new File(name+"/"+re); 
		
		boolean result = oldn.renameTo(rename); 
		if(result) {
			System.out.println("변경완료");
		} else {
			System.out.println("변경실패");
			
		}
		operate(name);
	}
}

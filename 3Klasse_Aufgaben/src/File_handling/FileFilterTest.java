package File_handling;

import java.io.File;
//import java.io.FilenameFilter;
import java.sql.Date;

public class FileFilterTest {
	
	public static void main(String[] args) {	
		File f = new File("C://tmp/");
		
		
//		String[] r2 = f.list(new FilenameFilter() {	
//			@Override
//			public boolean accept(File dir, String name) {
//				return name.endsWith(".class");
//			}
//		});
			
		// Lambda Expression
		String[] r3 = f.list( (file, name) -> {return name.endsWith(".txt");} );
		
		for (String s : r3)
		{
			System.out.println(s);
		}
		File f1 = new File("C://tmp/");

		File[] contents = f1.listFiles();

		for (int i = 0; i < contents.length; i++) {
			double size = contents[i].length() / 1024;

			long lastModified = contents[i].lastModified();
			Date date = new Date(lastModified);
  
			String[] p =contents[i].getName().split(".");
			String extension = "";
			if (p.length > 1)
			{
				//String extension = contents[i].toPath().toString().substring(contents[i].toString().indexOf("."));
				extension = p[p.length-1];
			}
			ausgabe(contents, i, size, date, extension);
		}
		System.out.printf("Amount of Files in the Directory: %d", contents.length);
	}

	private static void ausgabe(File[] contents, int i, double size, Date date, String extension) {
		System.out.printf("Name: %s%n", contents[i].getName());
		System.out.printf("Path: %s%n", contents[i].getAbsolutePath());
		System.out.printf("Extension: %s%n", extension);
		System.out.printf("Date: %s%n", date);
		System.out.printf("Size: %s kb%n", size);
		System.out.println();
		System.out.println();
	}
}
	
	
	




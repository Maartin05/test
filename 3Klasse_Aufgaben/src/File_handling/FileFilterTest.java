package File_handling;

import java.io.File;
//import java.io.FilenameFilter;

public class FileFilterTest {

//	static class MyFileNameFilterInner implements FilenameFilter {
//
//		@Override
//		public boolean accept(File dir, String name) {
//			return name.endsWith(".class");
//		}
//
//	}
	
	public static void main(String[] args) {
		File f = new File("C://tmp/");
//		String[] r = f.list(new MyFileNameFilterInner());
//		//String[] r = f.list();
//		
//		
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
	}

}

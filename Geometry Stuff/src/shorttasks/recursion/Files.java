package shorttasks.recursion;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.HashCodeExclude;

public class Files {

	public static void main(String[] args) {

		File root = new File("C:\\Program Files\\CDBurnerXP");
		List<File> txtFiles = collectFiles(root);

		System.out.println(txtFiles.size());
		
	}
	
	static List<File> collectFiles(File dir) {
		List<File> list = new ArrayList<>();
		File[] subDirPaths = dir.listFiles();
		for (File path : subDirPaths) {
//			System.out.println(path);
			if(path.isFile() && hasExtension(path, "dll")) {
//				System.out.println(path);
				list.add(path);
			}
			else if	(path.isDirectory()) {
				List<File> files = collectFiles(path);
				list.addAll(files);
			}
		}
		
		return list;
	}
	
	static boolean hasExtension(File file, String ext) {
		String fileName = file.getName();
		return fileName.endsWith("." + ext);
	}

}

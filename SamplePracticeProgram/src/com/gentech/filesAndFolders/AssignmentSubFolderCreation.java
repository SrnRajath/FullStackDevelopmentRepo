package com.gentech.filesAndFolders;

import java.io.File;

public class AssignmentSubFolderCreation {
	static void createSubFolder(String directory, String folder) {
		File dir = new File(directory);
		if(!dir.exists()) {
			dir.mkdir();
		}
		File subFolder = new File(directory + File.separator + folder);
		if(!subFolder.exists()) {
			subFolder.mkdir();
			System.out.println("Subfolder created: "+folder);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "../../../../ProgrammedDirectory";
		for(int i=1; i<=10; i++) {
			createSubFolder(dirPath, "ProgramSubFolder"+i);
		}
		System.out.println("all sub folders created");
	}

}

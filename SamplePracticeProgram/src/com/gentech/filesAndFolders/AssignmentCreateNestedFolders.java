package com.gentech.filesAndFolders;

import java.io.File;

public class AssignmentCreateNestedFolders {
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
	
	// Method to display all nested folders recursively
    public static void displayNestedFolders(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            System.out.println("Nested folders in " + directory.getAbsolutePath() + ":");
            displayNestedFoldersRecursive(directory);
        } else {
            System.out.println(directoryPath + " is not a directory.");
        }
    }

    // Recursive method to display nested folders
    private static void displayNestedFoldersRecursive(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getAbsolutePath());
                    displayNestedFoldersRecursive(file);
                }
            }
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "../../../../ProgrammedDirectory";
		for(int i=1; i<=10; i++) {
			createSubFolder(dirPath, "NestedSubFolder"+i);
			dirPath+=File.separator+"NestedSubFolder"+i;
		}
		System.out.println("all sub folders created");
		displayNestedFolders("../../../../ProgrammedDirectory");

	}

}

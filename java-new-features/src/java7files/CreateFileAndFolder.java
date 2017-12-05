package java7files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO Java7新特性创建一个新的文件夹和文件
 * 
 * @author 寇爽
 * @date 2017年11月28日
 * @version 1.8
 */
public class CreateFileAndFolder {
	/*
	 * 在调用createFile方法时，如果想要创建的文件已经存在，FileAlreadyExistsException会被抛出。
	 * createFile和createDirectory这个两个方法都是原子性的，即要不整个操作都能成功或者整个操作都失败。
	 */ public static void main(String[] args) {

		try {

			Path directoryPath = Paths.get("D:/home/sample");
			Files.createDirectory(directoryPath);
			System.out.println("Directory created successfully!");
			Path filePath = Paths.get("D:/home/sample/test.txt");
			Files.createFile(filePath);
			System.out.println("File created successfully!");
			Path directoriesPath = Paths.get("D:/home/sample/subtest/subsubtest");
			System.out.println("Sub-directory created successfully!");
			Files.createDirectories(directoriesPath);

		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

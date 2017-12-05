package java7files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO Java7�����Դ���һ���µ��ļ��к��ļ�
 * 
 * @author ��ˬ
 * @date 2017��11��28��
 * @version 1.8
 */
public class CreateFileAndFolder {
	/*
	 * �ڵ���createFile����ʱ�������Ҫ�������ļ��Ѿ����ڣ�FileAlreadyExistsException�ᱻ�׳���
	 * createFile��createDirectory���������������ԭ���Եģ���Ҫ�������������ܳɹ���������������ʧ�ܡ�
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

package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * TODO Files��copy()����ʵ���ļ�����
 * 
 * @author ��ˬ
 * @date 2017��11��28��
 * @version 1.8
 */
public class CopeFile {

	public static void main(String[] args) {

		Path newFile = Paths.get("D:/home/sample/newFile.txt");
		Path copiedFile = Paths.get("D:/home/sample/copiedFile.txt");
		Path originalDirectory = Paths.get("D:/home/sample");
		Path newDirectory = Paths.get("D:/home/sample/tmp");

		try {

			Files.createFile(newFile);
			System.out.println("File created successfully!");

			Files.copy(newFile, copiedFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File copied successfully!");

			Files.copy(originalDirectory, newDirectory);
			System.out.println("Directory copied successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

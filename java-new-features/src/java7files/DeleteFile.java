package java7files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *TODO 删除文件
 * @author 寇爽
 * @date 2017年11月28日
 * @version 1.8
 */
public class DeleteFile {

	public static void main(String[] args) {

		try {

			Path sourceFile = Paths.get("D:/home/projects/note_bak1.txt");
			boolean result = Files.deleteIfExists(sourceFile);
			if (result) {
				System.out.println("File deleted successfully!");
			}

			sourceFile = Paths.get("D:/home/projects/note_bak2.txt");
			Files.delete(sourceFile);
			System.out.println("File deleted successfully!");

		} catch (NoSuchFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFile {

	public static void main(String[] args) {

		try {

			Path sourceFile = Paths.get("D:/home/sample/projects/note.txt");
			Path destinationFile = Paths.get("D:/home/sample/note.txt");
			Files.move(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);

			System.out.println("File moved successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

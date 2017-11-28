package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TemporaryFile {

	public static void main(String[] args) {

		try {

			Path rootDirectory = Paths.get("D:/home/sample");
			Path tempDirectory = Files.createTempDirectory(rootDirectory, "");

			System.out.println("Temporary directory created successfully!");
			String dirPath = tempDirectory.toString();
			System.out.println(dirPath);

			Path tempFile = Files.createTempFile(tempDirectory, "", "");

			System.out.println("Temporary file created successfully!");
			String filePath = tempFile.toString();
			System.out.println(filePath);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

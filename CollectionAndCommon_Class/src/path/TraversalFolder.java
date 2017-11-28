package path;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *TODO 遍历一个文件夹
 * @author 寇爽
 * @date 2017年11月28日
 * @version 1.8
 */
public class TraversalFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path dir = Paths.get("D:/home/sample");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path e : stream) {
				System.out.println(e.getFileName());
			}
		} catch (IOException e) {

		}
	}

}

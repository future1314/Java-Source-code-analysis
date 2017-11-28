package path;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *TODO ����һ���ļ���
 * @author ��ˬ
 * @date 2017��11��28��
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

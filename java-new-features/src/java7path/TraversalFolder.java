package java7path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * TODO 遍历一个文件夹
 * 
 * @author 寇爽
 * @date 2017年11月28日
 * @version 1.8
 */
public class TraversalFolder {
	//遍历单个目录，它不会遍历整个目录。遍历整个目录需要使用：Files.walkFileTree
	public static void main(String[] args) {
		// 方式一
		/*
		 * Path dir = Paths.get("D:/home/sample"); try (DirectoryStream<Path>
		 * stream = Files.newDirectoryStream(dir)) { for (Path e : stream) {
		 * System.out.println(e.getFileName()); } } catch (IOException e) { }
		 */
		// 方式二：
		try (Stream<Path> stream = Files.list(Paths.get("D:/home/sample"))) {
			Iterator<Path> ite = stream.iterator();
			while (ite.hasNext()) {
				Path pp = ite.next();
				System.out.println(pp.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

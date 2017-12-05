package java7path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;

/**
 *TODO 遍历整个文件目录：
 * @author 寇爽
 * @date 2017年11月28日
 * @version 1.8
 */
public class TraversalWholeFolder {

	public static void main(String[] args) throws IOException {
		Path startingDir = Paths.get("D:/apache-tomcat-9.0.0.M17");
		List<Path> result = new LinkedList<Path>();
		Files.walkFileTree(startingDir, new FindJavaVisitor(result));
		System.out.println("result.size()=" + result.size());
		System.out.println(result);
	}

	private static class FindJavaVisitor extends SimpleFileVisitor<Path> {
		private List<Path> result;

		public FindJavaVisitor(List<Path> result) {
			this.result = result;
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			if (file.toString().endsWith(".java")) {
				result.add(file.getFileName());
			}
			return FileVisitResult.CONTINUE;
		}
	}
}

package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttribute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("D:/home/sample/projects/note.txt");
		//获取文件最后修改时间
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.size(path));
		//测试一个文件是否是一个符号链接。
		System.out.println(Files.isSymbolicLink(path));
		//测试文件是否为目录
		System.out.println(Files.isDirectory(path));
		// 读取一组文件属性作为批量操作
		// "*" Read all basic-file-attributes.
		System.out.println(Files.readAttributes(path, "*"));
	}

}

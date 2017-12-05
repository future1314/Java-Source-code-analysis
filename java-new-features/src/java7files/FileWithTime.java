package java7files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;

/**
 *TODO   Files类还提供了一些方法，方便我们修改那些文件本身和时间相关的属性。 
 * @author 寇爽
 * @date 2017年11月28日
 * @version 1.8
 */
public class FileWithTime {

	public static void main(String[] args) {

		try {

			Path path = Paths.get("D:/home/sample/projects/note.txt");

			BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

			FileTime lastModifiedTime;
			FileTime lastAccessTime;
			FileTime createTime;

			BasicFileAttributes attributes = view.readAttributes();

			lastModifiedTime = attributes.lastModifiedTime();
			createTime = attributes.creationTime();

			long currentTime = Calendar.getInstance().getTimeInMillis();
			lastAccessTime = FileTime.fromMillis(currentTime);

			view.setTimes(lastModifiedTime, lastAccessTime, createTime);
			System.out.println(attributes.lastAccessTime());

			Files.setLastModifiedTime(path, lastModifiedTime);
			System.out.println(Files.getLastModifiedTime(path));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

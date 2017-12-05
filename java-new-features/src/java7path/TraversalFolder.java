package java7path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * TODO ����һ���ļ���
 * 
 * @author ��ˬ
 * @date 2017��11��28��
 * @version 1.8
 */
public class TraversalFolder {
	//��������Ŀ¼���������������Ŀ¼����������Ŀ¼��Ҫʹ�ã�Files.walkFileTree
	public static void main(String[] args) {
		// ��ʽһ
		/*
		 * Path dir = Paths.get("D:/home/sample"); try (DirectoryStream<Path>
		 * stream = Files.newDirectoryStream(dir)) { for (Path e : stream) {
		 * System.out.println(e.getFileName()); } } catch (IOException e) { }
		 */
		// ��ʽ����
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

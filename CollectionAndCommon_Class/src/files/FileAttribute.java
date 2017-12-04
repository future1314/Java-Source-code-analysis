package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttribute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("D:/home/sample/projects/note.txt");
		//��ȡ�ļ�����޸�ʱ��
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.size(path));
		//����һ���ļ��Ƿ���һ���������ӡ�
		System.out.println(Files.isSymbolicLink(path));
		//�����ļ��Ƿ�ΪĿ¼
		System.out.println(Files.isDirectory(path));
		// ��ȡһ���ļ�������Ϊ��������
		// "*" Read all basic-file-attributes.
		System.out.println(Files.readAttributes(path, "*"));
	}

}

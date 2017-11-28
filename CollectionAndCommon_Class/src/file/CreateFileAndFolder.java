package file;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *TODO Java7新特性创建一个新的文件夹和文件
 * @author 寇爽
 * @date 2017年11月28日
 * @version 1.8
 */
public class CreateFileAndFolder {

    public static void main(String[] args) {  
        
        try {  
      
            Path directoryPath = Paths.get("D:/home/sample");  
            Files.createDirectory(directoryPath);  
            System.out.println("Directory created successfully!");        
            Path filePath = Paths.get("D:/home/sample/test.txt");  
            Files.createFile(filePath);  
            System.out.println("File created successfully!");  
            Path directoriesPath = Paths.get("D:/home/sample/subtest/subsubtest");  
            System.out.println("Sub-directory created successfully!");  
            Files.createDirectories(directoriesPath);  
      
        } catch (FileAlreadyExistsException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

}

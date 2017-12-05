package java7files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author qiang.xie
 * @date 2017/4/7
 */
public class SeekChannal {

    public static void main(String[] arg) throws IOException {
        FileChannel fileChannel=FileChannel.open(Paths.get("D:/home/sample/projects/note.txt"),StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
        fileChannel.write(ByteBuffer.wrap("hello,java".getBytes()));
        fileChannel.position(0);//定位到文件开头
        fileChannel.write(ByteBuffer.wrap("seek".getBytes()));
        fileChannel.position(fileChannel.size());//定位到文件末尾
        fileChannel.write(ByteBuffer.wrap("end".getBytes()));

        //将通道中的指定位置开始的内容传输到另一个通道中，这里传输到控制台
       fileChannel.transferTo(1,fileChannel.size(),Channels.newChannel(System.out));
    }
}



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
        fileChannel.position(0);//��λ���ļ���ͷ
        fileChannel.write(ByteBuffer.wrap("seek".getBytes()));
        fileChannel.position(fileChannel.size());//��λ���ļ�ĩβ
        fileChannel.write(ByteBuffer.wrap("end".getBytes()));

        //��ͨ���е�ָ��λ�ÿ�ʼ�����ݴ��䵽��һ��ͨ���У����ﴫ�䵽����̨
       fileChannel.transferTo(1,fileChannel.size(),Channels.newChannel(System.out));
    }
}



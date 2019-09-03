package Interview;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author YanQiKing
 * @date 2019/9/3 10:13
 */
public class NIOCopyFIle {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        FileChannel inchannel = null;
        FileChannel outchannel = null;

        try {
            fileInputStream = new FileInputStream("D:/1.png");
            fileOutputStream = new FileOutputStream("2.png");

            //1、获取通道
             inchannel = fileInputStream.getChannel();
             outchannel = fileOutputStream.getChannel();
            //2、分配指定大小的缓冲区
            ByteBuffer buf = ByteBuffer.allocate(1024);
            while (inchannel.read(buf) != -1){
                buf.flip();
                outchannel.write(buf);
                buf.clear();
            }
        }catch (IIOException e){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outchannel != null) {
                try {
                    outchannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inchannel != null) {
                try {
                    inchannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

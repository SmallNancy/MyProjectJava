package Interview;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author YanQiKing
 * @date 2019/9/3 10:38
 * 直接缓冲区完成文件复制
 */
public class DirectChannle {
    public static void main(String[] args) throws IOException {
        FileChannel inchannel = FileChannel.open(Paths.get("D:/1.png"), StandardOpenOption.READ);
        FileChannel outchannel = FileChannel.open(Paths.get("3.png"),StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE_NEW);

        outchannel.transferTo(0,inchannel.size(),outchannel);
//        MappedByteBuffer inBuffer = inchannel.map(FileChannel.MapMode.READ_ONLY,0,inchannel.size());
//        MappedByteBuffer outBuffer = outchannel.map(FileChannel.MapMode.READ_WRITE,0,inchannel.size());


//        byte[] dst = new byte[inBuffer.limit()];
//        inBuffer.get(dst);
//        outBuffer.put(dst);
        inchannel.close();
        outchannel.close();
    }
}

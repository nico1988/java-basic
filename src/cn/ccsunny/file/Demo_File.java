package src.cn.ccsunny.file;

import java.io.File;
import java.io.IOException;

public class Demo_File {
    public static void main(String[] args) throws IOException {
        System.out.println("1");
        File file = new File("/home/nico/java/heima/java-basic/src/cn/ccsunny/exception/Demo1_Exception.java");
        boolean s = file.exists();
        System.out.println(s);
        File file1 = new File("111.txt");
        file1.createNewFile();
        File file2 = new File("222.txt");
        System.out.println(file1.renameTo(file2));
        File file3 = new File("aaa/bbb");
        file3.mkdirs();
        File file4 = new File("ddd");
        file4.mkdir();
//        file4.delete();
        System.out.println(file4.exists());
        System.out.println(file4.canRead());
        file4.setReadable(true);
        System.out.println(file4.canRead());
    }

}

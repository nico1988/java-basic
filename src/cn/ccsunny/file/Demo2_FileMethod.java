package src.cn.ccsunny.file;

import java.io.File;
import java.io.IOException;

public class Demo2_FileMethod {
    public static void main(String[] args) throws IOException {
//        File file = new File("yyy.txt");
//        System.out.println(file.createNewFile());
//        File file2 = new File("bbb.txt");
//        System.out.println(file2.createNewFile());
//        // mkdir
//        File dir = new File("aaa");
//        System.out.println(dir.mkdir());
        // mkdirs
        File dirs = new File("nico/bbb");
        System.out.println(dirs.mkdirs());

    }
}

package src.cn.ccsunny.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {
    public static void main(String[] args){
        File file = new File("222.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath()); // 获取构造方法的路径
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.lastModified());
        Date d = new Date(file.lastModified());
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月");
        System.out.println(sdf.format(file.lastModified()));;
        // 获取文件数组
        File dir = new File("/home/nico/java/heima/java-basic");
        String[] arr = dir.list();
        for (String string:arr) {
            System.out.print(string+',');
        }
        File[] files = dir.listFiles();
        for (File file99 : files) {
            System.out.println(file99);

        }

        // 判断文件
        System.out.println("==================判断文件=====================");
        File file8 = new File("/home/nico/java/heima/java-basic");
        String[] dirs = file8.list();
        for (String file88 : dirs) {
            if (file88.endsWith(".txt")) {
                System.out.println(file88);
            }
        }

    }
}

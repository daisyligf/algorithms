package leetcode.DivideTwoIntegers;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * Created by daisyli on 2017/4/4.
 */
public abstract class Daisy2 {
    abstract void test();
    void test2() {
        System.out.println();
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
    }
    Daisy2(){
        System.out.println("haha");
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < 11; i++) {
//            list.add(1);
//        }
//        System.out.println(list.size());
//        Object obj = new Object();
        String fileName = "/tmp/test";
        String str = "不对";

        try {
            Daisy2.readFile(fileName, str);
        } catch (Exception e ) {
            System.out.println(e);
        }
    }

    /**
     * 写一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数。
     */
    public static void readFile(String fileName, String str) throws Exception {
        File file = new File(fileName);
        if (!file.isFile() || !file.exists()) {
            throw new FileNotFoundException("file name is :" + fileName);
        }

        InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file));
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        String line = null;

        int hits = 0;

        while( (line = bufferedReader.readLine()) != null ) {
            int fromIndex = 0;
            StringBuffer sb = new StringBuffer(line);
            while((fromIndex = sb.indexOf(str, fromIndex)) > -1 ) {
                hits++;
                sb.delete(fromIndex, fromIndex + str.length());
            }
        }

    }


}

package org.hadoop.run;

import org.hadoop.files.Files;
import org.hadoop.mrs.wordcount.WordCountRun;

/**
 * @ClassName RunHadoop
 * @Author yuanchun
 * @Description //TODO $
 * @Date $ $
 **/
public class RunHadoop
{
    public static void main(String[] args){
        //TODO 这里写运行mapperReduce的方法
        //创建目录
//        String folderName = "/test";
//        Files.mkdirFolder(folderName);
        WordCountRun.Run();
    }
}

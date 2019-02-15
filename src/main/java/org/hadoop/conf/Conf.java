package org.hadoop.conf;

import org.apache.hadoop.conf.Configuration;

/**
 * 获得hadoop连接配置
 * Created by shirukai on 2017/11/8.
 */
public class Conf {
    public static Configuration get (){
        //hdfs的链接地址
        String hdfsUrl = "hdfs://drmcluster";
        //hdfs的名字
        String hdfsName = "fs.defaultFS";
        //jar包文位置(上一个步骤获得的jar路径)
        String jarPath = "E:\\IdeaWorkSpace\\hadoop-mr\\out\\artifacts\\hadoop_mr_jar\\hadoop-mr.jar";

        Configuration conf = new Configuration();
        conf.set(hdfsName,hdfsUrl);
        conf.set("mapreduce.app-submission.cross-platform", "true");
        conf.set("mapreduce.job.jar",jarPath);
        return conf;
    }
}
package xyz.nanfeng.fast.test;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class cc {
    public static void main(String[] args) throws IOException, MyException {
        ClientGlobal.initByProperties("fastdfs-client.properties");
        TrackerClient trackerClient=new TrackerClient();
        TrackerServer connection = trackerClient.getConnection();
        StorageServer storeStorage = trackerClient.getStoreStorage(connection);
        StorageClient1 storageClient1 = new StorageClient1(connection, storeStorage);
        String fileid="group1/M00/00/00/wKhXhV6jKySAfNT4AAB9tyt59KU17.jpeg";
        byte[] bytes = storageClient1.download_file1(fileid);
        FileOutputStream fileOutputStream=new FileOutputStream(new File("f:/lemon.jpeg"));
        fileOutputStream.write(bytes);

    }
}

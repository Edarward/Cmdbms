package com.cmdbms.util;

import net.coobird.thumbnailator.Thumbnails;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class UpLoadPicture {

    //"/www/server/tomcat/webapps/pics/"

    private String filePath ="D:/OTA/";

    private String DomainName = "http://127.0.0.1:8080";

    @Transactional
    public String upload(MultipartFile file) {

        //file.isEmpty(); 判断图片是否为空
        //file.getSize(); 图片大小进行判断
        //String token =request.getParameter("token");
        if (file.isEmpty()) {
            throw new NullPointerException("文件为空");
        }
        //获取文件名
        String fileName = file.getOriginalFilename();

        // 获取文件的后缀名,比如图片的jpeg,pn
        String lastName = fileName.substring(fileName.lastIndexOf("."));

        // 文件上传后的路径
        String longName = new SimpleDateFormat("yyyyMMddHHmmss")
                .format(new Date())
                + System.currentTimeMillis()
                + lastName;

        String finallyPath = filePath + longName;

        File dest = new File(finallyPath);

        try {
            file.transferTo(dest);
            Thumbnails.of(dest).scale(1f).outputQuality(0.5f).toFile(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //存储地址
        String url = DomainName+"/api/image/"+longName;

        return url;
    }
}

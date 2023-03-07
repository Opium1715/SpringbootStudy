package com.springboot.zq.servicce.impl;

import com.springboot.zq.mapper.ProductMapper;
import com.springboot.zq.servicce.FileService;
import com.sun.istack.internal.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
@Service
@Slf4j
public class FileServiceImpl implements FileService {
    @Autowired
    ProductMapper productMapper;
    /**
     * @methodname FileUpload
     *
     * @param contextPath
     * @param file
     * @return boolean if successfully upload the extinct file then return true,
     *      otherwise return false
     * @author QiZhang
     * @description 文件上传服务
     * @create 2023/3/7
     **/
    @Override
    public boolean FileUpload(@NotNull String contextPath, @NotNull MultipartFile file) {
        try {
            String originalFileName = file.getOriginalFilename();
            assert originalFileName != null;
            String fileSuffix = originalFileName.substring(originalFileName.lastIndexOf("."));
            String fileName = UUID.randomUUID()+fileSuffix;
            File savefile = new File(contextPath);
            if (!savefile.exists()){
                boolean mkdir = savefile.mkdirs();
                if (mkdir) log.info("创建文件夹成功");
            }
            String finalPath = contextPath + File.separator + fileName;
            file.transferTo(new File(finalPath));
            log.info("文件上传完成");
            return true;
        }catch (IOException e){
            log.info("服务器内部错误，文件上传失败");
            return false;
        }
    }

    /**
     * @methodname FileDownload
     *
     * @param productId
     * @return java.lang.String return image of specific product,if it is existed then return the URL, otherwise false
     * @author QiZhang
     * @description 返回商品图片URL
     * @create 2023/3/7
     **/
    @Override
    public String FileDownload(Integer productId){
        //暂时这样，后面商讨再改
        return productMapper.selectImgPathByPrimaryKey(productId);
    }
}

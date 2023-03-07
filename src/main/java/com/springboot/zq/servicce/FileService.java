package com.springboot.zq.servicce;

import com.sun.istack.internal.NotNull;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    boolean FileUpload(@NotNull String contextPath, @NotNull MultipartFile file);

    String FileDownload(Integer productId);
}

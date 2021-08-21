package com.jmm.blog.config;

import com.jmm.blog.common.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jmm
 * @version 1.0
 * @date 2021/3/31 11:05
 * @email 2867405686@qq.com
 */
@Configuration
public class BlogWebMvcConfigurer implements WebMvcConfigurer {

    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + Constants.FILE_UPLOAD_DIC);
        registry.addResourceHandler("/img/**").addResourceLocations("file:" + Constants.FILE_IMG_DIC);
        registry.addResourceHandler("/mov/**").addResourceLocations("file:" + Constants.FILE_MOV_DIC);
    }
}

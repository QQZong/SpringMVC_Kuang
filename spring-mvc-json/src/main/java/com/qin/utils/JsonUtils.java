package com.qin.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;


/*json解析工具*/
public class JsonUtils {
    /*重载*/
    public static String getJson(Object o){
        return getJson(o,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object o,String dateFormat){
        ObjectMapper mapper = new ObjectMapper();
        /*不使用时间搓的方式*/
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        /*自定义时间格式*/
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        mapper.setDateFormat(format);
        try {
            return mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}

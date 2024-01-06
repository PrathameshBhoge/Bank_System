package com.bootcoding.utils.split;

import com.bootcoding.Exception.InvalidDateException;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    @SneakyThrows
    public static Date convertToDate(String datestr) throws  Exception {
        if(StringUtils.isEmpty(datestr) || StringUtils.containsIgnoreCase(datestr,"nan")){
            throw new InvalidDateException("Invalid date Entered");
        }
        SimpleDateFormat  sf = new SimpleDateFormat("dd/MM/yy");
        Date date = sf.parse(datestr);
        System.out.println(date);
        return date;
    }



}

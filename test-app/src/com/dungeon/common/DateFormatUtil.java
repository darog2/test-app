package com.dungeon.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
    public static final SimpleDateFormat REPORT_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    public static final SimpleDateFormat REPORT_NAME_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy HH-mm-ss");
    public static Date getDateFromString(String date)  {
        try {
            return REPORT_DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String getStringFromDate(Date date){
        return REPORT_DATE_FORMAT.format(date);
    }
    public static String formatDateAsReportNamePart(Date date){
        return REPORT_NAME_DATE_FORMAT.format(date);
    }

}

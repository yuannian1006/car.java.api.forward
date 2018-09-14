package com.jsxsdqc.utils;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 */
public class LoggerUtil {

    private static Logger logger = LogManager.getLogger(LoggerUtil.class.getName());

    public static Gson gson = new Gson();

    public static void printInfo(String msg, String module, String category,
                                 String subcategory, String filter1, String filter2, Map<String, String> extraInfo) {

        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(category)) {
            category = "";
        }

        if (StringUtil.isBlank(subcategory)) {
            subcategory = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

//        String extra = "";
        if (extraInfo != null) {
//            extra = gson.toJson(extraInfo);
//            logger.info("[" + module + "][" + category + "][" + subcategory
//                    + "][" + filter1 + "][" + filter2 + "] " + msg + " extraInfo:" + extra);
            Map<String, String> mapmsg = new HashMap<String, String>(8);
            mapmsg.put("msg", msg);
            mapmsg.put("extraInfo", gson.toJson(extraInfo));
//            extra = gson.toJson(extraInfo);
            logger.info("[" + module + "][" + category + "][" + subcategory
                    + "][" + filter1 + "][" + filter2 + "] " + gson.toJson(mapmsg));
        } else {
            logger.info("[" + module + "][" + category + "][" + subcategory
                    + "][" + filter1 + "][" + filter2 + "] " + msg);
        }

    }

    public static void printInfo(String msg, String module, String filter1, String filter2) {

        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        try {
            logger.info("[" + module + "][][][" + filter1 + "][" + filter2 + "] " + msg);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }

    }

    public static void printError(String msg, String module, String category,
                                  String subcategory, String filter1, String filter2, Exception ex) {

        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(category)) {
            category = "";
        }

        if (StringUtil.isBlank(subcategory)) {
            subcategory = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.error("[" + module + "][" + category + "][" + subcategory
                + "][" + filter1 + "][" + filter2 + "] " + msg, ex);

    }

    public static void printError(String msg, String module, String filter1, String filter2, Exception ex) {
        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.error("[" + module + "][][][" + filter1 + "][" + filter2 + "] " + msg, ex);
    }

    public static void printWarn(String msg, String module, String category,
                                 String subcategory, String filter1, String filter2) {
        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(category)) {
            category = "";
        }

        if (StringUtil.isBlank(subcategory)) {
            subcategory = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.warn("[" + module + "][" + category + "][" + subcategory
                + "][" + filter1 + "][" + filter2 + "] " + msg);
    }

    public static void printWarn(String msg, String module, String filter1, String filter2) {
        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.warn("[" + module + "][][][" + filter1 + "][" + filter2 + "] " + msg);
    }

    public static void printDebug(String msg, String module, String category,
                                  String subcategory, String filter1, String filter2, Exception ex) {

        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(category)) {
            category = "";
        }

        if (StringUtil.isBlank(subcategory)) {
            subcategory = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.debug("[" + module + "][" + category + "][" + subcategory
                + "][" + filter1 + "][" + filter2 + "] " + msg, ex);

    }

    public static void printDebug(String msg, String module, String filter1, String filter2, Exception ex) {
        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.debug("[" + module + "][][][" + filter1 + "][" + filter2 + "] " + msg, ex);
    }

    public static void printFatal(String msg, String module, String category,
                                  String subcategory, String filter1, String filter2, Exception ex) {

        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(category)) {
            category = "";
        }

        if (StringUtil.isBlank(subcategory)) {
            subcategory = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.fatal("[" + module + "][" + category + "][" + subcategory
                + "][" + filter1 + "][" + filter2 + "] " + msg, ex);

    }

    public static void printFatal(String msg, String module, String filter1, String filter2, Exception ex) {
        if (StringUtil.isBlank(module)) {
            module = "";
        }

        if (StringUtil.isBlank(filter1)) {
            filter1 = "";
        }

        if (StringUtil.isBlank(filter2)) {
            filter2 = "";
        }

        logger.fatal("[" + module + "][][][" + filter1 + "][" + filter2 + "] " + msg, ex);
    }
}


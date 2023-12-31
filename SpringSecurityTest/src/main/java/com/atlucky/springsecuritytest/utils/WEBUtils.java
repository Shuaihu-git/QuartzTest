package com.atlucky.springsecuritytest.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date 2023/8/14 9:33
 * @Author XiaoHu
 * @Description
 **/
public class WEBUtils {
    /**
     * 显示字符串
     *
     * @param response 响应
     * @param s        待渲染的字符串
     * @return {@link String}
     */
    public static String renderString(HttpServletResponse response, String s){
        try {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().print(s);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}

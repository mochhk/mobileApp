package com.test;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class test {


    public static void main(String[] args) throws IOException {
//        double d=10.12;
//        int t=2;
//        int s=0;
//        BigDecimal bd=new BigDecimal((d*100)).setScale(0, BigDecimal.ROUND_HALF_UP);
//        t= Integer.parseInt(bd.toString());
//
//        DecimalFormat df = new DecimalFormat("######0"); //四色五入转换成整数
//        s= Integer.parseInt(df.format(d*100));
//        int i = (new Double(d*100)).intValue();
//        System.out.println(t);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println((d*10*10));
        String url = "http://192.168.10.122:8080/v2/pet";
        // 请求参数字典
        String json = "{\"id\": 0,\"category\": [{\"id\": 0,\"name\": \"string\"}],\"name\": \"doggie\",\"photoUrls\": [\"string\"],\"tags\": [{\"id\": 0,\"name\": \"string\"}],\"status\": \"available\"}";

        String json1="{" +
                "  \"id\": 0," +
                "  \"category\": {" +
                "    \"id\": 0," +
                "    \"name\": \"string\"" +
                "  }," +
                "  \"name\": \"doggie\"," +
                "  \"photoUrls\": [" +
                "    \"string\"" +
                "  ]," +
                "  \"tags\": [" +
                "    {" +
                "      \"id\": 0," +
                "      \"name\": \"string\"" +
                "    }" +
                "  ]," +
                "  \"status\": \"available\"" +
                "}";
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("==========run======");
                HttpClient.doPost(url,json);
                System.out.println("==========end======");
            }
        }).start();
    }
}

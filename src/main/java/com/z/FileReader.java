package com.z;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Splitter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FileReader {

    public static void main(String[] args) throws IOException {
//        String rootPath = "/Users/mtdp/Downloads";
//        File file = new File(rootPath + File.separator + "111.txt");
//        StringBuilder builder = new StringBuilder();
//        try (BufferedReader fileReader = new BufferedReader(new java.io.FileReader(file))) {
//            String line = "";
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//                try {
//                    JSONObject jsonObject = JSONObject.parseObject(line);
//                    Object recordKey = jsonObject.get("recordKey");
//                    builder.append("'").append(recordKey).append("'").append(",");
//                } catch (Exception e) {
//                    //
//                }
//            }
//        }
//        System.out.println(builder.toString());
        List<String> strings = Splitter.on(",").omitEmptyStrings().splitToList("wanglu24,liuyingtinbgf");
        System.out.println(JSON.toJSONString(strings));
    }

    public void read(String fileName) {
        if (fileName == null) {
            return;
        }

        File file = new File(fileName);
        if (file.exists()) {

            try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
                String line = "";
                while ((line = reader.readLine()) != null) {

                }
            } catch (Exception e) {

            }
        }

    }
}

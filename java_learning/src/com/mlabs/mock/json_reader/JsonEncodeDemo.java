package com.mlabs.mock.json_reader;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;

public class JsonEncodeDemo {
    public static void main(String[] args) throws IOException {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "foo");
        jsonObject.put("num", new Integer(100));
        jsonObject.put("balance", new Double(1000.21));
        jsonObject.put("is_vip", new Boolean(true));

        StringWriter out = new StringWriter();
        jsonObject.writeJSONString(out);

        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}

package demo;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.util.Base64;
import java.util.Map;

@Slf4j
public class Base64Demo {

    public static void main(String[] args) throws Exception {
        log.info("## java 8 base64: encode string and decode string ##");
        Map<String, Object> testData = testData();
        String testString = new Gson().toJson(testData);
        String encodedString = Base64.getEncoder().encodeToString(testString.getBytes("UTF-8"));
        log.info("test string: {}", new Gson().toJson(testData));
        log.info("encoded string: {}", encodedString);
        log.info("decoded string: {}", new String(Base64.getDecoder().decode(encodedString)));
    }

    private static Map<String, Object> testData() {
        Map<String, Object> map = Maps.newHashMap();
        map.put("userCode", "001");
        map.put("userName", "WangXiaocheng");
        return map;
    }
}

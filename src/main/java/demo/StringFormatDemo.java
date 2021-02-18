package demo;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Maps;
import org.apache.commons.text.StringSubstitutor;

import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @description String format method demo.
* @author wanggc
* @date 2020/11/10 3:00 下午
*/
public class StringFormatDemo {
    public static void main(String[] args) {
        System.out.println(String.format("%d", 1));
        // 长度固定，不够补0
        System.out.println(String.format("%04d", 1));

        hutoolStrFormat();

        customStrFormat();

        stringSubstitutorFormat();
    }

    /**
     * 使用Hutool.StrUtil格式化字符串
     * 要求：使用 {varName} 占位
     * 评价：如果paramMap中含有大量无用键值时不推荐使用这种方式
     */
    public static void hutoolStrFormat() {
        String template = "My name is {name}, I'm {age} years old. How old are you?";
        Map<String, Object> paramMap = Maps.newHashMap();
        paramMap.put("name", "林曦");
        paramMap.put("age", 30);
        String result = StrUtil.format(template, paramMap);
        System.out.println("== Hutool处理结果 ==");
        System.out.println(result);
    }

    /**
     * 使用自定义format方法格式化字符串
     * 要求：使用 ${varName} 占位
     */
    public static void customStrFormat() {
        String template = "My name is ${name}, I'm ${age} years old. How old are you?";
        Map<String, Object> paramMap = Maps.newHashMap();
        paramMap.put("name", "林曦");
        paramMap.put("age", 30);
        String result = format(template, paramMap);
        System.out.println("== 自定义format方法处理结果 ==");
        System.out.println(result);
    }

    /**
     * 使用commons-text StringSubstitutor格式化字符串
     * 要求：使用 ${varName} 占位
     */
    public static void stringSubstitutorFormat() {
        String template = "My name is ${name}, I'm ${age} years old. How old are you?";
        Map<String, Object> paramMap = Maps.newHashMap();
        paramMap.put("name", "林曦");
        paramMap.put("age", 30);
        StringSubstitutor stringSubstitutor = new StringSubstitutor(paramMap);
        String result = stringSubstitutor.replace(template);
        System.out.println("== commons-text处理结果 ==");
        System.out.println(result);
    }

    public static String format(String template, Map<String, Object> paramMap) {
        Matcher matcher = Pattern.compile("\\$\\{\\w+\\}").matcher(template);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group();
            String paramKey = group.substring(2, group.length() - 1);
            Object value = paramMap.get(paramKey);
            matcher.appendReplacement(sb, Objects.isNull(value) ? "" : value.toString());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}

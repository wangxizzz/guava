package day02;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

/**
 * filter（）：只保留集合中满足特定要求的元素
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<String> list= Lists.newArrayList("moon","dad","refer","son");
        Collection<String> palindromeList = Collections2.filter(list, input -> {   // input表示list的每个元素
            return new StringBuilder(input).reverse().toString().equals(input); //找回文串
        });
        System.out.println(palindromeList);
    }

}

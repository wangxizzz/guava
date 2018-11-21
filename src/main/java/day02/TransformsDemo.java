package day02;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/**
 * 可以多个Function一起使用
 */
public class TransformsDemo {
    public static void main(String[] args) {
        List<String> list= Lists.newArrayList("abcde","good","happiness");
        //确保容器中的每个字符串长度不超过5
        Function<String,String> f1=new Function<String, String>() {
            @Nullable
            @Override
            public String apply(@Nullable String input) {
                return input.length()>5 ? input.substring(0,5):input;
            }
        };
        //转成大写
        Function<String,String> f2=new Function<String, String>() {
            @Nullable
            @Override
            public String apply(@Nullable String input) {
                return input.toUpperCase();
            }
        };
        // 组合多个Function一起使用
        Function<String,String> function= Functions.compose(f1,f2);

        Collection<String> results= Collections2.transform(list,function);
        System.out.println(results);
    }
}

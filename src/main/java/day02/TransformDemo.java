package day02;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

import javax.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Set;

// transform（）：类型转换
public class TransformDemo {
    public static void main(String[] args) {
        Set<Long> times= Sets.newHashSet();
        times.add(91299990701L);
        times.add(9320001010L);
        times.add(9920170621L);
        Collection<String> timeStrCol= Collections2.transform(times, new Function<Long, String>() {
            @Nullable
            @Override
            public String apply(@Nullable Long input) {
                return new SimpleDateFormat("yyyy-MM-dd").format(input);
            }
        });
        System.out.println(timeStrCol);
    }
}

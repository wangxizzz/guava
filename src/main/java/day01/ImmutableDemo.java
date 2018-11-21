package day01;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/**创建不可变集合方法：
 * 1、copyOf方法，如ImmutableSet.copyOf(set);
 *
 * 2、of方法，如ImmutableSet.of(“a”, “b”, “c”)或 ImmutableMap.of(“a”, 1, “b”, 2);
 *
 * 3、Builder工具
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutableSet<String> set = ImmutableSet.of("a","b","c","d");
        ImmutableSet<String> set1 = ImmutableSet.copyOf(set);
        ImmutableSet<String> set2 = ImmutableSet.<String>builder().addAll(set).add("e").build();
        System.out.println(set);
        ImmutableList<String> list = set.asList();
        System.out.println(list);
        ImmutableList<Integer> list1 = ImmutableList.of(2,3,4,5);
        System.out.println(list1);
    }
}

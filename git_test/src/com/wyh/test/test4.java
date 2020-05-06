package com.wyh.test;

import java.util.*;

public class test4 {
    public static void main(String[] args) {
        //创建map集合放入数据
        HashMap<Integer, User> map = new HashMap<Integer, User>();
        map.put(1, new User("王勇豪",25));
        map.put(2, new User("zhangjie",19));
        map.put(3, new User("徐广",22));
        map.put(4, new User("hujunhui",19));
        //排序
        HashMap sortedmap = sortedMap(map);
        for (Object o : sortedmap.entrySet()) {
            System.out.println(o);//遍历打印每个key:value
        }
    }

    private static HashMap sortedMap(HashMap<Integer, User> map) {
        //map转化成list
        Set<Map.Entry<Integer, User>> set = map.entrySet();
        List<Map.Entry<Integer, User>> list = new ArrayList<>(set);
        //使用collections工具类来排序
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                //升序
                int result = o1.getValue().getAge() - o2.getValue().getAge();
                //如果年龄相同,就开始根据他们的哈希值来判断
                result = result == 0 ? o1.hashCode() - o2.hashCode() : result;
                //降序
//                int result = o2.getValue().getAge() - o1.getValue().getAge();
                return result;
            }
        });
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, User> entry : list) {
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }
}

class User{
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



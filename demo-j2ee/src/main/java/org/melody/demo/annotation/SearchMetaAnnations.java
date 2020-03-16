package org.melody.demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 递归搜索所有的注解，模拟框架搜索注解过程，以当前的类注解为例
 */
@Result
public class SearchMetaAnnations {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> test = new ArrayList<>();
        Annotation[] annotations = SearchMetaAnnations.class.getAnnotations();
        Set<Annotation> set = new HashSet<>();
        for (Annotation annotation : annotations){
            recursivelyAnnotaion(annotation,set);
        }
        System.out.println(set);
    }

    //递归获取注解的注解
    public static void recursivelyAnnotaion(Annotation annotation, Set<Annotation> set){
        //通过set元素唯一的特点来实现递归搜索所有的注解
        if (set.add(annotation)){
            //获取注解的注解数组
            if (annotation.annotationType().getAnnotations().length > 0){
                //搜索子注解
                for (Annotation childAnnotation : annotation.annotationType().getAnnotations()){
                    recursivelyAnnotaion(childAnnotation,set);
                }

            }
            System.out.println(annotation.annotationType().getName());
        }

    }
}


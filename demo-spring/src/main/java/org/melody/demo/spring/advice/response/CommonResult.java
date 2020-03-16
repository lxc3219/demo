package org.melody.demo.spring.advice.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * 响应消息,controller中处理后，返回此对象，响应请求结果给客户端。
 * @param <T>
 */
@Setter
@Getter
public class CommonResult<T> implements Serializable {

    private Boolean success;

    protected Integer status;

    private Integer code;

    protected T data;

    protected String msg;

    private Long timestamp;

    /**
     * 过滤字段：指定需要序列化的字段
     */
    @JsonIgnore
    private transient Map<Class<?>, Set<String>> includes;

    /**
     * 过滤字段：指定不需要序列化的字段
     */
    @JsonIgnore
    private transient Map<Class<?>, Set<String>> excludes;

    public CommonResult() {}

//    public CommonResult<T> include(Class<?> type, String... fields) {
//        return include(type, Arrays.asList(fields));
//    }

//    public CommonResult<T> include(Class<?> type, Collection<String> fields) {
//        if (includes == null) {
//            includes = new HashMap<>();
//        }
//        if (fields == null || fields.isEmpty()) {
//            return this;
//        }
//        fields.forEach(field -> {
//            if (field.contains(".")) {
//                String tmp[] = field.split("[.]", 2);
//                try {
//                    Field field1 = type.getDeclaredField(tmp[0]);
//                    if (field1 != null) {
//                        include(field1.getType(), tmp[1]);
//                    }
//                } catch (Exception ignore) {
//                }
//            } else {
//                getStringListFromMap(includes, type).add(field);
//            }
//        });
//        return this;
//    }

//    public CommonResult<T> exclude(Class type, String... fields) {
//        return exclude(type, Arrays.asList(fields));
//    }

//    public CommonResult<T> exclude(Class type, Collection<String> fields) {
//        if (excludes == null) {
//            excludes = new HashMap<>();
//        }
//        if (fields == null || fields.isEmpty()) {
//            return this;
//        }
//        fields.forEach(field -> {
//            if (field.contains(".")) {
//                String tmp[] = field.split("[.]", 2);
//                try {
//                    Field field1 = type.getDeclaredField(tmp[0]);
//                    if (field1 != null) {
//                        exclude(field1.getType(), tmp[1]);
//                    }
//                } catch (Exception ignore) {
//                }
//            } else {
//                getStringListFromMap(excludes, type).add(field);
//            }
//        });
//        return this;
//    }

//    public CommonResult<T> exclude(String... fields) {
//        return exclude(Arrays.asList(fields));
//    }

//    public Result<T> exclude(Collection<String> fields) {
//        if (excludes == null) {
//            excludes = new HashMap<>();
//        }
//        if (fields == null || fields.isEmpty()) {
//            return this;
//        }
//        Class type;
//        if (getData() != null) {
//            type = getData().getClass();
//        } else {
//            return this;
//        }
//        exclude(type, fields);
//        return this;
//    }

//    public Result<T> include(String... fields) {
//        return include(Arrays.asList(fields));
//    }

//    public Result<T> include(Collection<String> fields) {
//        if (includes == null) {
//            includes = new HashMap<>();
//        }
//        if (fields == null || fields.isEmpty()) {
//            return this;
//        }
//        Class type;
//        if (getData() != null) {
//            type = getData().getClass();
//        } else {
//            return this;
//        }
//        include(type, fields);
//        return this;
//    }

//    protected Set<String> getStringListFromMap(Map<Class<?>, Set<String>> map, Class type) {
//        return map.computeIfAbsent(type, k -> new HashSet<>());
//    }

    public CommonResult<T> success(Boolean success) {
        this.success = success;
        return this;
    }

    public CommonResult<T> status(Integer status) {
        this.status = status;
        return this;
    }

    public CommonResult<T> code(Integer code) {
        this.code = code;
        return this;
    }

    public CommonResult<T> data(T data) {
        this.data = data;
        return this;
    }

    public CommonResult<T> msg(String msg) {
        this.msg = msg;
        return this;
    }

    public CommonResult<T> putTimeStamp() {
        this.timestamp = System.currentTimeMillis();
        return this;
    }


}
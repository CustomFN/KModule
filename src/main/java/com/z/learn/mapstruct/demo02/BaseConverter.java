package com.z.learn.mapstruct.demo02;

import com.alibaba.fastjson.JSONObject;
import com.google.common.reflect.TypeToken;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public interface BaseConverter<SOURCE, TARGET> {

    /**
     * 映射同名属性
     */
    TARGET convertSource2Target(SOURCE source);

    /**
     * 反向，映射同名属性
     */
//    @InheritInverseConfiguration(name = "convertSource2Target")
    SOURCE convertTarget2Source(TARGET target);

    /**
     * 映射同名属性，集合形式
     */
//    @InheritConfiguration(name = "convertSource2Target")
    List<TARGET> convertSourceList2TargetList(List<SOURCE> sourceList);

    /**
     * 反向，映射同名属性，集合形式
     */
//    @InheritConfiguration(name = "convertTarget2Source")
    List<SOURCE> convertTargetList2SourceList(List<TARGET> targetListt);

//    /**
//     * 更新属性
//     */
//    @InheritConfiguration(name = "poToVo")
//    void updatePoToVo(SOURCE var1, @MappingTarget TARGET var2);
//
//    /**
//     * 反向，更新属性
//     */
//    @InheritConfiguration(name = "voToPo")
//    void updateVoToPo(@MappingTarget SOURCE var1, TARGET var2);
//
//    /**
//     * 映射同名属性，集合流形式
//     */
//    List<TARGET> poToVo(Stream<SOURCE> stream);
//
//    /**
//     * 反向，映射同名属性，集合流形式
//     */
//    List<SOURCE> voToPo(Stream<TARGET> stream);
//
//    default SOURCE mapToPo(Map<String, Object> map){
//        try {
//            TypeToken<SOURCE> voType = new TypeToken<SOURCE>(getClass()) {
//            };
//            Class<SOURCE> rawType = (Class<SOURCE>) voType.getRawType();
//            String s = JSONObject.toJSONString(map);
//            return JSONObject.parseObject(s, rawType);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    default Map<String, Object> poToMap(SOURCE bean){
//        String s = JSONObject.toJSONString(bean);
//        return JSONObject.parseObject(s, Map.class);
//    }
//
//    default List<Map<String, Object>> listPoToListMap(List<SOURCE> list){
//        List<Map<String, Object>> listMap = new ArrayList<>();
//        for (SOURCE source : list) {
//            listMap.add(poToMap(source));
//        }
//        return listMap;
//    }
//
//    default List<SOURCE> listMapToListPo(List<Map<String, Object>> listMap){
//        String s = JSONObject.toJSONString(listMap);
//        try {
//            TypeToken<SOURCE> voType = new TypeToken<SOURCE>(getClass()) {
//            };
//            Class<SOURCE> rawType = (Class<SOURCE>) voType.getRawType();
//            return JSONObject.parseArray(s, rawType);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    default TARGET mapToVo(Map<String, Object> map){
//        try {
//            TypeToken<TARGET> voType = new TypeToken<TARGET>(getClass()) {
//            };
//            Class<TARGET> rawType = (Class<TARGET>) voType.getRawType();
//            String s = JSONObject.toJSONString(map);
//            return JSONObject.parseObject(s, rawType);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    default Map<String, Object> voToMap(TARGET bean){
//        String s = JSONObject.toJSONString(bean);
//        return JSONObject.parseObject(s, Map.class);
//    }
//
//    default List<Map<String, Object>> listVoToListMap(List<TARGET> list){
//        List<Map<String, Object>> listMap = new ArrayList<>();
//        for (TARGET source : list) {
//            listMap.add(voToMap(source));
//        }
//        return listMap;
//    }
//
//    default List<TARGET> listMapToListVo(List<Map<String, Object>> listMap){
//        String s = JSONObject.toJSONString(listMap);
//        try {
//            TypeToken<TARGET> voType = new TypeToken<TARGET>(getClass()) {
//            };
//            Class<TARGET> rawType = (Class<TARGET>) voType.getRawType();
//            return JSONObject.parseArray(s, rawType);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}

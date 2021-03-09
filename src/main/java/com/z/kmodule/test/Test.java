package com.z.kmodule.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.z.kmodule.stream.demo01.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {

    private static int oneDayTime = 3600 * 24;

    private static String TOTAL_BUSINESS_LESS_MINUTE="今日营业满%s分钟, 需再营业%s分钟，明日即可开启";
    public static final String TOTAL_BUSINESS_LESS_HOUR_30_DAY="截至昨日，营业计时已结束，特权已失效";
    public static final String TOTAL_BUSINESS_LESS_MINUTE_29_DAY="今日营业满%s分钟，明日即可开启，否则特权将失效";

    public static final String TOTAL_BUSINESS_LESS_HOUR_NEW          = "需再营业%s小时才可开启特权";
    public static final String TOTAL_BUSINESS_LESS_HOUR_29_DAY_NEW   = "需再营业%s小时才可开启特权";
    public static final String TOTAL_BUSINESS_LESS_HOUR_30_DAY_NEW   = "截止昨日，营业时长未满足门槛，特权已失效";
    public static final String TOTAL_BUSINESS_LESS_MINUTE_NEW        = "需再营业%s分钟才可开启特权";
    public static final String TOTAL_BUSINESS_LESS_MINUTE_29_DAY_NEW = "需再营业%s分钟才可开启特权";


    public  static  boolean hasGroupsSizeX(int[] deck) {
        if(deck == null || deck.length == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < deck.length; i++) {
            Integer number = map.get(deck[i]);
            if(number == null) {
                number = 1;
            } else {
                number++;
            }
            map.put(deck[i], number);
        }

        boolean isOk = true;
        Integer number = null;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if(number == null) {
                number = value;
            }
            if(!number.equals(value) || value < 2) {
                isOk = false;
                break;
            }
        }
        return isOk;
    }

    private  static void dodo(String i, String j) {
        j = i + j;
        System.out.println(j);
    }

    public static void main(String[] args)  {


//        List<Long> wmPoiIds = Lists.newArrayList(1L);
//        DDD ddd = new DDD();
//        ddd.setCustomerId(10000002);
//        ddd.setWmPoiId(1L);
//        List<DDD> list = Lists.newArrayList(ddd);
//        Map<Long, Integer> wmPoiIdCustomerIdMap = list.stream().collect(Collectors.toMap(item -> item.getWmPoiId(), item -> item.getCustomerId()));
//        System.out.println("---" + JSON.toJSONString(wmPoiIdCustomerIdMap));
//
//        List<Integer> wmCustomerIdList = Lists.newArrayList();
//        wmPoiIdCustomerIdMap.entrySet().stream().forEach(item -> wmCustomerIdList.add(item.getValue()));
//        System.out.println(JSON.toJSONString(wmCustomerIdList));
//
//        List<WmCustomerBasicBo> wmCustomerBasicBoList = Lists.newArrayList();
//        Map<Integer, WmCustomerBasicBo> collect1 = wmCustomerBasicBoList.stream().collect(Collectors.toMap(item -> item.getId(), item -> item));
//        System.out.println(JSON.toJSONString(collect1));
//
//        Map<Long, WmCustomerBasicBo> mapResult = Maps.newHashMap();
//        wmPoiIds.stream().forEach(item -> {
//            Integer wmCustomerId = wmPoiIdCustomerIdMap.get(item);
//            WmCustomerBasicBo wmCustomerBasicBo = collect1.get(wmCustomerId);
//            mapResult.put(item, wmCustomerBasicBo);
//        });
//        System.out.println(JSON.toJSONString(mapResult));

        String s = "111111111111111111111111111111111111111111111111111";
        System.out.println(s.length());
        System.out.println(s.length() > 50);

//        HashMap<Object, Object> map = Maps.newHashMap();
//        map.put("1", "1");
//        map.remove("2");
//        map.remove("3");
//        map.remove("4");
//        System.out.println(map);

//        User user = new User();
//        user.setName("");
//        user.setAge(1);
//        user.setAddress("222");
//
//        User u = new User();
//        u.setAddress("11");
//        u.setAge(2);
//
//        System.out.println(user);
//        BeanUtils.copyProperties(u, user);
//        System.out.println(user);

//        DateTime time = new DateTime();
//        System.out.println(time.toLocalDateTime());
//        System.out.println(time.toLocalDate());
//        System.out.println(time.toLocalTime());
//        List<EnumTest> enumTests = Lists.newArrayList(EnumTest.AC, EnumTest.B, EnumTest.A, EnumTest.C);
//        List<EnumTest> collect = enumTests.stream().sorted(Comparator.comparingInt(EnumTest::getRank)).collect(Collectors.toList());
//        System.out.println(enumTests);
//        System.out.println(collect);


//        String msg = "111";
//        dodo("222", msg);
//        System.out.println(msg);

//        String msg = "亲爱的商家：$$shop#$(ID:$$shopid#$)，由于您的门店已下线超过30日，系统将自动取消您的《“战略合作伙伴”优惠政策申请书》并退还保证金余额至入驻美团外卖留存银行卡，如有疑问请联系您的业务（品牌）经理";
//        String shop = "娃哈哈";
//        String shopid = "111";
//        String.format(msg, shop, shopid);

//        String msg = "{\"address\":\"北京原创天地\",\"utime\":1585808608,\"customerNumber\":\"246644454276656765\",\"isLeaf\":1,\"customerName\":\"测试客户对接自入驻\",\"validateDate\":0,\"effective\":0,\"customerType\":4,\"superCustomerId\":0,\"customerExtPro\":\"\",\"legalPerson\":\"大老板\",\"mtCustomerId\":0,\"ctime\":1585808607,\"auditStatus\":1,\"id\":11778911,\"customerSecondType\":0,\"ownerUid\":0}";
//        JSONObject jsonObject = JSONObject.parseObject(msg);
//        System.out.println();
//
//        JSONObject object = new JSONObject();
//        JSONObject data = new JSONObject();
//        JSONObject value = new JSONObject();
//        value.put("value", JSON.toJSONString(jsonObject));
//        data.put("data", value);
//        object.put("doc", data);
//        System.out.println(object);

//        int[] arr = new int[]{1,1,2,2,2,2};
//        System.out.println(hasGroupsSizeX(arr));

//        Map<Integer, Integer> map = new HashMap<>();
//        Integer number = null;
//        boolean isOk = true;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            Integer value = entry.getValue();
//            if (number == null) {
//                number = value;
//            }
//            if (!number.equals(value)) {
//                isOk = false;
//            }
//        }
//        return isOk;
//        JSONArray array = new JSONArray();
//        for (int i = 0; i < 8; i++) {
//            JSONObject object = new JSONObject();
//            object.put("name", i);
//            object.put("value", i);
//            array.add(object);
//        }
//
//        System.out.println(JSON.toJSONString(array));
//
//        for (int i = 0; i < array.size() / 2; i++) {
//            Object object1 = array.get(i);
//            Object object2 = array.get(i + 4);
//            System.out.println("obj1 = " + JSON.toJSONString(object1));
//            System.out.println("obj2 = " + JSON.toJSONString(object2));
//            System.out.println("0-----------------0");
//        }

//        System.out.println(JSON.toJSONString(Lists.newArrayList()));

//        String time = "2020-01-01 11:11:11";
//        String substring = time.substring(0, time.indexOf(" "));
//        System.out.println(substring);
//        ArrayList<Integer> list = Lists.newArrayList(1, 2, 3, 4);
//        if (CollectionUtils.isNotEmpty(list)) {
//            Integer firstPhysicsCity = list.get(0);
//
//            StringBuilder cityNames = new StringBuilder().append(firstPhysicsCity);
//            for (int i = 1; i < list.size(); i++) {
//                cityNames.append("、").append(list.get(i));
//            }
//            System.out.println(cityNames.toString());
//        }

//        String str = "";
//        System.out.println(str);
//        System.out.println(StringUtils.isBlank(str));
//        System.out.println(StringUtils.isEmpty(str));

//        Map<Integer, Integer> map = Maps.newHashMap();
//        map.put(1, 1);
//        map.put(2, 2);
//        Map<Integer, Integer> mapmap = Maps.newHashMap();
//        for (Integer key : map.keySet()) {
//            if (1 == key) {
//                mapmap.put(3, 3);
//            }
//        }
//        map.putAll(mapmap);
//        System.out.println(map);

//        Map<Integer, Boolean> map = Maps.newHashMap();
//        map.put(1, Boolean.TRUE);
//        map.put(2, Boolean.FALSE);

//        if (map.get(3) != null && map.get(3)) {
//            System.out.println("TRUE");
//        } else {
//            System.out.println("FALSE");
//        }

//        Set<Long> set = Sets.newHashSet(1L, 2L);
//        System.out.println(set.contains(1L));
//        System.out.println(set.contains(3L));
//        System.out.println(set.contains(4));
//        System.out.println(set.contains(null));

//        List<Integer> orgIds = Lists.newArrayList(2969);
//        List<Integer> grayIds = Lists.newArrayList(2968, 2967);
//        System.out.println(CollectionUtils.containsAny(grayIds, orgIds));

//        boolean a = true;
//        boolean b = true;
//        boolean c = true;
//        boolean d = true;
//
//        System.out.println(a && b || c && d);

//        System.out.println(Math.ceil(1.01));

//        long nowTime = new Date().getTime() / 1000;
//        long firstTime = 1567074413L;
//
//        BigDecimal firstOne = new BigDecimal(nowTime - firstTime);
//
//        System.out.println(nowTime);
//        System.out.println(firstTime);
//        System.out.println(firstOne);
//
//        BigDecimal secondOne = new BigDecimal(3600 * 24);
//        System.out.println(secondOne);
//
//        BigDecimal thirdOne = firstOne.divide(secondOne, 20, BigDecimal.ROUND_HALF_UP);
//        System.out.println(thirdOne);
//
//        System.out.println(thirdOne.doubleValue());
//        System.out.println(Math.ceil(thirdOne.doubleValue()));
//
//        int doubleOne = new Double(Math.ceil(thirdOne.doubleValue())).intValue();
//        System.out.println(doubleOne);
//
//        System.out.println("======================");
//
//        long lessSecond = 3000L;
//        System.out.println(lessSecond);
//
//
//        BigDecimal bigOne = new BigDecimal(lessSecond);
//        BigDecimal bigTwo = new BigDecimal(60);
//        BigDecimal bigThree = bigOne.divide(bigTwo, 20, BigDecimal.ROUND_HALF_UP);
//        BigDecimal bigFour = bigThree.setScale(2, BigDecimal.ROUND_HALF_UP);
//        double doubleDD = Math.ceil(bigFour.doubleValue());
//        int intDD = new Double(doubleDD).intValue();
//
//        System.out.println(bigOne);
//        System.out.println(bigTwo);
//        System.out.println(bigThree);
//        System.out.println(bigFour);
//        System.out.println(doubleDD);
//        System.out.println(intDD);
//
//        System.out.println("=========================");
//        System.out.println(oneDayTime - intDD);
//        System.out.println(String.format(TOTAL_BUSINESS_LESS_MINUTE, oneDayTime - intDD, intDD));
//
//        System.out.println("=========================");
//        int lessMin = new Double(Math.ceil(new BigDecimal(lessSecond).divide(new BigDecimal(60),20, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue())).intValue();
//
//        String remark = "";
//        int dueDays = 4;
//        if (doubleOne == dueDays) {
//            remark = TOTAL_BUSINESS_LESS_HOUR_30_DAY;
//        }else if(doubleOne == (dueDays - 1)) {
//            remark = String.format(TOTAL_BUSINESS_LESS_MINUTE_29_DAY, lessMin);
//        }else{
//            remark = String.format(TOTAL_BUSINESS_LESS_MINUTE, lessMin, 60 - lessMin);
//        }
//        System.out.println(remark);

//        long lessSecond = 19800L;
//        int onLineTime = 1567147176;
//        System.out.println(getTotalBusiness(lessSecond, onLineTime));
//        System.out.println(new Double(Math.ceil(new BigDecimal(new Date().getTime()/1000 - onLineTime).divide(new BigDecimal(3600*24),20,BigDecimal.ROUND_HALF_UP).doubleValue())).intValue());
//        System.out.println(new Double(Math.ceil(new BigDecimal(lessSecond).divide(new BigDecimal(60),20, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue())).intValue());
//        System.out.println(new Double(Math.ceil(new BigDecimal(lessSecond).divide(new BigDecimal(3600), 20, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue())).intValue());

//        System.out.println(Integer.MAX_VALUE);

//        String reg = "[0-9]{4}-[0-9]{2}-[0-9]{2}|0";
//        String content1 = "-1";
//        String content2 = "201-12-12";
//        String content3 = "2019-12-12";
//        String content4 = "0";
//
//        System.out.println(Pattern.matches(reg, content1));
//        System.out.println(Pattern.matches(reg, content2));
//        System.out.println(Pattern.matches(reg, content3));
//        System.out.println(Pattern.matches(reg, content4));

//        String quaRealLetterNoticeMsgTitle = "资质属实商家承诺函签约成功";
//        String format = String.format("【%s】合同编号：%s, 客户：%s（%s）", quaRealLetterNoticeMsgTitle, "WMYW-010-04-154228531026903", "HHHHH", 22);
//        String content = "资质属实商家承诺函签约成功";
//
//        String message = "[{" + "'title':'【" + quaRealLetterNoticeMsgTitle + "】'," + "'content':'" + content + "'}]";
////        String message = "[{" + "'title':'【合同签约成功】'," + "'content':'" + content + "'}]";
//
//        JSONArray jsonArray = new JSONArray(message);
//        System.out.println(jsonArray);

//        System.out.println(format);
//        System.out.println(message);

//        Integer i = null;
//        System.out.println(i == 1);

//        System.out.println(COOPERATEMODE_MAP.get(1));
//        System.out.println(COOPERATEMODE_MAP.get(2));
//        System.out.println(COOPERATEMODE_MAP.get(3));
//        System.out.println(COOPERATEMODE_MAP.get(4));
//        System.out.println(COOPERATEMODE_MAP.get(null));


//        Set<Integer> ages = Sets.newHashSet(1, 2, 3);
        User user1 = new User("1", 1, "1");
        User user2 = new User("2", 2, "2");
        User user3 = new User("3", 3, "3");
        User user4 = new User("4", 4, "4");
        List<User> users = Lists.newArrayList(user1, user2, user3, user4);
        Map<Integer, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println(JSON.toJSONString(collect));
//        User user = users.get(users.size() - 1);
//        user.setAge(999);
//        user.setAddress("111111");
//        System.out.println(JSON.toJSONString(users));
//
//        List<User> list = complexQueryFromTaskCommon(users, ages);
//        System.out.println(list);

//        TaskMsg taskMsg = JSON.parseObject(msg, TaskMsg.class);
//        System.out.println(JSON.toJSONString(taskMsg));
    }

    private static final String msg = "{\"batch\":true,\"callBackUrl\":\"http://9776-cuaur-sl-customer.waimai.test.sankuai.com/customer/callback/v1/w/notify\",\"coldDataList\":[\"econtractUserEntity\",\"flowList\",\"stageInfoBoList\",\"stageBatchInfoBoList\"],\"contextState\":\"context_to_execute\",\"econtractEntity\":{\"authorityMisId\":\"zhujiakun\",\"ctime\":1568615199000,\"econtractType\":\"type_qua_real_letter\",\"econtractUserId\":2,\"id\":73,\"name\":\"资质属实商家承诺函-流程化\",\"utime\":1568615785000,\"valid\":1},\"econtractRecordEntity\":{\"id\":55640,\"recordKey\":\"EC_letter_c4c2d113-9511-42\"},\"econtractUserEntity\":{\"ctime\":1509170258000,\"id\":2,\"name\":\"waimai_contract\",\"token\":\"USR_waimai_contract_7377f61f-11af-42\",\"type\":\"type_app\",\"valid\":1},\"flowList\":[\"qua_real_letter\"],\"recordBizKey\":\"13949\",\"stageBatchInfoBoList\":[{\"metaFlowList\":[\"qua_real_letter\"],\"paramInfoBoMap\":{},\"pdfContentInfoBoMap\":{\"qua_real_letter\":[{\"pdfBizContent\":[],\"pdfMetaContent\":{\"contractNum\":\"WMYE-010-04-010030828\",\"quaName\":\"大北京主体贝贝\",\"signTimeMonth\":\"09\",\"partAName\":\"大北京主体贝贝\",\"quaNumber\":\"12332\",\"signTimeYear\":\"2019\",\"signTimeDay\":\"16\",\"partAEstamp\":\"美团外卖商家签章专属\"},\"pdfTemplateName\":\"qua_real_letter\",\"vertical\":true}]},\"stageName\":\"create_pdf\"},{\"certifyInfoBo\":{\"caType\":\"COMPANY\",\"customerName\":\"大北京主体贝贝\",\"email\":\"\",\"mobile\":\"13552535506\",\"quaNum\":\"12332\"},\"stageName\":\"ca_certify_d\"},{\"signerInfoBo\":{\"bankCardNo\":\"6216261000000000018\",\"bankName\":\"工商银行\",\"channelList\":[],\"clientId\":\"sms-contract_kefu\",\"clientSecret\":\"AA81E263E10F5D64B7FCDAC71D11AB8D\",\"idCardNo\":\"341126197709218366\",\"mobileList\":[\"13552535506\"],\"name\":\"全渠道\",\"phone\":\"13552535506\",\"sendSms\":true,\"smsParamMap\":{\"other\":\"录入完成\",\"phone\":\"\",\"module\":\"《资质属实商家承诺函》\",\"name\":\"朱家琨\",\"detail\":\"WMYE-010-04-010030828\",\"platform\":\"美团外卖\"},\"smsTemplateId\":\"20365\",\"smsTempletVersion\":2},\"stageName\":\"real_name_auth_d\"},{\"certifyInfoBo\":{\"caType\":\"COMPANY\",\"customerName\":\"大北京主体贝贝\",\"email\":\"\",\"mobile\":\"13552535506\",\"quaNum\":\"12332\"},\"estampInfoBo\":{\"estampMap\":{\"estamp_sign_key\":\"美团外卖商家签章专属\"}},\"metaFlowList\":[\"qua_real_letter\"],\"stageName\":\"econtract_stamp_d\"}],\"stageNameAndCustomerId\":{},\"stampKey\":\"ssq\",\"taskContext\":{\"econtractStage\":\"apply_econtract\",\"errorCode\":0,\"executorResult\":{},\"retryTimes\":0,\"state\":\"task_success\",\"taskId\":0},\"taskTypeAndContractIdMap\":{},\"templateProcessorType\":\"commonProcessor\"}";


    @Data
    @Getter
    @Setter
    static class TaskMsg {
        private String messageType;

        private String econtractRecordKey;

        private Object messageBody;
    }

    private static List<User> complexQueryFromTaskCommon(         List<User> userList,
                                                                   Set<Integer> checkTaskType) {
        //统计各状态数量
        int allNum = 0;
        int inProgressNum = 0;

        List<User> filterResult = Lists.newArrayList();

        //非筛选task需要的任务
        if (checkTaskType == null) {
            return filterResult;
        }

        for (User temp : userList) {
            //taskType
            if (!checkTaskType.contains(temp.getAge())) {
                continue;
            }

            filterResult.add(temp);
        }
        return filterResult;
    }

    public static final Map<Integer, String> COOPERATEMODE_MAP = Maps.newHashMap();
    static {
        COOPERATEMODE_MAP.put(1, "美团与客户合同");
        COOPERATEMODE_MAP.put(2,"代理商与客户合同");
        COOPERATEMODE_MAP.put(3,"资质属实商家承诺函");
    }

    private static String getTotalBusiness(long lessSecond, int onLineTime) {
        String remark = "";
        int dueDays = 5;
        int whitchDay = new Double(Math.ceil(new BigDecimal(new Date().getTime()/1000 - onLineTime).divide(new BigDecimal(3600*24),20,BigDecimal.ROUND_HALF_UP).doubleValue())).intValue();
        if(lessSecond >= 3600) {//相差大于等于1小时
            int lessHour = new Double(Math.ceil(new BigDecimal(lessSecond).divide(new BigDecimal(3600), 20, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue())).intValue();
            if (whitchDay == dueDays) {
                remark = TOTAL_BUSINESS_LESS_HOUR_30_DAY_NEW;
            } else if (whitchDay == (dueDays - 1)){
                remark = String.format(TOTAL_BUSINESS_LESS_HOUR_29_DAY_NEW, lessHour);
            } else{
                remark = String.format(TOTAL_BUSINESS_LESS_HOUR_NEW, lessHour);
            }

        }else{
            //小于1小时
            int lessMin = new Double(Math.ceil(new BigDecimal(lessSecond).divide(new BigDecimal(60),20, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue())).intValue();
            if (whitchDay == dueDays) {
                remark = TOTAL_BUSINESS_LESS_HOUR_30_DAY_NEW;
            }else if(whitchDay == (dueDays - 1)) {
                remark = String.format(TOTAL_BUSINESS_LESS_MINUTE_29_DAY_NEW, lessMin);
            }else{
                remark = String.format(TOTAL_BUSINESS_LESS_MINUTE_NEW, lessMin);
            }

        }
        return remark;
    }
}

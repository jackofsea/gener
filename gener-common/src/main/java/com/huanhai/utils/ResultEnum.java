package com.huanhai.utils;

/**
 * @author luofeng
 * @version 1.0
 * @date 2021-03-17 14:58
 **/
public enum  ResultEnum implements IResult  {

    /**
     * 成功
     */
    SUCCESS("处理成功", "200"),
    /**
     * 失败
     */
    FAILURE("处理失败", "300"),

    /**
     * 由系统其它引起的，如连接超时等等
     */
    EXCEPTION("系统异常","400"),

    /**
     * 系统未识别的编码
     */
    UNKNOWN("未识别类型","000");


    private String msg;
    private String code;

    ResultEnum(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    /**
     *  根据code返回指定类型的Enum
     *
     * @param code
     * @return
     */
    public static ResultEnum getResultEnum(String code){
        for (ResultEnum e: ResultEnum.values()) {
            if(e.getCode().equals(code)){
                return e;
            }
        }
        return ResultEnum.UNKNOWN;
    }

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }
}

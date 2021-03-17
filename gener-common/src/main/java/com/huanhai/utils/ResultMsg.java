package com.huanhai.utils;

/**
 * 响应信息
 *
 * @author luofeng
 * @version 1.0
 * @date 2021-03-17 15:05
 **/
public class ResultMsg {

    /**
     * 返回代码
     */
    private String resultCode;

    /**
     * 响应的数据
     */
    private Object resultData;

    /**
     * 描述信息
     */
    private String resultMsg;


    public ResultMsg() {
    }

    public ResultMsg(IResult resultEnum) {
        this.resultCode = resultEnum.getCode();
        this.resultMsg = resultEnum.getMsg();
    }


    public ResultMsg(Object o, IResult resultEnum) {
        this.resultCode = resultEnum.getCode();
        this.resultMsg = resultEnum.getMsg();
        resultData = o;
    }

    /**
     * 成功
     */
    public static ResultMsg getSuccess() {
        return new ResultMsg(ResultEnum.SUCCESS);
    }

    /**
     * 失败
     */
    public static ResultMsg getFailure() {
        return new ResultMsg(ResultEnum.FAILURE);
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}

package com.huanhai.utils.response;

/**
 * 响应信息
 *
 * @author luofeng
 * @version 1.0
 * @date 2021-03-17 15:05
 **/
public class ResultMsg<E> implements IResultMsg<E> {

    /**
     * 返回代码
     */
    private String resultCode;

    /**
     * 响应的数据
     */
    private E resultData;

    /**
     * 描述信息
     */
    private String resultMsg;

    /**
     * 其他信息
     */
    private String extra;


    /**
     * 成功
     */
    public final static IResultMsg<?>  SUCCESS=new ResultMsg(ResultEnum.SUCCESS);

    /**
     * 失败
     */
    public final static IResultMsg<?>  FAILURE=new ResultMsg(ResultEnum.SUCCESS);


    public ResultMsg() {
    }

    public ResultMsg(IResult resultEnum) {
        this.resultCode = resultEnum.getCode();
        this.resultMsg = resultEnum.getMsg();
    }


    public ResultMsg(E o, IResult resultEnum) {
        this.resultCode = resultEnum.getCode();
        this.resultMsg = resultEnum.getMsg();
        resultData = o;
    }


}

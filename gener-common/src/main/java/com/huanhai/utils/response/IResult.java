package com.huanhai.utils.response;
/**
 * 响应的接口
 *
 * @author luofeng
 * @date 2021/03/17
 */
public interface IResult {

    /**
     * 获取响应信息
     * @return 响应信息
     */
    String getMsg();

    /**
     * 获取响应代码
     *
     * @return 响应代码
     */
    String getCode();

}

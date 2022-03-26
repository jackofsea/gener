package com.huanhai.utils.excel;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 *  EasyPoi 工具
 *
 * @author luofeng
 * @version 1.0
 * @date 2021-03-24 10:13
 **/
public class EasyPoiUtils {

    /**
     * 不固定对象的导出
     *
     * @param outPath     导出表格的路径
     * @param entityList Map对象列表
     * @param dataMap    Excel对象数据List
     */
    public static Workbook exportExcelForMap(String outPath, List<Map<String,String>> dataMap) {
       return null;
    }

    /**
     * 不固定对象的导入
     *
     * @param importParams     表格导入参数设置
     * @param filePath   文件路径
     */
    public static List<Map<String,String>> importExcelToMap(ImportParams importParams, String filePath) {
        if(importParams == null){
            importParams =new ImportParams();
            //使用第二行做key
            importParams.setTitleRows(1);
            importParams.setSheetNum(1);
        }
        if(filePath == null){
            return Collections.emptyList();
        }
        return ExcelImportUtil.importExcel(new File(filePath), Map.class,importParams);

    }

    public static void main(String[] args) throws Exception {
//        List<Map<String,String>> list=importExcelToMap(null,"d:\\testCase.xlsx");
//        System.out.println(list.size());
//        Map<String,String> map=list.get(0);
//        System.out.println(map.size());
        


    }

}

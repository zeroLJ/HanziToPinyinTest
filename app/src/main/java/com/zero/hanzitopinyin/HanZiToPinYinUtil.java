package com.zero.hanzitopinyin;

import opensource.jpinyin.PinyinHelper;

/**
 * Created by zero on 2017/4/5.
 */
public class HanZiToPinYinUtil {
    /**
     * 返回一个字符串的拼音
     * @param hanZi
     * @return
     */
    public static String stringToPinYin(String hanZi){
        String pinYin = PinyinHelper.convertToPinyinString(hanZi," ");
        //将汉字读音返回
        return pinYin;
    }
}

package com.zero.hanzitopinyin;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * Created by zero on 2017/4/5.
 */
public class HanZiToPinYinUtil {
    /**
     * 返回一个字的拼音
     * @param hanzi
     * @return
     */
    public static String toPinYin(char hanzi){
        HanyuPinyinOutputFormat hanyuPinyin = new HanyuPinyinOutputFormat();
        hanyuPinyin.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyin.setToneType(HanyuPinyinToneType.WITH_TONE_MARK);
        hanyuPinyin.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE);
        String[] pinyinArray=null;
        try {
            //是否在汉字范围内
            if(hanzi>=0x4e00 && hanzi<=0x9fa5){
                pinyinArray = PinyinHelper.toHanyuPinyinStringArray(hanzi, hanyuPinyin);
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }
        //将汉字返回
        return pinyinArray[0];
    }

    /**
     * 返回一个字符串的拼音
     * @param s
     * @return
     */
    public static String stringToPinYin(String s){
        HanyuPinyinOutputFormat hanyuPinyin = new HanyuPinyinOutputFormat();
        hanyuPinyin.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyin.setToneType(HanyuPinyinToneType.WITH_TONE_MARK);
        hanyuPinyin.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            String[] pinyinArray=null;
            char hanzi = s.charAt(i);
            try {
                //是否在汉字范围内
                if(hanzi>=0x4e00 && hanzi<=0x9fa5){
                    pinyinArray = PinyinHelper.toHanyuPinyinStringArray(hanzi, hanyuPinyin);
                    result.append(pinyinArray[0]);
                    if(i < s.length()-1){
                        result.append(" ");
                    }
                }
            } catch (BadHanyuPinyinOutputFormatCombination e) {
                e.printStackTrace();
            }

        }
        //将汉字读音返回
        return result.toString();
    }
}

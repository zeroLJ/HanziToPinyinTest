# HanziToPinyinTest
汉字转拼音工具

使用方法：

 一、把第三方包（HanziToPinyinTest/lib/pinyin4j-2.5.0.jar）导入到你的项目中， 或者在bulid.gradle文件中添加以下代码 
 
  dependencies{

  compile 'com.belerweb:pinyin4j:2.5.0'

  }

二、复制HanZiTOPinYinUtil.java文件进你的项目中

三、 
   
   //此方法返回字符串的拼音（string格式）
    
    String s = HanZiToPinYinUtil.stringToPinYin("你好");
   
   //把结果显示出来
   
   Toast.makeText(this, s, Toast.LENGTH_LONG).show();

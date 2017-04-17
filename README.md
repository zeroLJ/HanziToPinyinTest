# HanziToPinyinTest
汉字转拼音工具

使用方法：

 一、把第三方包（libs/jpinyin-1.0.jar）导入到你的项目中
 
 二、复制HanZiTOPinYinUtil.java文件进你的项目中

 三、 
   
   //此方法返回字符串的拼音（string格式）
    
    String s = HanZiToPinYinUtil.stringToPinYin("你好");
   
   //把结果显示出来
   
   Toast.makeText(this, s, Toast.LENGTH_LONG).show();

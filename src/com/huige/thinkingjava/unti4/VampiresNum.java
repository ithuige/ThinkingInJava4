/**
 * 
 */
package com.huige.thinkingjava.unti4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huige
 *
 * 2015年8月20日 下午2:50:15
 */
public class VampiresNum {

	/**
	 * 吸血鬼数字
	 * 是指位数为偶数的数字，可以由一对数字相乘而得到
	 * 而这对数字包含乘积的一半位数的数字，其中从最初的数字中选取的数字可以任意排序
	 * 以两个0结尾的数字不允许的，例如，下面的都是吸血鬼数字
	 * 1260=21*60
	 * 1827=21*87
	 * 2187=27*81
	 * 写一个程序找出所有4,6位数的吸血鬼数字
	 * @param args
	 */
	public static void main(String[] args) {
		
		VampiresNum test=new VampiresNum();
		test.calculationVampiresNum();
	}
	/**
	 * 4位
	 */
	private void calculationVampiresNum(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println(formatter.format(new Date()));
		int a,b,c,d;//4位数第1,2,3,4位的数字
		for(a=1;a<=9;a++){
			for(b=0;b<=9;b++){
				for(c=0;c<=9;c++){
					for(d=0;d<=9;d++){
						int num=1000*a+100*b+10*c+d;
						if(num==((10*a+b)*(10*c+d))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*a+b) + " * "+(10*c+d));
						}else if(num==((10*b+a)*(10*c+d))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*b+a) + " * "+(10*c+d));
						}else if(num==((10*a+b)*(10*d+c))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*a+b) + " * "+(10*d+c));
						}else if(num==((10*b+a)*(10*d+c))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*b+a) + " * "+(10*d+c));
						}
						
						else if(num==((10*a+c)*(10*b+d))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*a+c) + " * "+(10*b+d));
						}else if(num==((10*c+a)*(10*b+d))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*c+a) + " * "+(10*b+d));
						}else if(num==((10*a+c)*(10*d+b))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*a+c) + " * "+(10*d+b));
						}else if(num==((10*c+a)*(10*d+b))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*c+a) + " * "+(10*d+b));
						}
						
						else if(num==((10*a+d)*(10*b+c))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*a+d) + " * "+(10*b+c));
						}else if(num==((10*d+a)*(10*b+c))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*d+a) + " * "+(10*b+c));
						}else if(num==((10*a+d)*(10*c+b))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*a+d) + " * "+(10*c+b));
						}else if(num==((10*d+a)*(10*c+b))){
							System.out.println("吸血鬼数字： "+num+"  =  "+ (10*d+a) + " * "+(10*c+b));
						}
					}
				}
			}
		}
		System.out.println(formatter.format(new Date()));
	}
}

/**
 * 
 */
package com.huige.thinkingjava.unti4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huige
 *
 * 2015��8��20�� ����2:50:15
 */
public class VampiresNum {

	/**
	 * ��Ѫ������
	 * ��ָλ��Ϊż�������֣�������һ��������˶��õ�
	 * ��������ְ����˻���һ��λ�������֣����д������������ѡȡ�����ֿ�����������
	 * ������0��β�����ֲ�����ģ����磬����Ķ�����Ѫ������
	 * 1260=21*60
	 * 1827=21*87
	 * 2187=27*81
	 * дһ�������ҳ�����4,6λ������Ѫ������
	 * @param args
	 */
	public static void main(String[] args) {
		
		VampiresNum test=new VampiresNum();
		test.calculationVampiresNum();
	}
	/**
	 * 4λ
	 */
	private void calculationVampiresNum(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println(formatter.format(new Date()));
		int a,b,c,d;//4λ����1,2,3,4λ������
		for(a=1;a<=9;a++){
			for(b=0;b<=9;b++){
				for(c=0;c<=9;c++){
					for(d=0;d<=9;d++){
						int num=1000*a+100*b+10*c+d;
						if(num==((10*a+b)*(10*c+d))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*a+b) + " * "+(10*c+d));
						}else if(num==((10*b+a)*(10*c+d))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*b+a) + " * "+(10*c+d));
						}else if(num==((10*a+b)*(10*d+c))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*a+b) + " * "+(10*d+c));
						}else if(num==((10*b+a)*(10*d+c))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*b+a) + " * "+(10*d+c));
						}
						
						else if(num==((10*a+c)*(10*b+d))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*a+c) + " * "+(10*b+d));
						}else if(num==((10*c+a)*(10*b+d))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*c+a) + " * "+(10*b+d));
						}else if(num==((10*a+c)*(10*d+b))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*a+c) + " * "+(10*d+b));
						}else if(num==((10*c+a)*(10*d+b))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*c+a) + " * "+(10*d+b));
						}
						
						else if(num==((10*a+d)*(10*b+c))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*a+d) + " * "+(10*b+c));
						}else if(num==((10*d+a)*(10*b+c))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*d+a) + " * "+(10*b+c));
						}else if(num==((10*a+d)*(10*c+b))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*a+d) + " * "+(10*c+b));
						}else if(num==((10*d+a)*(10*c+b))){
							System.out.println("��Ѫ�����֣� "+num+"  =  "+ (10*d+a) + " * "+(10*c+b));
						}
					}
				}
			}
		}
		System.out.println(formatter.format(new Date()));
	}
}

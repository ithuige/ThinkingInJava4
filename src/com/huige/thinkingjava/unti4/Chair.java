/**
 * 
 */
package com.huige.thinkingjava.unti4;

/**
 * @author huige
 *
 *         2015��8��20�� ����2:58:03
 *         
 *         ������򴴽������Chair ���󣬶����������ռ�����ʼ���к��ĳЩʱ�򣬳����ֹͣ����Chair��
���������ռ����������κ�ʱ�����У��������ǲ���׼ȷ֪�����ں�ʱ��������ˣ�������һ����Ϊgcrun
�ı����ָ�������ռ����Ƿ��Ѿ���ʼ���С����õڶ������f��Chair �ɸ���main()��Ӧֹͣ�������
�ɡ���������Ƕ�����finalize()�ڲ����õģ��������������ռ��ڼ䡣
������static ��������created �Լ�finalized�����ֱ����ڸ����Ѵ����Ķ��������Լ������ռ����ѽ���
����β�����Ķ������������ÿ��Chair �������Լ��ģ���static��int i�������ܸ����˽�������ı�
���Ƕ���
 */
public class Chair {
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;

	Chair() {
		i = ++created;
		if (created == 47)
			System.out.println("Created 47");
	}

	protected void finalize() {
		if (!gcrun) {
			gcrun = true;
			System.out.println("Beginning to finalize after " + created + " Chairs have been created");
		}
		if (i == 47) {
			System.out.println("Finalizing Chair #47, " + "Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
		if (finalized >= created)
			System.out.println("All " + finalized + " finalized");
	}
}

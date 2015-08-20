/**
 * 
 */
package com.huige.thinkingjava.unti4;

/**
 * @author huige
 *
 *         2015年8月20日 下午2:58:03
 *         
 *         这个程序创建了许多Chair 对象，而且在垃圾收集器开始运行后的某些时候，程序会停止创建Chair。
由于垃圾收集器可能在任何时间运行，所以我们不能准确知道它在何时启动。因此，程序用一个名为gcrun
的标记来指出垃圾收集器是否已经开始运行。利用第二个标记f，Chair 可告诉main()它应停止对象的生
成。这两个标记都是在finalize()内部设置的，它调用于垃圾收集期间。
另两个static 变量——created 以及finalized——分别用于跟踪已创建的对象数量以及垃圾收集器已进行
完收尾工作的对象数量。最后，每个Chair 都有它自己的（非static）int i，所以能跟踪了解它具体的编
号是多少
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

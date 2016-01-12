/**
 * Title: ThreadPoolFactory.java
 * Description: 
 * Copyright: Copyright (c) 2013-2015 luoxudong.com
 * Company: 个人
 * Author: 罗旭东 (hi@luoxudong.com)
 * Date: 2015年7月13日 上午10:37:27
 * Version: 1.0
 */
package com.luoxudong.app.asynchttp.threadpool;

import com.luoxudong.app.asynchttp.threadpool.interfaces.IThreadPoolManager;
import com.luoxudong.app.asynchttp.threadpool.manager.ThreadPoolManager;


/** 
 * ClassName: ThreadPoolFactory
 * Description:线程池工厂类
 * Create by: 罗旭东
 * Date: 2015年7月13日 上午10:37:27
 */
public class ThreadPoolFactory {
	private static  IThreadPoolManager mInstance = null;

	private ThreadPoolFactory(){}

	public static IThreadPoolManager getThreadPoolManager(){
		if (mInstance == null){
			synchronized(ThreadPoolManager.class){
				if (mInstance == null){
					mInstance = new ThreadPoolManager();
				}
			}

		}
		return mInstance;
	}
}

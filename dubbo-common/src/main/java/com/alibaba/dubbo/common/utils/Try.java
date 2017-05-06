package com.alibaba.dubbo.common.utils;

import com.alibaba.dubbo.common.logger.Logger;

public class Try {

	public static void withLog(ThrowableCallback fn, Logger logger) {
		try {
			fn.run();
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
		}
	}
	
	public static void withWarn(ThrowableCallback fn, Logger logger) {
		try {
			fn.run();
		} catch (Throwable e) {
			logger.warn(e.getMessage(), e);
		}
	}
	
	
	public static void ifNotEmpty(String v, Runnable fn){
		if(v!=null && v.length() >0){
			fn.run();
		}
	}
	
	public static void orElseThrow(ThrowableCallback fn){
		 try {
            fn.run();
         } catch (RuntimeException e) {
             throw (RuntimeException) e;
         } catch (Exception e) {
             throw new IllegalStateException(e.getMessage(), e);
         }
	}
	
	
	
	@FunctionalInterface
	public interface ThrowableCallback{
		void run() throws Exception;
	}
	
}

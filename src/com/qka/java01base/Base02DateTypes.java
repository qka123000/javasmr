package com.qka.java01base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Base02DateTypes {
	public static void main(String args[]) {

		Calendar calendar = Calendar.getInstance();
		
		// 获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
		System.out.println("date = " + sdf.format( ( new Date() ) ));
		
		//获取上月日期
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -1);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");		
		String doLasMonDat = sdf3.format(calendar.getTime());
		System.out.println("doLasMonDat=" + doLasMonDat);
		
		//获取10小时之后的时间
		calendar.setTime(new Date());  
		calendar.add(Calendar.HOUR_OF_DAY,10); 
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dofur10 = sdf4.format(calendar.getTime());
		System.out.println("dofur10:"+dofur10);   

		//获取前一天日期
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd");		
		String dealDate =sdf5.format(calendar.getTime()); 
		System.out.println("dealDate=" + dealDate);
	}
}
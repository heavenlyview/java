package kr.brains.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CarExample {
	public static void main(String[] args) throws Exception {
		
		
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.get(Calendar.YEAR));
		Week today = null;
		for(Week w : Week.values())
			System.out.println(w);
		
		int dow = rightNow.get(Calendar.DAY_OF_WEEK);
		switch(dow) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘은 : " + today);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(date));
		//System.out.println(rightNow.YEAR);
		//System.out.println(rightNow.Hour);
		
		Class clazz = Car.class;
		System.out.println(clazz.getPackageName() + "." + clazz.getName());

		clazz = Class.forName("kr.brains.api.Car");
		System.out.println(clazz.getPackageName());
	}

}

package cn.nio;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class dateOperateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		String beforeString = "3-23-2017 14:20:47";
		try {
			java.util.Date date = sdf.parse( beforeString );
			sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String result =sdf.format(date);
			System.out.println(result);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}

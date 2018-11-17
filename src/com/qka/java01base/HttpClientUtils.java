package com.qka.java01base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class HttpClientUtils {
	public static void main(String args[]) {
		try {
			System.out.println("main begin ...");
			Calendar c = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			
			Date beginDate = sdf.parse("2018-05-01");
			Date endDate = sdf.parse("2018-11-16");
			Date date = beginDate;
			while (date.getTime() <= endDate.getTime()) {
				String dealDate = sdf.format(date);
				System.out.println("dealDate =[" + dealDate + "] begin");
				sendPrompt(dealDate);
				System.out.println(sdf.format(date));
				c.setTime(date);
				c.add(Calendar.DATE, 1); // 日期加1天
				date = c.getTime();
				System.out.println("dealDate =[" + dealDate + "] end");

			}
			System.out.println("main end ...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendPrompt(String dealDate) throws Exception {
		String ipAddr = "http://101.200.35.94:8888/QuartzProject";
		String ctlSvc = "/scheProm/httpPromoter?1=1";
		String param4Get = "&dealDate=" + dealDate;
		String url = ipAddr + ctlSvc + param4Get;
		Map<String, Object> params4Post = new LinkedHashMap<>();

		System.out.println("url=[" + url + "]");
		sendUrl(url, params4Post);
	}

	public static void sendUrl(String strUrl, Map<String, Object> params)
			throws Exception {
		URL url = new URL(strUrl);

		// 开始访问

		StringBuilder postData = new StringBuilder();
		for (Map.Entry<String, Object> param : params.entrySet()) {
			if (postData.length() != 0)
				postData.append('&');
			postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
			postData.append('=');
			postData.append(URLEncoder.encode(String.valueOf(param.getValue()),
					"UTF-8"));
		}
		byte[] postDataBytes = postData.toString().getBytes("UTF-8");

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length",
				String.valueOf(postDataBytes.length));
		conn.setDoOutput(true);
		conn.getOutputStream().write(postDataBytes);

		Reader in = new BufferedReader(new InputStreamReader(
				conn.getInputStream(), "UTF-8"));

		StringBuilder sb = new StringBuilder();
		for (int c; (c = in.read()) >= 0;)
			sb.append((char) c);
		System.out.println("87>>" + sb.toString());
		conn.disconnect();
	}

}

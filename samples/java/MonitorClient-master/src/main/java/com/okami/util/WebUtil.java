package com.okami.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * 发送接收HTTP请求工具包
 * @author orleven
 * @date 2017年3月8日
 */
public class WebUtil {

	static RequestConfig requestConfig = RequestConfig.custom()  
	        .setSocketTimeout(3000)  
	        .setConnectTimeout(3000)  
	        .build();  
	/**
	 * post 方法
	 * @param targetUrl
	 * @param httpHeaders
	 * @param postParameters
	 */
	public static HttpResponse httpPost(String targetUrl,Map<String, String> httpHeaders,List<BasicNameValuePair> postParameters,int timeOut){
		HttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(targetUrl);
		for (String key : httpHeaders.keySet()) {
        	post.setHeader(key, httpHeaders.get(key));

        }
        try {
//        	post.setConfig(requestConfig);  
			post.setEntity(new UrlEncodedFormEntity(postParameters, "utf-8"));
			return client.execute(post);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * post 方法
	 * @param targetUrl
	 * @param httpHeaders
	 * @param postParameters
	 */
	public static HttpResponse httpPost(String targetUrl,Map<String, String> httpHeaders,byte[] postParameters){
		HttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(targetUrl);
		for (String key : httpHeaders.keySet()) {
        	post.setHeader(key, httpHeaders.get(key));
        }
        try {
//        	post.setConfig(requestConfig);  
        	post.setEntity(new ByteArrayEntity(postParameters));
        	return client.execute(post);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;

	}
	
	
	/**
	 * post 方法
	 * @param targetUrl
	 * @param httpHeaders
	 * @param postParameters
	 */
	public static HttpResponse httpPost(String targetUrl,Map<String, String> httpHeaders,String postParameters){
		HttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(targetUrl);
		for (String key : httpHeaders.keySet()) {
        	post.setHeader(key, httpHeaders.get(key));
        }
        try {
//        	post.setConfig(requestConfig);  
        	post.setEntity(new StringEntity(postParameters));
        	return client.execute(post);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;

	}
	
	/**
	 * get 方法
	 * @param targetUrl
	 * @param httpHeaders
	 */
	public static HttpResponse httpGet(String targetUrl,Map<String, String> httpHeaders){
		HttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(targetUrl);
		for (String key : httpHeaders.keySet()) {
        	get.setHeader(key, httpHeaders.get(key));
        }
        try {
//        	post.setConfig(requestConfig);  
        	return client.execute(get);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}

	/**
	 * delete 方法
	 * @param targetUrl
	 * @param httpHeaders
	 */
	public static HttpResponse httpDelete(String targetUrl,Map<String, String> httpHeaders){
		HttpClient client = HttpClients.createDefault();
		HttpDelete delete = new HttpDelete(targetUrl);
		for (String key : httpHeaders.keySet()) {
			delete.setHeader(key, httpHeaders.get(key));
        }
        try {
//        	post.setConfig(requestConfig);  
        	return client.execute(delete);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Head 方法
	 * @param targetUrl
	 * @param httpHeaders
	 */
	public static HttpResponse httpHead(String targetUrl,Map<String, String> httpHeaders){
		HttpClient client = HttpClients.createDefault();
		HttpHead head = new HttpHead(targetUrl);
		for (String key : httpHeaders.keySet()) {
			head.setHeader(key, httpHeaders.get(key));
        }
        try {
//        	post.setConfig(requestConfig);  
        	return client.execute(head);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * put 方法
	 * @param targetUrl
	 * @param httpHeaders
	 */
	public static HttpResponse httpPut(String targetUrl,Map<String, String> httpHeaders){
		HttpClient client = HttpClients.createDefault();
		HttpPut put = new HttpPut(targetUrl);
		for (String key : httpHeaders.keySet()) {
			put.setHeader(key, httpHeaders.get(key));
        }
        try {
//        	post.setConfig(requestConfig);  
        	return client.execute(put);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * options 方法
	 * @param targetUrl
	 * @param httpHeaders
	 */
	public static HttpResponse httpOptions(String targetUrl,Map<String, String> httpHeaders){
		HttpClient client = HttpClients.createDefault();
		HttpOptions options = new HttpOptions(targetUrl);
		for (String key : httpHeaders.keySet()) {
			options.setHeader(key, httpHeaders.get(key));
        }
        try {
//        	post.setConfig(requestConfig);  
        	return client.execute(options);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取response 状态信息
	 * @return
	 */
	public static String getStatusLine(HttpResponse response){
		if(response==null){
			return null;
		}
		return response.getStatusLine().toString();
	}
    
	/**
	 * 获取response 头部
	 * @return
	 */
	public static Map<String, String> getResponseAllHeaders(HttpResponse response){
		if(response==null){
			return null;
		}
		Header headers[] = response.getAllHeaders();  
		Map<String, String> httpHeaders = new HashMap<String, String>();
	    for (int i =0;i < headers.length;i++){    
	       httpHeaders.put(headers[i].getName(), headers[i].getValue());
	    } 
	    return httpHeaders;
	}
	
//	/**
//	 * 获取response 头部的某条信息
//	 * @return
//	 */
//	public static String getResponseHeadersKey(HttpResponse response,String name){
//		if(response==null){
//			return null;
//		}
//		Header headers[] = response.getHeaders(name);
//	    for (int i =0;i < headers.length;i++){    
//	    	if(headers[i].getName().equals(name)){
//	    		return headers[i].getValue();
//	    	}
//	    } 
//	    return null;
//	}
	
	/**
	 * 获取响应实体
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	public static String getResponseBody(HttpResponse response){
		if(response==null){
			return null;
		}
		HttpEntity httpEntity = response.getEntity();
		String result="";
		String line="" ;
		try {
			InputStream inputStream=httpEntity.getContent();
		    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
		    while((line=bufferedReader.readLine()) != null){
			      result=result+line+"\n";
			}
		} catch (ParseException e) {
			
		} catch (IOException e) {
			
		} finally{
			if (result.equals("")){
				return null;
			}
		}
		return result;
	}
	
	
	/**
	 * 获取返回相响应体
	 * @data 2017年4月30日
	 * @param response
	 * @return
	 */
	public static byte[] getResponseBodyBytes(HttpResponse response){
		if(response==null){
			return null;
		}
		HttpEntity httpEntity = response.getEntity();
		byte[] result = null;
		try {
			result = EntityUtils.toByteArray(httpEntity);

		} catch (ParseException e) {
			
		} catch (IOException e) {
			
		} 
		return result;
	}
	
	/**
	 * 上传文件
	 * @data 2017年4月23日
	 * @param targetUrl
	 * @param httpHeaders
	 * @param filename
	 * @return
	 */
	public static HttpResponse uploadFile(String targetUrl,Map<String, String> httpHeaders,String filename){
		HttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(targetUrl);
		FileBody bin = new FileBody(new File(filename));
		
        try {
        	StringBody comment = new StringBody("Filename: " + filename);
    		MultipartEntity reqEntity = new MultipartEntity();
    		reqEntity.addPart("file", bin);
    		reqEntity.addPart("comment", comment);
        	post.setEntity(reqEntity);
        	return client.execute(post);
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		} catch (ClientProtocolException e) {
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}
    

}

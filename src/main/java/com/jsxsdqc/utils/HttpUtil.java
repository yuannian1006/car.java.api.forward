package com.jsxsdqc.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtil {

	/**
	 *
	 * @param url
	 * @param reqJson
	 * @return
	 */
	public static String postJson(String url,String reqJson) {
		CloseableHttpClient httpClient;
		CloseableHttpResponse httpResponse = null;
		String result = "";
		httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);

		httpPost.setConfig(REQUEST_CONFIG);
		httpPost.addHeader("Content-Type", "application/json");

		httpPost.setEntity(new StringEntity(reqJson,"utf-8"));
		try {
			// httpClient对象执行post请求,并返回响应参数对象
			httpResponse = httpClient.execute(httpPost);
			// 从响应对象中获取响应内容
			HttpEntity entity = httpResponse.getEntity();
			result = EntityUtils.toString(entity);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			if (null != httpResponse) {
				try {
					httpResponse.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != httpClient) {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("result: " + result);
		return result;

	}

	/**
	 *
	 * @param url
	 * @param reqJson
	 * @return
	 */
	public static String postJsonwithheader (String url,String reqJson, String header) {
		CloseableHttpClient httpClient;
		CloseableHttpResponse httpResponse = null;
		String result = "";
		httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);

		httpPost.setConfig(REQUEST_CONFIG);
		httpPost.addHeader("Content-Type", "application/json");
		httpPost.addHeader("authorization", header);

		httpPost.setEntity(new StringEntity(reqJson,"utf-8"));
		try {
			// httpClient对象执行post请求,并返回响应参数对象
			httpResponse = httpClient.execute(httpPost);
			// 从响应对象中获取响应内容
			HttpEntity entity = httpResponse.getEntity();
			result = EntityUtils.toString(entity);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			if (null != httpResponse) {
				try {
					httpResponse.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != httpClient) {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("result: " + result);
		return result;

	}

	/**
	 *
	 */
	private final static RequestConfig REQUEST_CONFIG = RequestConfig.custom().setSocketTimeout(10000)
			.setConnectTimeout(50000).setConnectionRequestTimeout(10000).build();

	/**
	 * @param url
	 */
	public static String delete(String url) {
		CloseableHttpResponse httpResponse = null;
		HttpEntity entity = null;
		HttpDelete httpDelete = new HttpDelete(url);


		CloseableHttpClient httpClient = HttpClients.createDefault();
		httpDelete.setConfig(REQUEST_CONFIG);
		try {
			httpResponse = httpClient.execute(httpDelete);
			entity = httpResponse.getEntity();
			return EntityUtils.toString(entity, "UTF-8");
		}catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			if (null != httpResponse) {
				try {
					httpResponse.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != httpClient) {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}
}
package com.hashcodehub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

public class Test {

	public static void main(String args[]) throws UnsupportedOperationException, IOException {

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url("https://jsonplaceholder.typicode.com/posts").build();

		try {
			Response response = client.newCall(request).execute();

			System.out.println(response.body().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

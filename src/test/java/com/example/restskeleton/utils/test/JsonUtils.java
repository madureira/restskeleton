package com.example.restskeleton.utils.test;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;

/**
 * A simple class that helps to manipulate json from response and convert to
 * object if needed.
 * 
 * @author madureira
 *
 */
public class JsonUtils {

	public static String getJsonFrom(Response response) {
		return response.readEntity(String.class);
	}

	public static Converter convert(String json) {
		return new Converter(json);
	}

	public static class Converter {

		private String json;

		public Converter(String json) {
			this.json = json;
		}

		@SuppressWarnings("unchecked")
		public <T> T to(Class<?> clazz) {
			Gson gson = new Gson();
			return (T) gson.fromJson(this.json, clazz);
		}

	}

}

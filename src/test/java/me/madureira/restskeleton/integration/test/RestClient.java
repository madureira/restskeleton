package me.madureira.restskeleton.integration.test;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

/**
 * This is just a wrapper for ResteasyClientBuilder
 * 
 * @author madureira
 *
 */
public class RestClient {

	public static Methods at(String uri) {
		return getMethods(uri);
	}

	private static Methods getMethods(String uri) {
		return new Methods(uri);
	}

	public static class Methods {

		private String uri;

		public Methods(String uri) {
			this.uri = uri;
		}

		public Response get() {
			return new ResteasyClientBuilder().build().target(uri).request().get();
		}

	}
}

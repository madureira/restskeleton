package com.example.restskeleton.utils.test;

import org.jboss.resteasy.plugins.server.tjws.TJWSEmbeddedJaxrsServer;

/**
 * Class used to create a server in memory and run the application endpoints.
 * When the test finish the server is stopped.
 * 
 * @author madureira
 *
 */
public class RestServer {

	private static int PORT = 8000;
	private static final String DOMAIN = "http://localhost";
	private static TJWSEmbeddedJaxrsServer server;

	public static void createServer(Object resource) {
		server = new TJWSEmbeddedJaxrsServer();
		server.setPort(PORT);
		server.getDeployment().getResources().add(resource);
	}

	public static void start() {
		server.start();
	}

	public static void close() {
		if (server != null) {
			server.stop();
			server = null;
		}
	}

	public static String getUrl() {
		return DOMAIN + ":" + PORT;
	}

}

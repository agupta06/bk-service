package com.resolvebug.app.response.manager;

import java.net.URI;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.apache.log4j.Logger;

public class ResponseBuilder {
	private Logger logger = Logger.getLogger(ResponseBuilder.class);

	public Response buildResponse(Object obj) {
		return Response.status(Response.Status.OK).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST , PUT , DELETE , HEAD , PATCH , OPTIONS")
				.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization,"
						+ "CHECKOUT,CONNECT,COPY,DELETE,GET,HEAD,LOCK,M-SEARCH,MERGE,MKACTIVITY,MKCALENDAR,MKCOL,"
						+ "MOVE,NOTIFY,PATCH,POST,PROPFIND,PROPPATCH,PURGE,PUT,REPORT,SEARCH,SUBSCRIBE,TRACE,UNLOCK,UNSUBSCRIBE")
				.header("Access-Control-Allow-Credentials", "true").entity(obj).build();
	}

	public Response buildResponse(UriBuilder builder) {
		return Response.seeOther(builder.build()).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST , PUT , DELETE , HEAD , PATCH , OPTIONS")
				.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization,"
						+ "CHECKOUT,CONNECT,COPY,DELETE,GET,HEAD,LOCK,M-SEARCH,MERGE,MKACTIVITY,MKCALENDAR,MKCOL,"
						+ "MOVE,NOTIFY,PATCH,POST,PROPFIND,PROPPATCH,PURGE,PUT,REPORT,SEARCH,SUBSCRIBE,TRACE,UNLOCK,UNSUBSCRIBE")
				.header("Access-Control-Allow-Credentials", "true").build();
	}

	public Response buildResponse(URI uri) {
		return Response.seeOther(uri).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST , PUT , DELETE , HEAD , PATCH , OPTIONS")
				.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization,"
						+ "CHECKOUT,CONNECT,COPY,DELETE,GET,HEAD,LOCK,M-SEARCH,MERGE,MKACTIVITY,MKCALENDAR,MKCOL,"
						+ "MOVE,NOTIFY,PATCH,POST,PROPFIND,PROPPATCH,PURGE,PUT,REPORT,SEARCH,SUBSCRIBE,TRACE,UNLOCK,UNSUBSCRIBE")
				.header("Access-Control-Allow-Credentials", "true").build();

	}

	public Response buildNoContentAvailableResponse() {
		return Response.status(Response.Status.NO_CONTENT).build();
	}
}

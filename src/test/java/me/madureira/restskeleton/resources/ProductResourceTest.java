package me.madureira.restskeleton.resources;

import static java.util.Arrays.asList;
import static me.madureira.restskeleton.integration.IntegrationTestUtil.createServer;
import static me.madureira.restskeleton.integration.IntegrationTestUtil.endPoint;
import static me.madureira.restskeleton.integration.IntegrationTestUtil.serverStart;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import javax.ws.rs.core.Response;

import me.madureira.restskeleton.models.Product;
import me.madureira.restskeleton.services.ProductService;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Unit test coverage to {@link ProductResource}
 * 
 * @author madureira
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductResourceTest {

	@Mock
	private static ProductService service;

	@InjectMocks
	private static ProductResource resource;

	@BeforeClass
	public static void setUpClass() {
		resource = new ProductResource();
		createServer(resource);
		serverStart();
	}

	@Test
	public void shouldGetTheProductById() {
		Product product = new Product();
		product.setId(123);
		product.setName("Some product");
		product.setDescription("This is a simple product for the example");
		product.setKeywords(asList("test", "rest", "service"));

		given(service.getById(123)).willReturn(product);

		Response response = getOn(endPoint("product/123"));

		assertThat(response.getStatus(), is(200));
		verify(service).getById(123);
	}

	private Response getOn(String uri) {
		return new ResteasyClientBuilder().build().target(uri).request().get();
	}

}

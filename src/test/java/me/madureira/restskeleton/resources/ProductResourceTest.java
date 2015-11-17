package me.madureira.restskeleton.resources;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import javax.ws.rs.core.Response;

import me.madureira.restskeleton.integration.test.RestClient;
import me.madureira.restskeleton.integration.test.RestServer;
import me.madureira.restskeleton.models.Product;
import me.madureira.restskeleton.services.ProductService;

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
		RestServer.createServer(resource);
		RestServer.start();
	}

	@Test
	public void shouldGetTheProductById() {
		Product product = new Product();
		product.setId(123);
		product.setName("Some product");
		product.setDescription("This is a simple product for the example");
		product.setKeywords(asList("test", "rest", "service"));

		given(service.getById(123)).willReturn(product);

		String uri = RestServer.getUrl();
		uri += "/product/123";

		Response response = RestClient.at(uri).get();

		assertThat(response.getStatus(), is(200));
		verify(service).getById(123);
	}

}

package com.citys.rest;

import javax.inject.Inject;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.*;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.citys.rest.contorllers.CityController;
import com.citys.rest.share.model.City;
import com.citys.rest.share.repositorys.CityRepo;

/**
 * Integration test for the {@link CityController}.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AppTest {

	private Random randomGenerator = new Random();

	private Long testId = randomGenerator.nextLong();

	@Inject
	private TestRestTemplate restTemplate;

	@Inject
	private CityRepo cityRepo;

	private final static String testCityName = "My Kind of City";

	@MockBean
	private CityController cityController;

	@Before
	public void setup() {
		City city = new City();
		mockCity(city);
		List<City> returnList = new ArrayList<>();
		returnList.add(city);
		given(this.cityController.getCitys("ro")).willReturn(returnList);
	}

	@Test
	public void testCityController() throws Exception {
		Object response = this.restTemplate.getForEntity("/cities/ro", String.class);
		assertThat(response.toString().contains(testCityName));
	}

	@Test
	public void testCityRepo() {
		List<City> list = (List<City>) cityRepo.findAllByCountry("br");
		assertThat(list.size() == 2);
	}

	private void mockCity(City city) {
		city.setId(testId);
		city.setCity(testCityName);
	}

}

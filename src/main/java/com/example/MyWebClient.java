package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
class MyWebClient {

	private final RestTemplate restTemplate;

	public MyWebClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
}

package soa.project.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import soa.project.demo.model.TestClient;

@Service
public class PaiementService {
    @Autowired
    private RestTemplate restTemplate;

    public TestClient bonjour(){
        // HttpHeaders headers = new HttpHeaders();

		// headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

        // HttpEntity<String> entity = new HttpEntity<String>(headers);
		// // Request to return JSON format
		// headers.setContentType(MediaType.APPLICATION_JSON);
        // ResponseEntity<TestClient> response = restTemplate.exchange("http://fbl.mbmultibusiness.com/api/tester", //
		// 		HttpMethod.GET, entity,TestClient.class);
      // String result =;
      TestClient testClient=restTemplate.getForObject("http://fbl.mbmultibusiness.com/api/tester",TestClient.class);

       return testClient;
    }
}



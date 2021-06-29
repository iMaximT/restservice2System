package restservice.systema.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import restsevice.systemB.model.PersonDTO;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class SystemAController {

@PostMapping
public String getRequestFromUser(@RequestBody PersonDTO inputData)  {

    return sendRequestToSystemB(inputData);
}

    private String sendRequestToSystemB(PersonDTO personDTO) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        URI uri = null;
        try {
            uri = new URI("http://localhost:8080/");

            HttpEntity<PersonDTO> httpEntity = new HttpEntity<>(personDTO, headers);

            RestTemplate restTemplate = new RestTemplate();

            return restTemplate.postForObject(uri, httpEntity, String.class);

        } catch (Throwable e) {
            return "отказ";
        }
    }

}

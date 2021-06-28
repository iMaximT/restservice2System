package restservice.systema;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import restsevice.systemB.model.Entity;

import java.net.URI;
import java.net.URISyntaxException;

public class Application {
    public static void main(String[] args) throws URISyntaxException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        URI uri = new URI("http://localhost:8080/");
        Entity entity = new Entity();
        entity.setId("1234567890123456");
        entity.setFullName("fullName");
        entity.setBirthday("Ivan Ivanov");
        entity.setDocument("Ivan Ivanov");
        entity.setImage("Any Bytes from image".getBytes());

        HttpEntity<Entity> httpEntity = new HttpEntity<>(entity, headers);

        RestTemplate restTemplate = new RestTemplate();
        String answer = restTemplate.postForObject(uri, httpEntity, String.class);
        System.out.println("answer:    " + answer);
    }
}

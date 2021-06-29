package restservice.systema;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import restsevice.systemB.model.PersonDTO;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws URISyntaxException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        URI uri = new URI("http://localhost:8080/");
        PersonDTO personDTO = new PersonDTO();
/*
        entity.setId("1234567890123456");
        entity.setFullName("fullName");
        entity.setBirthday("Ivan Ivanov");
        entity.setDocument("Ivan Ivanov");
        entity.setImage("Any Bytes from image".getBytes());
*/
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ввведите цифро-буквенный идентификатор длинной не более 19 символов и не менее 16:");
        personDTO.setId(scanner.nextLine());

        System.out.println("Ввведите ФИО:");
        personDTO.setFullName(scanner.nextLine());

        System.out.println("Ввведите дату рождения:");
        personDTO.setBirthday(scanner.nextLine());

        System.out.println("Ввведите номер мобильного телефона (либо иной способ связи):");
        personDTO.setDocument(scanner.nextLine());

        System.out.println("Ввведите путь к фото:");
        personDTO.setImage("Any Bytes from image".getBytes());


        HttpEntity<PersonDTO> httpEntity = new HttpEntity<>(personDTO, headers);

        RestTemplate restTemplate = new RestTemplate();
        String answer = restTemplate.postForObject(uri, httpEntity, String.class);
        System.out.println("answer:    " + answer);
    }
}

package com.productos.common;

import org.springframework.http.HttpEntity;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by juancho on 15/01/2017.
 */
@Service
public class TemplateRest {

    public <T> T consumeGetServices(String url, MultiValueMap<String, String> parametros, Class<T> classResponse) {
        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParams(parametros);

        return restTemplate.getForObject(builder.build(false).toUriString(), classResponse);
    }

    public <T> T consumePostServices(String url, Object objeto, Class<T> classResponse) {
    	RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(url, objeto, classResponse);
    }

    public <T> T consumePostServices(String url, Object objeto, MultiValueMap<String, String> headers, Class<T> classResponse) {
    	RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());

        HttpEntity<Object> request = new HttpEntity<Object>(objeto, headers);
        return restTemplate.postForObject(url, request, classResponse);
    }
}

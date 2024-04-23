package mvp.prototipo_versao2.requisicoes_api_google.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DirectionsService {
    
    @Value("${google.maps.api.key}") // Injeta a chave da API do Google Maps do arquivo application.properties
    private String chaveApi; // Declaração da variável que armazenará a chave da API

    private final RestTemplate restTemplate; // Declaração da variável restTemplate

    // Construtor da classe DirectionsService, injetando RestTemplate: atribui a instância de RestTemplate fornecida ao atributo restTemplate
    public DirectionsService(RestTemplate restTemplate) { 
        this.restTemplate = restTemplate; 
    }

    // Método que faz a solicitação para a API do Google Maps e retorna as direções:
    public String getDirections(String origem, String destino) {
        
        // Constrói a URL da API do Google Maps
        String apiUrl = "https://maps.googleapis.com/maps/api/directions/json" +
                "?origin=" + origem +
                "&destination=" + destino +
                "&key=" + chaveApi;

        // Faz uma solicitação GET para a URL da API e retorna a resposta como uma String
        return restTemplate.getForObject(apiUrl, String.class);
    }

}

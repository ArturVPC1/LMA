package mvp.prototipo_versao2.requisicoes_api_google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import mvp.prototipo_versao2.requisicoes_api_google.service.DirectionsService;

@RestController
public class RequisicaoController {
    
    private final DirectionsService directionsService; // Declaração da variável directionsService
    
    // Construtor da classe RequisicaoController, injetando DirectionsService
    public RequisicaoController(DirectionsService directionsService) { 
        this.directionsService = directionsService; // Atribui a instância de DirectionsService fornecida ao atributo directionsService
    }

    @GetMapping("/directions") // Mapeia o método para a URL "/directions" e define que ele será chamado em requisições GET
    // Método que será chamado ao acessar a URL mapeada
    public String getDirections(@RequestBody RequisicaoDirecao requisicao) { 

        // Chama o método getDirections do serviço DirectionsService e retorna a resposta
        return directionsService.getDirections(requisicao.getOrigem(), requisicao.getDestino()); 
    }
}


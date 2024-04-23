package mvp.prototipo_versao2.requisicoes_api_google.controller;

public class RequisicaoDirecao {
    
    //Declaração das variáveis que serão utilizadas na URL de requisição da API Directions
    private String origem;
    private String destino;


    //#region: Getters e Setters:
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    //#endregion
    
}

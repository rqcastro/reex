package reex;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.SecureRandom;

@Entity
public class PerfilImovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private static final int APTO = 1;
    private static final int CASA = 2;
    private static final int OUTRO = 3;
    private String tipoImovel;
    private String outroImovel;
    private String cidade;
    private String bairro;
    private String metragem;
    private String dormitorios;
    private String vagas;
    private String valorImovel;
    private String finaciamento;
    private static final int VALOR_ATE_250 = 1;
    private static final int VALOR_ATE_500 = 2;
    private static final int VALOR_ATE_1MM = 3;
    private static final int VALOR_ACIMA_1MM = 4;
    private static final char FINANC_SIM = 'S';
    private static final char FINANC_NAO = 'N';
    private String machineIP;
    private String compraOuVenda;
    private String querComprar;
    private String querPermuta;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel){
        this.tipoImovel = tipoImovel;
    }

    public String getOutroImovel() {
        return outroImovel;
    }

    public void setOutroImovel(String outroImovel){
        this.outroImovel = outroImovel;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getMetragem() {
        return metragem;
    }

    public void setMetragem(String metragem){
        this.metragem = metragem;
    }

    public String getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(String dormitorios){
        this.dormitorios = dormitorios;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas){
        this.vagas = vagas;
    }

    public String getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(String valorImovel){
        this.valorImovel = valorImovel;
    }

    public String getFinaciamento(){
        return finaciamento;
    }

    public void setFinaciamento(String finaciamento){
        this.finaciamento = finaciamento;
    }

    public String getMachineIP(){
        return machineIP;
    }

    public void setMachineIP(String machineIP){
        this.machineIP = machineIP;
    }

    public String getCompraOuVenda() {
        return compraOuVenda;
    }

    public void setCompraOuVenda(String compraOuVenda) {
        this.compraOuVenda = compraOuVenda;
    }

    public String getQuerComprar(){
        return querComprar;
    }

    public void setQuerComprar(String querComprar) {
        this.querComprar = querComprar;
    }

    public String getQuerPermuta() {
        return querPermuta;
    }

    public void setQuerPermuta(String querPermuta){
        this.querPermuta = querPermuta;
    }
}

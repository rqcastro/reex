package reex;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class CorretorDetalhe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String especialidade;
    private String outraEspecialidade;
    private String cidade;
    private String bairro;
    private String machineIP;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getOutraEspecialidade() {
        return outraEspecialidade;
    }

    public void setOutraEspecialidade(String outraEspecialidade) {
        this.outraEspecialidade = outraEspecialidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMachineIP() {
        return machineIP;
    }

    public void setMachineIP(String machineIP) {
        this.machineIP = machineIP;
    }
}

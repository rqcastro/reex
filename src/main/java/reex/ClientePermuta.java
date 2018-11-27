package reex;

//import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.servlet.http.HttpServletRequest;

@Entity // tells hibernate to make a table out of this class
public class ClientePermuta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String nome;
    private String email;
    private String celular;
    private String machineIP;
    private String compraOuVenda;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMachineIP() {
        return machineIP;
    }

    public void setMachineIP(String machineIP) {
        this.machineIP = machineIP;
    }

    public String getCompraOuVenda() {
        return compraOuVenda;
    }

    public void setCompraOuVenda(String compraOuVenda) {
        this.compraOuVenda = compraOuVenda;
    }
}

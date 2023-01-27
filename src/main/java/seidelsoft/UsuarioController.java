package seidelsoft;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SessionScoped
@ManagedBean(name = "usuarioController")
public class UsuarioController {

    private String name;
    private List<String> nomes = new ArrayList<>();

    public String addNome() {
        nomes.add(name);
        return "";
    }

}

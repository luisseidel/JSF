package seidelsoft;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;

@Getter
@Setter
@ManagedBean(name = "usuarioController")
public class UsuarioController {

    private String name;

}

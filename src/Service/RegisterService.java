package Service;

import model.Usuario;
import repository.UserRepository;


public class RegisterService {
    private Usuario usuario = new Usuario();

    public void almacenarUsuario(String email, String password) {
        this.usuario.setEmail(email);
        this.usuario.setPassword(password);

        UserRepository.almacenarUsuario(this.usuario, password);
    }


    public String sanitizarEmail(String email) {
        return email.replace("@", "").replace(".", "");
    }
}
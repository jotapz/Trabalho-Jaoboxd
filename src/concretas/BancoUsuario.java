package concretas;

import abstratas.BancoBase;
import interfaces.Seguranca;

public class BancoUsuario extends BancoBase implements Seguranca {

    @Override
    public boolean registrar(String nome, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                System.out.println("usuario ja existe");
                return false;
            }
        }
        usuarios.add(new Usuario(nome, senha));
        System.out.println("usuario registrado com sucesso!");
        return true;
    }


    @Override
    public boolean login(String nome, String senha) {
        for (Usuario usuario : usuarios){
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)){
                System.out.println("login bem sucedido!");
                return true;
            }
        }
        System.out.println("Usuario ou senha invalidos");
        return false;
    }
}

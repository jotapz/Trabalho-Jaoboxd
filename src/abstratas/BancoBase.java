package abstratas;

import concretas.Usuario;
import java.util.ArrayList;
import java.util.List;

public abstract class BancoBase{

    public List<Usuario> usuarios = new ArrayList<>();

/*
    public List<concretas.Usuario> usuarios = new ArrayList<>();


    public boolean registrar(String nome, String senha) {
        for (concretas.Usuario usuario : usuarios){
            if (usuario.getNome().equals(nome)){
                System.out.println("usuario ja existe");
                return false;
            }
        }
        usuarios.add(new concretas.Usuario(nome, senha));
        System.out.println("usuario registrado com sucesso!");
        return true;
    }

    public boolean login(String nome, String senha){
        for (concretas.Usuario usuario : usuarios){
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)){
                System.out.println("login bem sucedido!");
                return true;
            }
        }
        System.out.println("concretas.Usuario ou senha invalidos");
        return false;
    }  */
}
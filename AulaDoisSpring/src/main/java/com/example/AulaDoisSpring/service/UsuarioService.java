package com.example.AulaDoisSpring.service;

import com.example.AulaDoisSpring.model.Usuario;
import com.example.AulaDoisSpring.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario){
        try {
            return usuarioRepository.save(usuario);
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario atualizar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id){
        usuarioRepository.deleteById(id);
    }

}

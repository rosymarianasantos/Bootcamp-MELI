package br.dh.meli.Perolas.service;

import br.dh.meli.Perolas.model.JoiaBD;
import br.dh.meli.Perolas.repository.IJoiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JoiaService {
    @Autowired
    private IJoiaRepo repo;

    public JoiaBD inserir(JoiaBD joiaBD) {
        JoiaBD newJoia = repo.save(joiaBD);
        return newJoia;
    }
    public Iterable<JoiaBD> findJoias() {
        Iterable<JoiaBD> allJoias = repo.findAll();
        return allJoias;
    }

    public JoiaBD update(Long codigo, JoiaBD joiaBD) {
        Optional<JoiaBD> joia = repo.findById(codigo);
        JoiaBD novaJoia = joia.get();
        novaJoia.setPeso(joiaBD.getPeso());
        novaJoia.setMaterial(joiaBD.getMaterial());
        novaJoia.setQuilates(joiaBD.getQuilates());
        return repo.save(novaJoia);
    }

    public void delete(long codigo) {
        repo.deleteById(codigo);
    }
}

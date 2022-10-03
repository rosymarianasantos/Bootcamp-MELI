package Service;

import Repository.SintomaRepository;
import enity.Sintoma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SintomaService {
    @Autowired
    private SintomaRepository sintomaRepository;

    public void save(Sintoma sintoma) {
        sintomaRepository.saveSintoma(sintoma);
    }
    public List<Sintoma> findAllSympton(){
        return sintomaRepository.getSintomaList();
    }
    public Optional<Sintoma> findByName(String name) {
        return sintomaRepository.getSintomaList().stream().filter(s-> s.getNome().equals(name)).findFirst();
    }
}

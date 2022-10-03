package Repository;

import enity.Sintoma;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class SintomaRepository {

    private List<Sintoma> sintomaList;

    public void saveSintoma(Sintoma sintoma) {
        this.sintomaList.add(sintoma);
    }
}


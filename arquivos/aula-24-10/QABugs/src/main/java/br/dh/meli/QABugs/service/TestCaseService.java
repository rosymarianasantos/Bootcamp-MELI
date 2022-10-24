package br.dh.meli.QABugs.service;

import br.dh.meli.QABugs.model.TestCase;
import br.dh.meli.QABugs.repository.TestCaseRepo;
import net.bytebuddy.build.Plugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
public class TestCaseService {
    @Autowired
    private TestCaseRepo repo;

    public List<TestCase> getAll() {
        List<TestCase> testCase = repo.findAll();
        return testCase;
    }
    public TestCase findById(long id) {
        Optional<TestCase> optionalTestCase = repo.findById(id);
        return optionalTestCase.orElse(null);
    }

    public List<TestCase> findByDate(String data) {
        System.out.println(data);
        List<TestCase> list = repo.findAll();
        System.out.println(list);


        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Date data5 = new Date(data);
        Date data2 = formato.parse(data5.toString());
        //LocalDateTime dataHora = LocalDateTime.parse(data, formato);
       // String formatado = dataHora.format(novo);
        //System.out.println(formato.format(data2));

        System.out.println(data2);

        List<TestCase> newTestCase = list.stream().filter(testCase -> (testCase.getLast_update().toString()).equals(data2)).collect(Collectors.toList());
        return newTestCase;
    }

    public TestCase created(TestCase testCase) {
        TestCase newTestCase = repo.save(testCase);
        return newTestCase;
    }

    public TestCase update(TestCase testCase, long id){
        Optional <TestCase> optionalTestCase = repo.findById(id);
        TestCase updateTestCase = optionalTestCase.get();

        updateTestCase.setDescription(testCase.getDescription());
        updateTestCase.setTested(testCase.isTested());
        updateTestCase.setLast_update(testCase.getLast_update());
        updateTestCase.setPassed(testCase.isPassed());
        updateTestCase.setNumber_of_tries(testCase.getNumber_of_tries());

        return repo.save(updateTestCase);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}

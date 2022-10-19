package com.meli.obterdiploma.service;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.repository.StudentDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.validation.Valid;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ObterDiplomaServiceTest {

     @Mock
    private IStudentDAO studentDAO;

    @InjectMocks
    private ObterDiplomaService service;

    @BeforeEach
    void setup(){
          studentDAO = new StudentDTO(1, "Juan", "messagem aleatoria", 7.33, );
    }

    @Test
    @DisplayName("Valida analyzeScores")
    void validaMedia_retornaEstudante(){
        Mockito.when(service.analyzeScores(1L)).thenReturn(studentDAO);


    }
}

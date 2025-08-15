package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() -1; i >= 0; i --){
            palavraInvertida += palavra.charAt(i);
        }
        return palavraInvertida.equalsIgnoreCase(palavra);
    }
}

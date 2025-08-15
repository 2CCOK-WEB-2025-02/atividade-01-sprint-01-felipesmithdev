package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

        @GetMapping("/ex-03/{n}")
        public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
            ExercicioDificilResponse response = new ExercicioDificilResponse();
            if (n <= 0){
                response.setSoma(0);
                response.setEnesimoTermo(0);
                return response;
            }
            if (n == 1){
                response.setSoma(1);
                response.setEnesimoTermo(1);
                return response;
            }
            List<Integer> listaFibo = new ArrayList<>();
            int soma = 0;
            listaFibo.add(1);
            listaFibo.add(1);

            for (int i = 2; i < n; i++){
                int ultimo = listaFibo.get(listaFibo.size() - 1);
                int penultimo = listaFibo.get(listaFibo.size() - 2);
                listaFibo.add(ultimo + penultimo);
            }

            for (int num: listaFibo){
                soma += num;
            }
            response.setEnesimoTermo(listaFibo.get(n - 1));
            response.setSoma(soma);
            return response;

        }
}

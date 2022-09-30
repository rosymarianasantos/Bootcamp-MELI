package Romanos.Romanos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Numeros {
    @GetMapping("/{id}")

    public String num(@PathVariable String id) {
        switch (id) {
            case "1":
                return "I";
            case "2":
                return "II";
            case "3":
                return "III";
            case "4":
                return "IV";
            case "5":
                return "V";
            case "6":
                return "VI";
            case "7":
                return "VII";
            case "8":
                return "VIII";
            case "9":
                return "IX";
            case "10":
                return "X";
            case "50":
                return "L";
            case "100":
                return "C";
            case "500":
                return "D";
            case "1000":
                return "M";
            default:
                return "deu ruim";
        }
    }

}

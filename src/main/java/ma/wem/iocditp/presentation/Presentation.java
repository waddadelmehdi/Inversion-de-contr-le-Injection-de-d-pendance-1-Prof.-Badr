package ma.wem.iocditp.presentation;

import ma.wem.iocditp.metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Presentation implements CommandLineRunner {
    @Autowired
    private IMetier metier;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Calculation result: " + metier.calcul());
    }

    public static void main(String[] args) {
        SpringApplication.run(Presentation.class, args);
    }
}

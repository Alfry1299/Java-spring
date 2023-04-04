package it.aulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import it.aulab.model.Joker;
import it.aulab.model.Macchina;
import it.aulab.model.Pistola;
import it.aulab.model.Trucco;
import it.aulab.model.Vestiti;


@Configuration
public class AppConfig {
    @Bean(name = "joker")
    public Joker getJoker(){
        return new Joker( getVestiti(), getMacchina());
    }

    @Bean(name = "macchina")
    public Macchina getMacchina(){
        return new Macchina("Grigio");
        
    }

    @Bean(name = "pistola")
    public Pistola getPistola(){
        return new Pistola(6);
        
    }

    @Bean(name = "trucco")
    public Trucco getTrucco(){
        return new Trucco("Bianco e Rosso");
        
    }

    @Bean(name = "vestiti")
    public Vestiti getVestiti(){
        return new Vestiti("Viola e Nero" , getTrucco(), getPistola());
        
    }


}



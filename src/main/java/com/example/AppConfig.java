package com.example;

 import com.example.games.Game;
 import com.example.games.Mario;
 import com.example.games.Pacman;
 import com.example.games.TempleRun;

 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

     @Bean("mario")
     public Game mario() {
         return new Mario();
     }

     @Bean("pacman")
     public Game pacman() {
         return new Pacman();
     }


     @Bean("templeRun")
     @Primary
     public Game templeRun() {
         return new TempleRun();


     }
}

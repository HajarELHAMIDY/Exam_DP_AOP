package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import exam.entities.Point;
import exam.traitement.Cercle;
import exam.traitement.Dessin;
import exam.traitement.GroupFigure;
import exam.traitement.ImplTraitement1;
import exam.traitement.InterfaceTraitement;
import exam.traitement.Observer;
import exam.traitement.Parametrage;
import exam.traitement.Rectangle;

@SpringBootApplication
public class ExamDpAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamDpAopApplication.class, args);
	}
	
	@Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
        	InterfaceTraitement it = new ImplTraitement1();
            Dessin d =new Dessin(it);
            		
            d.add((new Cercle(2,new Point(1,0))));
            d.add((new Rectangle(2,2,new Point(1,0))));
            
            GroupFigure c=new   GroupFigure(new Point(0,0));
       
            d.add(c);
            List<Observer> obs=new ArrayList<>();
            obs.add(new Rectangle(1,14,new Point(1,4)));
            Parametrage p =new Parametrage(100,120,200,obs);
            p.notifyAllFigure();

        };
    }

}

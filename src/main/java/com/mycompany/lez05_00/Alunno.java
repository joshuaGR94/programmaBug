/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez05_00;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */
public class Alunno {

   

  private String nome;
    private String cognome;
    private int voto;
    private LocalDateTime datanascita = LocalDateTime.now();
    private String segnoZodiacale;

    public Alunno(String cognome) {
        String okCognome = "";
        if (cognome.length() > 50)// taglialo
        {
            okCognome = cognome.substring(0, 50);
            
        } else {
            okCognome = cognome;
        }
            okCognome = okCognome.toUpperCase();
            //cognome apposto
        
        cognome = okCognome;
        nome = "";
        datanascita = LocalDateTime.now();
        int anno = datanascita.getYear();
        if (anno == 2019) {
            segnoZodiacale = "drago";
        }
        if (anno == 2018) {
            segnoZodiacale = "serpente";
        }
        if (anno == 2017) {
            segnoZodiacale = "topo";
        }

    }

    public LocalDateTime getDatanascita() {
        return datanascita;
    }

    public String getPresentazione() {
        String pres = " ";
        pres += " salve mi chiamo " + cognome + " " + nome;
        DateTimeFormatter myFormatIt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dataOkIt = datanascita.format(myFormatIt);

        pres += " e sono nato il " + datanascita.toString();
        return pres;

    }

    // costruttore con nome stesso della classe        
    public Alunno() {
        cognome = "";
        nome = "";
        datanascita = LocalDateTime.now();
        int anno = datanascita.getYear();
        if (anno == 2019) {
            segnoZodiacale = "drago";
        }
        if (anno == 2018) {
            segnoZodiacale = "serpente";
        }
        if (anno == 2017) {
            segnoZodiacale = "topo";
        }

    }

    public Alunno(String nome, String cognome, int voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
    }
     public String getNome()  {
        return nome;
        
    }

    public String getCognome() {
        return cognome;
    }

    public int getVoto() {
        return voto;
    }

    public String getSegnoZodiacale() {
        return segnoZodiacale;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

}

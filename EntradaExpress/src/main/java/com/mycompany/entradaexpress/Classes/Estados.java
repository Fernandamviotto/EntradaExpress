/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entradaexpress.Classes;

public class Estados {

    public int id;
    public String sigla;
    public String nome;

    public static Estados criar(int pid, String psigla, String pnome) {
        Estados objeto = new Estados();
        objeto.id = pid;
        objeto.sigla = psigla;
        objeto.nome = pnome;

        return objeto;

    }
}

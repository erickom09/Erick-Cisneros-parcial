/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.erickcisnerosparcial;
import java.util.ArrayList;
/**
 *
 * @author T-107
 */
public class GeneradorCalificaciones {
    public static void generarCalificaciones() {
     ArrayList<Evaluacion> eval = new ArrayList<evaluacion>();
        Evaluacion a = new Evaluacion("Petra", (float) 5.8);
        Evaluacion b = new Evaluacion("Jos�", (float) 7.4);
        Evaluacion c = new Evaluacion("Roberta", (float) 8.6);
        eval.add(a);
        eval.add(b);
        eval.add(c);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol11_1;

/**
 *
 * @author Josemolamazo
 */
    public class Clase {

        private int valorPrimari;
        private int valorSecundari;

        public Clase() {
            valorPrimari = 5;
            valorSecundari = 10;
        }

        public Clase(int vp) {
            valorPrimari = vp;
            valorSecundari = 10;
        }

        public Clase(int vp, int vs) {
            valorPrimari = vp;
            valorSecundari = vs;
        }

        public int getPrimari() {
            return valorPrimari;
        }

        public int getSecundari() {
            return valorSecundari;
        }

    

}

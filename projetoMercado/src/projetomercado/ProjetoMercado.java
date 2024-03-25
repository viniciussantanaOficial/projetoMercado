package projetomercado;

import telas.Login;

public class ProjetoMercado {

    
    public static void main(String[] args) {
      telaLogin();       
    }
    
    public static void telaLogin () {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
}

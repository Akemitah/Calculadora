package calculadora;

import com.mycompany.calculadora.visao.FrTela;

public class principal {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrTela().setVisible(true);
            }
        });
    }
}
    
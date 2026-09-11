package com.inf514.sistemacooperativa;
import com.inf514.sistemacooperativa.vista.*;

public class SistemaCooperativa {

    public static void main(String[] args) {
        // Hace visible la pantalla de login al arrancar el programa
        java.awt.EventQueue.invokeLater(() -> new MainLogin().setVisible(true));
        java.awt.EventQueue.invokeLater(()-> new MiembroScreen().setVisible(true));
    }
}

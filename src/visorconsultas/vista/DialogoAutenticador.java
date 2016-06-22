package visorconsultas.vista;

import javax.swing.JDialog;

public class DialogoAutenticador extends JDialog { // Observese que hereda de JDialog
    public PanelAutenticador panel;
    /* Este programa sólo sirve para
     * mostras el panel autenticador
     * en un cuadro de dialogo */
    
    public DialogoAutenticador(){
        panel = new PanelAutenticador(); // Una instancia de nuestro panel autenticador
        add(panel); // Agrega el panel autenticador
        setSize(300,150); // Dimensiona el dialog
    }
    
}
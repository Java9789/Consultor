package visorconsultas.vista;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelAutenticador extends JPanel {
    // Crea los componentes necesarios:
    public JTextField servidor, usuario, base;
    // Un cuadro de texto para contraseñas
    public JPasswordField password;
    // Dos botones
    public JButton aceptar, cancelar;
    
    public PanelAutenticador(){
        iniciaComponentes();
        agregaComponentes();
    }
    
    private void iniciaComponentes(){
        servidor = new JTextField();
        usuario = new JTextField();
        password = new JPasswordField();
        base = new JTextField();        
        aceptar = new JButton("Aceptar");
        aceptar.setMnemonic('a'); // Subraya la A para activar el atajo de tecla <ALT-a>
        cancelar = new JButton("Cancelar");
        cancelar.setMnemonic('c'); // Subraya la C para activar el atajo de tecla <ALT-c>
    }
    
    private void agregaComponentes(){
        /* Esta línea convierte al panel en una rejilla de cinco filas y dos columnas.
         * que acomoda los componentes, conforme son agregados, de izquierda a
         * derecha y de arriba a abajo. */
        setLayout(new GridLayout(5, 2)); // La manera de acomodar los componentes es una rejilla de 5x2
        // Agrega los componentes al panel según la rejilla de izquierda a derecha y de arriba a abajo
        add(new JLabel("Servidor:", JLabel.LEFT));
        add(servidor);        
        add(new JLabel("Usuario:", JLabel.LEFT));
        add(usuario);
        add(new JLabel("Contraseña:", JLabel.LEFT));
        add(password);
        add(new JLabel("Base de datos:", JLabel.LEFT));
        add(base);
        add(aceptar);
        add(cancelar);
    }    
    
}
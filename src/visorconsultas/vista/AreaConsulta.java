package visorconsultas.vista;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaConsulta extends JScrollPane { // Esta clase es un panel desplazable
    public JTextArea texto;
    
    public AreaConsulta(){
        texto = new JTextArea(4,30);
        texto.setLineWrap(true); // Hace que las líneas corten en el límite del área
        texto.setWrapStyleWord(true); // Hace que corten sólo en palabras completas
        setViewportView(texto); // Dentro de las barras se verá el área de texto
    }
    
}
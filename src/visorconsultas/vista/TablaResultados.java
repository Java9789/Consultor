package visorconsultas.vista;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import visorconsultas.modelo.ModeloTabla;

public class TablaResultados extends JScrollPane {
    public ModeloTabla modelo; // crea una instancia del modelo
    public JTable tabla;
    
    public TablaResultados(){
        modelo = new ModeloTabla();
        tabla = new JTable(modelo); // Se le asigna el modelo a la tabla al momento de construirla
        // las columnas se autoajustan
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        setViewportView(tabla); // La tabla se verá dentro del panel a barras de desplazamiento
    }
}
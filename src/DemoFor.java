
import javax.swing.JOptionPane;

public class DemoFor {
    private String mensaje;
    
    public DemoFor(){
        String valorCadena = JOptionPane.showInputDialog(null, "¿Qué tabla de multiplicar desea?");
        try {
            int valorEntero = Integer.parseInt(valorCadena);
            mensaje = "Tabla del "+valorCadena+"\n";
            for(int i=1;i<13;i++){
                mensaje = mensaje+i+"x"+valorCadena+"="+(i*valorEntero)+"\n";
            }
        } catch(NumberFormatException ex){
            mensaje = "No es un entero";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static void main(String[] args){
        new DemoFor();
    }
    
}
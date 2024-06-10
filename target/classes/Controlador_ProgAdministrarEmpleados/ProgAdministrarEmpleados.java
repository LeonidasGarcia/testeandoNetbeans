package Controlador_ProgAdministrarEmpleados;

import Vista_VentanaAdministrarEmpleados.VentanaAdministrarEmpleados;

public class ProgAdministrarEmpleados {

    private static VentanaAdministrarEmpleados ventana;
    
    public static void main(String[] args) {
        ventana = new VentanaAdministrarEmpleados();
        ventana.setVisible(true);
    }
    
    public ProgAdministrarEmpleados() {
    }
    
    
    
}

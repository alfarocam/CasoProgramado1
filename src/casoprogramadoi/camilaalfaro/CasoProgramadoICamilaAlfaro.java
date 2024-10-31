/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoprogramadoi.camilaalfaro;

import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */
public class CasoProgramadoICamilaAlfaro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJETOS AGENTE
        //AGENTE 1
        //con parametros
        Agente agente1 = new Agente("Camila", 208680839, Agente.SUCURSAL.Heredia, "C4M1L4", "SI");

        //Pregunta cant de facturas
        String CantFactS = JOptionPane.showInputDialog("Ingrese el numero de facturas que quiere ingresar al sistema:");
        int CantFact = Integer.parseInt(CantFactS);

        //Variables de cantidad de productos segun su categoria
        int ELECT = 0;
        int CONTR = 0;
        int AUTO = 0;
        int PTS = 0;

        //Variables de factura
        for (int i = 1; i <= CantFact; i++) {
            String cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String clientID = JOptionPane.showInputDialog("Ingrese el ID del cliente:");
            String codeFact = JOptionPane.showInputDialog("Ingrese el codigo de la factura:");
            String MontoFact = JOptionPane.showInputDialog("Ingrese el monto de la factura:");
            int MontoFACT = Integer.parseInt(MontoFact);

            //PRODU ELECTRONICO
            String respuestaE = JOptionPane.showInputDialog("Cuantos productos electricos tiene la factura?");
            int RespuestaE = Integer.parseInt(respuestaE);
            ELECT = ELECT + RespuestaE;
            //PRODU DE CONSTRUCCION
            String respuestaC = JOptionPane.showInputDialog("Cuantos productos de construccion tiene la factura?");
            int RespuestaC = Integer.parseInt(respuestaC);
            CONTR = CONTR + RespuestaC;
            //PRODU AUTOMOTRIZ
            String respuestaA = JOptionPane.showInputDialog("Cuantos productos de automotriz tiene la factura?");
            int RespuestaA = Integer.parseInt(respuestaA);
            AUTO = AUTO + RespuestaA;

            //PORCENTAJE ASIGNADO ELECTRONICO
            if (ELECT >= 3) {
                PTS = PTS + 1;
                MontoFACT = MontoFACT + (4 * MontoFACT / 100);
            } else {
                MontoFACT = MontoFACT + (2 * MontoFACT / 100);
                PTS = PTS + 1;
            }
            //PORCENTAJE ASIGNADO CONSTRU
            if (CONTR >= 1) {
                PTS = PTS + 2;
                MontoFACT = MontoFACT + (8 * MontoFACT / 100);
            } else {
                MontoFACT = MontoFACT + 0;
                PTS = PTS + 0;
            }

        }

        //PRINT DE RESULTADOS
        System.out.println("El agente vendedor: " + agente1.name + " Codigo:" + agente1.code);
        System.out.println("El agente vendedor" + agente1.vehicule + " cuenta con vehiculo propio");
        System.out.println("El agente vendedor" + agente1.vehicule + " cuenta con vehiculo propio");
        System.out.println("Sucursal: " + agente1.getSucu());

    }
}
//no me dio tiempo:(
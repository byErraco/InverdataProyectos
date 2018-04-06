/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesExtendidas.Tablas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author inverdata
 */
public class ListaProductosCajeroTableModel extends ArrayListTableModel {

    enum Columnas {

        Codigo("Código", "codigo_venta_producto"),
        Descripcion("Descripción", "descripcion_producto"),
        Precio("Precio", "precio_venta_publico");

        String header;
        String columna;

        Columnas(String header, String columna) {
            this.header = header;
            this.columna = columna;

        }

        /**
         * Obtiene el nombre de la columna dentro del resultset para obtener su
         * valor.
         *
         * @return
         */
        private String getColumna() {
            return this.columna;
        }

        /**
         * Obtiene el nombre de la columna para asignar en el header de la
         * tabla.
         *
         * @return
         */
        private String getHeader() {
            return this.header;
        }
    }

    public ListaProductosCajeroTableModel(ArrayList<HashMap<String, String>> contenido) {
        super(contenido,
                new String[]{Columnas.Codigo.getHeader(), Columnas.Descripcion.getHeader(), Columnas.Precio.getHeader()},
                new String[]{Columnas.Codigo.getColumna(), Columnas.Descripcion.getColumna(), Columnas.Precio.getColumna()});
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

}
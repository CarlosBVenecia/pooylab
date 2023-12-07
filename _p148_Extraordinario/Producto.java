package _p148_Extraordinario;
import java.io.Serializable;
public class Producto implements Serializable {
    int clave;
    String Descripcion;
    String UnidadMedida;
    Float Cantidad;
    Float Precio;
    Float Total;
    String TipoPago;
    public Producto() {
    }
    public Producto(int clave, String descripcion, String unidadMedida, Float cantidad, Float precio, 
            String tipoPago) {
        this.clave = clave;
        Descripcion = descripcion;
        UnidadMedida = unidadMedida;
        Cantidad = cantidad;
        Precio = precio;
        calcularTotal();
        TipoPago = tipoPago;
    }

    private void calcularTotal() {
        Total = Cantidad * Precio;
    }

    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getUnidadMedida() {
        return UnidadMedida;
    }
    public void setUnidadMedida(String unidadMedida) {
        UnidadMedida = unidadMedida;
    }
    public Float getCantidad() {
        return Cantidad;
    }
    public void setCantidad(Float cantidad) {
        Cantidad = cantidad;
    }
    public Float getPrecio() {
        return Precio;
    }
    public void setPrecio(Float precio) {
        Precio = precio;
    }
    public Float getTotal() {
        return Total;
    }
    public void setTotal(Float total) {
        Total = total;
    }
    public String getTipoPago() {
        return TipoPago;
    }
    public void setTipoPago(String tipoPago) {
        TipoPago = tipoPago;
    }

    

}

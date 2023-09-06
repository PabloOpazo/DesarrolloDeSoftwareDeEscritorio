package fruteria;

public class Producto {
    private int codigo;
    private String subcategoria, descripcion;
    private int precio;
    private String medida;

    public Producto() {
    }

    public Producto(int codigo, String subcategoria, String descripcion, int precio, String medida) {
        this.codigo = codigo;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.medida = medida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", subcategoria=" + subcategoria + ", descripcion=" + descripcion + ", precio=" + precio + ", medida=" + medida + '}';
    }
    
    
}

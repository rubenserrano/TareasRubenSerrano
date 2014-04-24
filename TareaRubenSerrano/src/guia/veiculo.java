/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia;

/**
 *
 * @author Rubén
 */
import java.io.*;
public class veiculo implements Serializable{
    private String marca;
    private String color;
    private String precio;

    

    public String getMarca() {
        return marca;
    }

    public veiculo(String marca, String color, String precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
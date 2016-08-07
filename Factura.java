 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rapidconta;

import java.io.IOException;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import java.math.MathContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.faces.event.ValueChangeEvent;
/**
 *
 * @author Personal
 */

@Named
@RequestScoped
public class Factura {
    
    private String consecutivo;
    private String fecha;
    private String nombre;
    private String nit;
    private String direccion;
    private String mediodepago;
    private String telefono;
    private String ciudad;
    private String contacto;
    private String condicionesdepago;
    private String codigo;
    private String servicio;
    BigDecimal valorunitario;
    private Integer cantidad;
    private String medida;
    private String bodega;
    BigDecimal iva;
    BigDecimal rtefuente;
   BigDecimal parcial;
   BigDecimal total; 
    
    
    BigDecimal calculoparcial;
    BigDecimal calculoparcial1;
    String valorunitarioStr;
    String valorunitarioStr1;
    BigDecimal valorunitarioDoub1;
    BigDecimal valorunitarioDoub;
    
    public Factura (){
    }

    public BigDecimal getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(BigDecimal valorunitario) {
        this.valorunitario = valorunitario;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getRtefuente() {
        return rtefuente;
    }

    public void setRtefuente(BigDecimal rtefuente) {
        this.rtefuente = rtefuente;
    }

    public BigDecimal getParcial() {
        return parcial;
    }

    public void setParcial(BigDecimal parcial) {
        this.parcial = parcial;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCalculoparcial() {
        return calculoparcial;
    }

    public void setCalculoparcial(BigDecimal calculoparcial) {
        this.calculoparcial = calculoparcial;
    }

    public BigDecimal getCalculoparcial1() {
        return calculoparcial1;
    }

    public void setCalculoparcial1(BigDecimal calculoparcial1) {
        this.calculoparcial1 = calculoparcial1;
    }

    public BigDecimal getValorunitarioDoub1() {
        return valorunitarioDoub1;
    }

    public void setValorunitarioDoub1(BigDecimal valorunitarioDoub1) {
        this.valorunitarioDoub1 = valorunitarioDoub1;
    }

    public BigDecimal getValorunitarioDoub() {
        return valorunitarioDoub;
    }

    public void setValorunitarioDoub(BigDecimal valorunitarioDoub) {
        this.valorunitarioDoub = valorunitarioDoub;
    }

    
    
    public String getValorunitarioStr() {
        return valorunitarioStr;
    }

    public void setValorunitarioStr(String valorunitarioStr) {
        this.valorunitarioStr = valorunitarioStr;
    }

    public String getValorunitarioStr1() {
        return valorunitarioStr1;
    }

    public void setValorunitarioStr1(String valorunitarioStr1) {
        this.valorunitarioStr1 = valorunitarioStr1;
    }

    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

   

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

 
    
    
    

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMediodepago() {
        return mediodepago;
    }

    public void setMediodepago(String mediodepago) {
        this.mediodepago = mediodepago;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCondicionesdepago() {
        return condicionesdepago;
    }

    public void setCondicionesdepago(String condicionesdepago) {
        this.condicionesdepago = condicionesdepago;
    }
    
    
   
    
   // public BigDecimal CalculoIva(BigDecimal dollars) {
     //   BigDecimal result = dollars.multiply(yenRate);
       // return result.setScale(2, BigDecimal.ROUND_UP);
   // }
    
    //public BigDecimal yenToEuro(BigDecimal yen) {
      //  BigDecimal result = yen.multiply(euroRate);
        //return result.setScale(2, BigDecimal.ROUND_UP);
   // }

    
    //public void chageListernMethod(ValueChangeEvent e1){
        
        // calculoparcial = iva .multiply(valorunitario);
       
      // calculoparcial1 = calculoparcial.add(calculoparcial);
       
       
       
       
       //valorunitarioStr = String.valueOf(calculoparcial);
       
       //valorunitarioStr1 = String.valueOf(calculoparcial1);
       
       // setValorunitarioStr(e1.getNewValue().toString());
        
         //setValorunitarioStr1(e1.getNewValue().toString());
        
    //setUpdatedcapassuelo2(e2.getNewValue().toString());
//}
    
   public void actionPerformed(ActionEvent e) throws IOException {
        
       calculoparcial = iva .multiply(valorunitario);
       
       calculoparcial1 = calculoparcial.add(valorunitario);
       
       
       
       
       valorunitarioStr = String.valueOf(calculoparcial);
       
       valorunitarioStr1 = String.valueOf(calculoparcial1);
       
        
        
        
       
       setValorunitarioStr(e.toString());
        
       setValorunitarioStr1(e.toString());
        
       
       
        
       // valorunitarioStr = Double.toString(valorunitario);
        
        
        System.out.println(calculoparcial1);
 }
    
    
}

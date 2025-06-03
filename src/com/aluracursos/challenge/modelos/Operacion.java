package com.aluracursos.challenge.modelos;

public class Operacion {
    private String base;
    private String convertir;
    private double tasa;
    private double valor;
    private double resultado;

    public Operacion(String base, String convertir, double valor, OperacionOmdb op){
        this.base = base;
        this.convertir = convertir;
        this.valor = valor;
        this.tasa = Double.valueOf(op.conversion_rate());
    }

    public void calcular(){
        resultado = valor * tasa;
    }

    public String toString(){
        return "\nEl valor " + this.valor +
                " ["+ this.base + "] " +
                "corresponde al valor final de ----> " +
                this.resultado + " [" + this.convertir+ "]\n";
    }
}

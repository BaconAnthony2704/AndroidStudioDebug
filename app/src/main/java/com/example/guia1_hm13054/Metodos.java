package com.example.guia1_hm13054;

public class Metodos {
    public String resultadoSuma(String n1,String n2,String n3){
        String resultado="";
        resultado= String.valueOf(Double.parseDouble(n1)
                        +Double.parseDouble(n2)
                        +Double.parseDouble(n3));
        return resultado;
    }
    public String resultadoResta(String n1,String n2,String n3){
        String resultado="";
        resultado= String.valueOf(Double.parseDouble(n1)
                -Double.parseDouble(n2)
                -Double.parseDouble(n3));
        return resultado;
    }
    public String resultadoMultiplicacion(String n1,String n2,String n3){
        String resultado="";
        resultado= String.valueOf(Double.parseDouble(n1)
                *Double.parseDouble(n2)
                *Double.parseDouble(n3));
        return resultado;
    }
}

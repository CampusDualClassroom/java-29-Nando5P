package com.campusdual.classroom;


import com.campusdual.util.Utils;

public class Exercise29 {
    public static void main(String[] args) {
       try {
           throw new Exception("Excepción lanzada intencionadamente");
       } catch (Exception e) {
           System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
       }
    }
}

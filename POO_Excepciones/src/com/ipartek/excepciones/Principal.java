package com.ipartek.excepciones;

public class Principal {

    public static void main(String[] args) {

        String[] nombres = {"Juanito", "Pepito", "Jaimito"};
        Integer[] numeros = {4, 8, 0};
        Integer resultado = 0;
        String nombre = "";

        try{
            elMetodo(numeros);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println(aiobe.getMessage());
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }catch(DivideEntreCeroException dece){
            System.out.println(dece.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se ejecuta haya o no errores");
        }



    }

    public static void elMetodo(Integer[] elArray){
        elMetodo2(elArray);
    }

    public static void elMetodo2(Integer[] elArray){
        elMetodo3(elArray);
    }

    public static void elMetodo3(Integer[] elArray){
        elMetodo4(elArray);
    }

    public static void elMetodo4(Integer[] elArray){
        elMetodo5(elArray);
    }

    public static void elMetodo5(Integer[] elArray){

        if (elArray[2] == 0){
            throw new DivideEntreCeroException("Se está tratando de dividir entre cero");
        }else {
            Integer resultado = elArray[1] / elArray[2];
        }

    }
}

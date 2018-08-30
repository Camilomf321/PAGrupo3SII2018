package principal;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        //item1();
        //item2();
        //item3(); //sergio medina-27agosto2018
        item5();        
    }
    
    public static void item1() {
        int numero = 8;
        int cantcifras = 1;
        int extractor = 10;
        int separador = 1;        
        int cifra = 0;
        int i = 0;

        while(i < cantcifras) {
            cifra = (numero % extractor) / separador;
            
            System.out.println(cifra);
            
            extractor *= 10; //extractor = extractor * 10;
            separador *= 10; //separador = separador * 10;
            i++;
        }
    }

    public static void item2() {
        String vocal = "Á"; //T/F
        
        boolean[] resultado = validaVocal(vocal);
        
        System.out.println(Arrays.toString(resultado));
    }
    
    private static boolean[] validaVocal(String vocal) {
        boolean[] resultado = {false,false}; //[0]-true-esta tildada; [1]-true-minuscula
        String[] vocalesTildadas = {"á","é","í","ó","ú"};                
        
        for (int i = 0; i < vocalesTildadas.length; i++) {
            if(vocal.toLowerCase().equals(vocalesTildadas[i])) {
                resultado[0] = true;
            }
        }
        if(vocal.toLowerCase().equals(vocal)) {
            resultado[1] = true; //es minuscula            
        }        
        
        return resultado;
    }

    public static void item3() {
        String cadena1 = "holas";
        String cadena2 = "adios";
        
        int contador1 = 0;
        int contador2 = 0;
        
        if(cadena1.length() > cadena2.length()){
            System.out.println("Cadena1");
            muestraCadena(cadena1);
        }else if(cadena2.length() > cadena1.length()){
            System.out.println("Cadena2");
            muestraCadena(cadena2);
        }else{
            System.out.println("Las cadenas son iguales");
        }     
    }
    
    private static void muestraCadena(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i)); // Mostrar caracter a caracter
        }
    }
    
    public static void item4() {
        String cadena1 = "";
        String cadena2 = "";
        
                
    }

    public static void item5() {
        int[] nums = {6,5,6,5,3};
        
        /*
        ordenaAscendentemente(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("el mayor es: " + nums[nums.length - 1]);        
        System.out.println("el menor es: " + nums[0]);
        */
        int numMasRepetido = getNumeroMasRepetido(nums);
        
        if(numMasRepetido != -1)
            System.out.println("El numero mas repetido es: " + numMasRepetido);
        else
            System.out.println("no hay repetidos o es INDETERMINADO");
    }
    
    private static int getNumeroMasRepetido(int[] arreglo) {
        //1. obtener un arreglo con las repeticiones
            //{2,4,2,1,2,2} - {3,0,2,0,1,0} 
        //2. obtener la posicion de la repeticion mayor en el arreglo de repeticiones,
        // para luego obtener en el arreglo original el valor que mas se repite.
        /*
        {1,0,1,0} -> -1 indeterminado
        {0,0} -> -1 no hay repeticiones
        {0,2,1} -> 1
        {0} -> 0
        {2} -> 0
        */       
        
        int numMasRepetido = 0;
        int[] arregloRepeticiones = getArregloRepeticiones(arreglo);
        int posiMasRepetido = getPosicionRepeticionMayor(arregloRepeticiones);       
        
        if(posiMasRepetido >= 0)
            numMasRepetido = arreglo[posiMasRepetido];
        
        return posiMasRepetido;        
    }
    
    private static int[] getArregloRepeticiones(int[] arreglo) {
        int[] arregloRepeticiones = new int[arreglo.length];
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = (i+1); j < arreglo.length; j++) {
                if(arreglo[i] == arreglo[j]) {
                    arregloRepeticiones[i]++;                    
                }                
            }            
        }

        return arregloRepeticiones;
    }
    
    private static int getPosicionRepeticionMayor(int[] arregloRepeticiones) {
        return 0;        
    }
    
    private static void ordenaAscendentemente(int[] arreglo) {
        boolean huboIntercambio = true;
        int aux = 0;
        
        while(huboIntercambio) {
            huboIntercambio = false;
            for (int i = 0; i < arreglo.length - 1; i++) {
                if(arreglo[i] > arreglo[i+1]) {
                    aux = arreglo[i+1];
                    arreglo[i+1] = arreglo[i];
                    arreglo[i] = aux;
                    huboIntercambio = true;
                }                
            }                        
        }
    }
}

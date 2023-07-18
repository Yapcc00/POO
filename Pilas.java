package com.mycompany.pilas;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Lista vacia: " + pila);
        System.out.println("Lista vacia: " + pila.isEmpty());

        //Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrido
        for(Integer pilita:pila){
            System.out.println(pilita);
        }

        //Mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());



        pila.pop(); //Eliminar el ultimo registro qeu entro osea el (5)
        System.out.println("Este el 3? " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());


    }
}

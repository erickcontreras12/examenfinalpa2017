/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author Erick Contreras
 */
public class Main {
    public static void main(String[] args) {
        Animal bambi = new Animal("salvaje", 10, 100, "cafecito");
        LeakyStack<Animal> historial = new ImplLeakyStack<>(1);
        bambi = historial.saveHistory(bambi);
        System.out.println(bambi.getSkinColor());
    }
}

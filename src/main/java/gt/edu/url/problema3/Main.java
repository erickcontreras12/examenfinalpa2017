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
        LeakyStack<Animal> animalHistory = new ImplLeakyStack<>(2);
		
		Animal bambi = new Animal("salvaje", 10, 100.00, "cafecito");
		bambi = animalHistory.saveHistory(bambi); //Push will be leaked
		bambi.setSkinColor("juan valdez");
		bambi = animalHistory.saveHistory(bambi); //Push
		bambi.setSkinColor("café");
		bambi = animalHistory.saveHistory(bambi); //Push
		bambi.setSkinColor("café salvaje");
		
		bambi = animalHistory.undo(); //Pop	
                System.out.println(bambi.getSkinColor());
		bambi = animalHistory.undo(); //Pop	
    }
}

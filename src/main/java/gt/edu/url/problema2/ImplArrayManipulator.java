/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

/**
 *
 * @author Erick Contreras
 */
public class ImplArrayManipulator<E> implements ArrayManipulator<E>{
    int cont = 0;
    @Override
    public int subsets(List<E> set) {
        return this.hacerHeap(set.size(), set);
    }
 
    public int hacerHeap(int n, List<E> a){
        if (n == 1) {    
            return 1+cont;
        }
        else{
            for (int i = 0; i < n-1; i++) {
                hacerHeap(n-1, a);
                if (n != 0) {
                    E b;
                    b = a.get(i);
                    a.set(i,a.get(n-1));
                    a.set(n-1, b);
                    cont++;
                }
                else{
                    E b = a.get(0);
                    a.set(0,a.get(n-1));
                    a.set(n-1,b);
                    cont++;
                }
            }
            hacerHeap(n-1, a);
            return 1 + cont;
        }
    }
}

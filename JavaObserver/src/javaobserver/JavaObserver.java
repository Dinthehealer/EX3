/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobserver;

import java.util.Observer;

/**
 *
 * @author sarun
 */
public class JavaObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observer obj = new MyConcreteObserver();
        Observer obj1 = new MyConcreteObserver();
        MyObservable observable = new MyObservable();
        observable.addObserver(obj);
        observable.addObserver(obj1);
        observable.setA(8);
	observable.setA(9);
        observable.deleteObserver(obj1);
        observable.setA(10);
    }
}

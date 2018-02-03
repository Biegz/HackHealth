/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepcookieBackend;

/**
 *
 * @author Dan
 */
public interface Steppable {
    public int step();
    /*
        Will return a number between 0-1 for the progress of each item
    */
    public double progress();
}

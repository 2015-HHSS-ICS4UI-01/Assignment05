/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadt;

/**
 *
 * @author Andrew
 */
public class MyStringStack {

    public boolean enterWord(String word) {
        boolean w$w = true;
        for (int i = 0; i < (int) word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        if (!"$".equals(word.substring((int) Math.floor(word.length() / 2), (int) Math.floor(word.length() / 2) + 1))) {
            return false;
        }
        return true;
    }
}

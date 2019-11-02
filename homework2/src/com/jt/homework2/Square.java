/**
 * 
 */
package com.jt.homework2;

/**
 * @author JT
 *
 */
public class Square extends Shape {
	@Override
    void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	void erase() {
		System.out.println("Square.erase()");
	}
}
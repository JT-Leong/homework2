/**
 * 
 */
package com.jt.homework2;

/**
 * @author JT
 *
 */
public class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	void erase() {
		System.out.println("Circle.erase()");
	}
}

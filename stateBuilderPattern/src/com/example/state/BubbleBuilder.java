package com.example.state;

public abstract class BubbleBuilder {

	String shape;

	enum Size {
		SMALL, MEDIUM, BIG
	}

	Size size;

	String color;

	public abstract BubbleBuilder addShape();

	public abstract BubbleBuilder addColor();

	public abstract BubbleBuilder addSize();

	public Bubble build() {
		Bubble bubble = new Bubble();
		bubble.setShape(shape);
		bubble.setSize(size.toString());
		bubble.setColor(color);
		return bubble;
	}

}

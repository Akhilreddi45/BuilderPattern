package com.example.state;

/**
 * 
 * Popping State
 *
 */
public class PoppingState extends BubbleBuilder implements BubbleState {

	private Bubble bubble;

	public PoppingState() {
		
	}
	
	public PoppingState(Bubble bubble) {
		this.bubble = bubble;
	}

	@Override
	public void startBubble() {
		System.out.println("Cannot Start, as bubble is in popping state");

	}

	@Override
	public void pickBubbleStick() {
		System.out.println("Cannot Pick up Stick, as bubble Process is popping state");

	}

	@Override
	public void blowBubble() {
		System.out.println("Cannot Blow, as bubble Process is already in pop state");

	}

	@Override
	public void popBubble() {
		System.out.println("Popping Bubble");
		bubble.setState(bubble.noBubbleState);
	}

	@Override
	public void prepareBubbleSolution() {
		System.out.println("Cannot Prepare, as bubble Process is popping state");
		
	}
	
	@Override
	public BubbleBuilder addShape() {
		this.shape = "Circle";
		return this;
	}
	
	@Override
	public BubbleBuilder addColor() {
		this.color = "red";		
		return this;
	}
	
	@Override
	public BubbleBuilder addSize() {
		this.size = Size.BIG;
		return this;
	}

}

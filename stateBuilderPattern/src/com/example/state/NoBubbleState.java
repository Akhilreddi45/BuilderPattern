package com.example.state;


/**
 * 
 * No Bubble State 
 *
 */
public class NoBubbleState implements BubbleState {

	private Bubble bubble;

	public NoBubbleState(Bubble bubble) {
		this.bubble = bubble;

	}

	@Override
	public void startBubble() {
		System.out.println("Start the Bubble");
		bubble.setState(bubble.pickupState);

	}

	@Override
	public void pickBubbleStick() {
		System.out.println("Bubble Process is not Started");

	}

	@Override
	public void blowBubble() {
		System.out.println("Cannot Blow, as bubble Process is not Started");

	}

	@Override
	public void popBubble() {
		System.out.println("Cannot Pop, as bubble Process is not Started");

	}

	@Override
	public void prepareBubbleSolution() {
		System.out.println("Bubble Process is already Started");
		
	}

}

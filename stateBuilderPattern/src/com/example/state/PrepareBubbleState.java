package com.example.state;


/**
 * 
 * No Bubble State 
 *
 */
public class PrepareBubbleState implements BubbleState {

	private Bubble bubble;

	public PrepareBubbleState(Bubble bubble) {
		this.bubble = bubble;

	}
	
	@Override
	public void prepareBubbleSolution() {
		System.out.println("Preparing Bubble Solution");
		bubble.setState(bubble.noBubbleState);
		
	}

	@Override
	public void startBubble() {
		System.out.println("Bubble Process is not Started");

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

	

}

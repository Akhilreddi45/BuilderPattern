package com.example.state;

/**
 * 
 * Blowing state
 *
 */
public class BlownState implements BubbleState {

	private Bubble bubble;

	public BlownState(Bubble bubble) {
		this.bubble = bubble;
	}

	@Override
	public void startBubble() {
		System.out.println("Cannot Start, as bubble Process is already in blow state");

	}

	@Override
	public void pickBubbleStick() {
		System.out.println("Cannot Pick up, as bubble Process is already in blow state");

	}

	@Override
	public void blowBubble() {
		System.out.println("Blowing Bubble");
		bubble.setState(bubble.poppingState);

	}

	@Override
	public void popBubble() {
		System.out.println("Cannot Pop, as bubble Process is not Started");

	}

	@Override
	public void prepareBubbleSolution() {
		System.out.println("Cannot prepare, as bubble Process is already in blow state");
		
	}

}

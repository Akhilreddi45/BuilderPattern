package com.example.state;


/**
 * 
 * Ready State - pick up stick and start 
 *
 */
public class PickupState implements BubbleState {

	private Bubble bubble;

	public PickupState(Bubble bubble) {
		this.bubble = bubble;
	}

	@Override
	public void startBubble() {
		System.out.println("Cannot Start, as bubble Process is in pickup state");

	}

	@Override
	public void pickBubbleStick() {
		System.out.println("Picking up bubble Stick");
		bubble.setState(bubble.blownState);

	}

	@Override
	public void blowBubble() {
		System.out.println("Cannot Blow, as bubble Process is in pickup state");

	}

	@Override
	public void popBubble() {
		System.out.println("Cannot Pop, as pickup state is just happened");

	}

	@Override
	public void prepareBubbleSolution() {
		System.out.println("Cannot Prepare, as bubble Process is in pickup state");
		
	}

}

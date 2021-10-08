package com.example.state;

/**
 *
 * Bubble
 *
 */
public class Bubble {

	BubbleState prepareState;
	BubbleState noBubbleState;
	BubbleState blownState;
	BubbleState poppingState;
	BubbleState pickupState;

	BubbleState state;

	String shape;

	String color;

	String size;

	public Bubble() {

		prepareState = new PrepareBubbleState(this);
		noBubbleState = new NoBubbleState(this);
		pickupState = new PickupState(this);
		blownState = new BlownState(this);
		poppingState = new PoppingState(this);

		// initial State to noBubbleState
		this.state = prepareState;

	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void prepareBubbling() {
		state.prepareBubbleSolution();
	}

	public void startBubbling() {
		state.startBubble();
	}

	public void pickupStickForBubbling() {
		state.pickBubbleStick();
	}

	public void blowBubble() {
		state.blowBubble();
	}

	public void popBubble() {
		state.popBubble();
	}

	public BubbleState getState() {
		return state;
	}

	public void setState(BubbleState state) {
		this.state = state;
	}

	public BubbleState getNoBubbleState() {
		return noBubbleState;
	}

	public void setNoBubbleState(BubbleState noBubbleState) {
		this.noBubbleState = noBubbleState;
	}

	public BubbleState getBlownState() {
		return blownState;
	}

	public void setBlownState(BubbleState blownState) {
		this.blownState = blownState;
	}

	public BubbleState getPoppingState() {
		return poppingState;
	}

	public void setPoppingState(BubbleState poppingState) {
		this.poppingState = poppingState;
	}

	public BubbleState getPickupState() {
		return pickupState;
	}

	public void setPickupState(BubbleState pickupState) {
		this.pickupState = pickupState;
	}

	public BubbleState getPrepareState() {
		return prepareState;
	}

	public void setPrepareState(BubbleState prepareState) {
		this.prepareState = prepareState;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bubble [shape=");
		builder.append(shape);
		builder.append(", color=");
		builder.append(color);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}

	
}

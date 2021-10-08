package com.example.state;

public class BubbleStatePatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bubble bubble = new Bubble();

		// calling methods sequentially which make the state change automatically
		bubble.prepareBubbling();
		bubble.startBubbling();
		bubble.pickupStickForBubbling();
		bubble.blowBubble();
		bubble.popBubble();

		bubble.prepareBubbling();
		bubble.startBubbling();
		bubble.pickupStickForBubbling();
		bubble.blowBubble();
		bubble.popBubble();

		bubble.prepareBubbling();
		bubble.startBubbling();
		bubble.pickupStickForBubbling();
		bubble.blowBubble();
		bubble.popBubble();

	}

}

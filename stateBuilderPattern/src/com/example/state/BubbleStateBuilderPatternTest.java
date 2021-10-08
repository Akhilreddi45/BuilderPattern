package com.example.state;

public class BubbleStateBuilderPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Builder Pattern Test
		 */

		BubbleBuilder builder = new PoppingState();
		Bubble bubble = builder.addColor().addShape().addSize().build();

		System.out.println(bubble);
		/**
		 * State Pattern test
		 */

		// calling methods sequentially which make the state change automatically
		bubble.prepareBubbling();
		bubble.startBubbling();
		bubble.pickupStickForBubbling();
		bubble.blowBubble();
		bubble.popBubble();

	}

}

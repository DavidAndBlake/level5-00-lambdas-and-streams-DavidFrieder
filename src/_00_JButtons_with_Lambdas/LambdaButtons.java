package _00_JButtons_with_Lambdas;


import java.awt.*;
import java.util.concurrent.atomic.AtomicReference; import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

public class LambdaButtons  {
	private static JFrame window = new JFrame();
	private static JButton addNumbers = new JButton("ADD 2 Numbers");
	private static JButton randNumber = new JButton("RANDOM NUMBER");
	private static JButton tellAJoke = new JButton("TELL A JOKE");


	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		String[] listOfJokes = new String[7];
		listOfJokes[1] = "What do you call an overworked student?";
		listOfJokes[4] = "Diligent";
		listOfJokes[2] = "What's my name?";
		listOfJokes[5] = "I said WHAT'S My NAME!";
		listOfJokes[3] = "What do you call a bad joke?";
		listOfJokes[6] = "All of these.";
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		String[] numbers = new String[2];
		addNumbers.addActionListener(e -> {numbers[0] = (JOptionPane.showInputDialog("enter a number"));
		Object[] buttonMessage = {"What?"};
		numbers[1] = (JOptionPane.showInputDialog("enter another number"));
		JOptionPane.showMessageDialog(null,"The numbers entered were " + numbers[0] + " and " + numbers[1]);
		}
		);
		randNumber.addActionListener(e -> System.out.println(ThreadLocalRandom.current().nextInt(-10,11)));

		tellAJoke.addActionListener(e -> {
			int jokeNumber = ThreadLocalRandom.current().nextInt(1,4);
			String randomJokeGet = listOfJokes[jokeNumber];
			JOptionPane.showOptionDialog(null, randomJokeGet, "Terrible Jokes",
					0, JOptionPane.INFORMATION_MESSAGE,null, new String[]{"What?"},null);
			JOptionPane.showMessageDialog(null, listOfJokes[jokeNumber+3]);
		});//System.out.println());


		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
		window.setVisible(true);
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
	}



}

package Assignment_Interface;

import java.util.Scanner;

public class PlayableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select a Player\n1.MP3 Player\n2.CD Player\n3.StreamingPlayer");
		int id = sc.nextInt();
		Playable player = null;
		player = id == 1 ? new MP3Player() : (id == 2 ? new CDPlayer() : new StreamingPlayer());
		boolean flag = true;
		while (flag) {
			System.out.println("-----------------------------------------------");
			System.out.println("Please select a option\n1.Play\n2.Pause\n3.Stop");
			System.out.println("-----------------------------------------------");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				player.play();
				break;
			case 2:
				player.pause();
				break;
			case 3:
				player.stop();
				flag = false;
			}
		}
	}
}

interface Playable {
	void play();

	void pause();

	void stop();
}

class MP3Player implements Playable {
	public void play() {
		System.out.println("MP3 Player is playing!");
	}

	public void pause() {
		System.out.println("MP3 Player is paused!");
	}

	public void stop() {
		System.out.println("MP3 Player is stoped!");
	}
}

class CDPlayer implements Playable {
	public void play() {
		System.out.println("CD Player is playing!");
	}

	public void pause() {
		System.out.println("CD Player is paused!");
	}

	public void stop() {
		System.out.println("CD Player is stoped!");
	}
}

class StreamingPlayer implements Playable {
	public void play() {
		System.out.println("StreamingPlayer is playing!");
	}

	public void pause() {
		System.out.println("StreamingPlayer paused!");
	}

	public void stop() {
		System.out.println("StreamingPlayer stoped!");
	}
}
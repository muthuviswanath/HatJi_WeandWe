package collectionframework;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<String> playlist = new LinkedList<String>();
		int currentIndex = -1;
		boolean isPlaying = false;
		boolean isPaused = false;
		
		do {
			System.out.println("1. Add Songs to the Player\n"
					+ "2. Start\n"
					+ "3. Pause\n"
					+ "4. Resume\n"
					+ "5. Stop\n"
					+ "6. Prev\n"
					+ "7. Next\n"
					+ "8. Exit");
			System.out.println("Enter your choice: ");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the song name: ");
				String song = scan.nextLine();
				playlist.add(song);
				System.out.println(song + " added Successfully to your playlist");
				break;
			case 2:
				if(playlist.isEmpty()) {
					System.err.println("Playlist is Empty. Add song to the playlist first");
				}
				else {
					currentIndex = 0;
					isPlaying = true;
					isPaused = false;
					System.out.println("\nNow Playing: " + playlist.get(currentIndex));
				}
				break;
			case 3:
				if(isPlaying && !isPaused) {
					isPaused = true;
					System.out.println("\n Paused Playing: " + playlist.get(currentIndex));
				}
				else {
					System.out.println("\n Nothing is playing to pause");
				}
				break;
			case 4:
				if(isPlaying && isPaused) {
					isPaused = false;
					System.out.println("\n Resuming the song: " + playlist.get(currentIndex));
				}
				else {
					System.out.println("\n Nothing is paused to resume");
				}
				break;
			
			case 5:
				if(isPlaying) {
					System.out.println("Stopped Playing: " + playlist.get(currentIndex));
					isPlaying = false;
					isPaused = false;
					currentIndex = -1;
				}
				else {
					System.out.println("\n Nothing is playing to be stopped");
				}
				break;
			case 6:
				if(isPlaying && currentIndex > 0) {
					currentIndex --;
					System.out.println("Now Playing: " + playlist.get(currentIndex));
				}
				else{
					System.out.println("No previous song found.");
				}
				break;
			case 7:
				if(isPlaying && currentIndex < playlist.size() - 1) {
					currentIndex ++;
					System.out.println("Now Playing: " + playlist.get(currentIndex));
				}
				else{
					System.out.println("No Next song found.");
				}
				break;
			case 8:
				System.out.println("Exiting the player...");
				return;
			default:
				System.out.println("Invalid Choice.");
			}
			
		}while(true);
	}
}

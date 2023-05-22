package App;


import Script.SongDownloadScript;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SeleniumScriptApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter song to search: ");
        String songToSearch = scanner.nextLine();
        SongDownloadScript script = new SongDownloadScript();
        script.downloadSong(songToSearch);
        script.tearDown();

    }
}

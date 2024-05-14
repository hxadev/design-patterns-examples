package structural.composite.examples.PlaylistApplication;

import java.util.ArrayList;

public class Playlist implements IComponent{
    public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

    @Override
    public void play() {
        System.out.println("Playing "+playlistName+"...");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        System.out.println("Setting playback speed of "+playlistName+" to "+speed);
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent component){
        this.playlist.add(component);
    }

    public void remove(IComponent component){
        this.playlist.remove(component);
    }

    
}

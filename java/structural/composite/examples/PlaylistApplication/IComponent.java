package structural.composite.examples.PlaylistApplication;

public interface IComponent {
    void play();
    void setPlaybackSpeed(float speed);
    String getName();
}

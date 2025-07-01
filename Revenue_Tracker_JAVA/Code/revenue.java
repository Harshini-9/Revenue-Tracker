import java.util.Scanner;

//interface
interface EarningsCalculable {
  double calculateEarnings();
}

//abstract class implementing interface
abstract class StreamingPlatform implements EarningsCalculable {
  protected String platformName;
  protected String artistName;
  protected double streamingHours;

  public StreamingPlatform(String platformName, String artistName, double streamingHours) {
      this.platformName = platformName;
      this.artistName = artistName;
      this.streamingHours = streamingHours;
  }

  @Override
  public abstract double calculateEarnings();


  @Override
  public String toString() {
      return "Platform: " + platformName + "\nArtist: " + artistName + "\nStreaming Hours: " + streamingHours
              + "\nEarnings: Rs " + calculateEarnings();
  }
}

//Inheriting StreamingPlatform
class Spotify extends StreamingPlatform {
  public Spotify(String artistName, double streamingHours) {
      super("Spotify", artistName, streamingHours);
  }

  @Override
  public double calculateEarnings() {
      double earnings = 0.0;

      if (streamingHours >= 200000) {
          earnings = streamingHours * 0.74 + 50000;
      } else if (streamingHours >= 50000) {
          earnings = streamingHours * 0.54 + 40000;
      } else {
          earnings = streamingHours * 0.41 + 5000;
      }

      return earnings;
  }
}
//Inheriting StreamingPlatform
class AmazonMusic extends StreamingPlatform {
  public AmazonMusic(String artistName, double streamingHours) {
      super("Amazon Music", artistName, streamingHours);
  }

  @Override
  public double calculateEarnings() {
      double earnings = 0.0;

      if (streamingHours >= 200000) {
          earnings = streamingHours * 0.68 + 50000;
      } else if (streamingHours >= 50000) {
          earnings = streamingHours * 0.57 + 40000;
      } else {
          earnings = streamingHours * 0.44 + 5000;
      }

      return earnings;
  }
}
//Inheriting StreamingPlatform
class YouTubeMusic extends StreamingPlatform {
  public YouTubeMusic(String artistName, double streamingHours) {
      super("YouTube Music", artistName, streamingHours);
  }

  @Override
  public double calculateEarnings() {
      double earnings = 0.0;

      if (streamingHours >= 200000) {
          earnings = streamingHours * 0.70 + 50000;
      } else if (streamingHours >= 50000) {
          earnings = streamingHours * 0.64 + 40000;
      } else {
          earnings = streamingHours * 0.60 + 5000;
      }

      return earnings;
  }
}

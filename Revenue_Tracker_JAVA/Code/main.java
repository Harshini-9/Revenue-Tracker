public class RevenueTrackerClass {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Input Artist Information");
      System.out.print("Enter Artist Name: ");
      String artistName = sc.next();
      System.out.print("Enter Streaming Hours for Spotify: ");
      double spotifyHours = sc.nextDouble();
      System.out.print("Enter Streaming Hours for Amazon Music: ");
      double amazonMusicHours = sc.nextDouble();
      System.out.print("Enter Streaming Hours for YouTube Music: ");
      double youtubeMusicHours = sc.nextDouble();

      Spotify spotify = new Spotify(artistName, spotifyHours);
      AmazonMusic amazonMusic = new AmazonMusic(artistName, amazonMusicHours);
      YouTubeMusic youtubeMusic = new YouTubeMusic(artistName, youtubeMusicHours);

      System.out.println("\nCalculating and displaying earnings for each platform:");
      System.out.println(spotify);
      System.out.println(amazonMusic);
      System.out.println(youtubeMusic);

      // Calculate the total earnings
      double totalEarnings = spotify.calculateEarnings() + amazonMusic.calculateEarnings() + youtubeMusic.calculateEarnings();

      System.out.println("\nTotal Earnings: Rs" + totalEarnings);

      
  }
}


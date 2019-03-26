import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class TweetParser {
  public static int numTweets=0;
  /**
   * Take the name of a comma-separated value (.csv) file in the local directory and parse the contents for tweets. The tweets have an expected structure of "Topic", "Sentiment", "TweetId", "TweetDate", "TweetText"
   * @param  filename the name of a comma-separated value (.csv) file in the local directory
   * @return          An array of parsed Message objects
   */
  public static ArrayList<Tweet> parseTweets(String filename) throws Exception {

    ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    Slider tweetSlider = new Slider();
    tweetSlider.setShowTickLabels(true);
    tweetSlider.setMajorTickSpacing(true);
    tweetSlider.setMax(tweets.size(5));
    tweetSlider.setMin(1);
// get the values of the sliders.
    //moddify the user parser
    //static int thatahas vlaues 

    Scanner scanner = new Scanner(new File(filename), "UTF-8");
    String line = scanner.nextLine();//the first line is field headers, we do not want that.
    System.out.println(line);
    int i = 0;
    while(scanner.hasNextLine() && i < 10000){ //this i < 10000 is just to help you test, so that it doesn't take too long to run each time. you should eventually move towards reading in the entire file.
      line = scanner.nextLine();
      String[] fields = line.split("\",\"");
      fields[0] = fields[0].substring(1);

      try{

        long l = Long.parseLong(fields[0]);
        Tweet t = new Tweet(l, fields[1]);
        t.setRetweets(fields[26]);
        t.setTweets(12);
        t.setDates(8);
        t.setlikes(25);
        t.setQoutes(23);

      
        
        
        // this.likes=fields[25];
        // this.quotes=fields[23];
        tweets.add(t);
        i++;
      }
      catch(Exception e){
        System.out.println("file error: "+ e.getClass().getCanonicalName());
            System.out.println(e.getMessage());
      }
    }

    return tweets;

  }

    
    }
















  





}
import java.util.ArrayList;

public class User extends UserParser {
  private String userid;
  private ArrayList<Tweet> tweets;
  private int followers;
  private String profile;
  private String location;
  private int following;
  private String url;
//Sets Uset ID
  public User (String userid){
    this.userid = userid;
    tweets = new ArrayList<Tweet>();
  }
//Adds tweets
  public void addTweet(Tweet tweet){
    tweets.add(tweet);
  }

//Sets Followers
  public void setFollowers( int followers) {
     this.followers=followers;
}
// Gets Followers
  public int getFollowers () {
       return followers;

  }
//Sets UserProfile
  public void setUserProfileDescription( String profile) {
     this.profile=profile;
}
//Gets UserProfile
  public String getProfileDescription () {
       return profile;

  }
//Gets Tweets
  public ArrayList<Tweet> getTweets(){
    return tweets;
  }


  //Sets UserLocation
 public void setUserLocation( String location) {
     this.location=location;
}
//Gets UserLocation
  public String getUserLocation() {
       return location;

  }


  //Sets Followings
  public void setFollowing( int following) {
     this.following=following;
}
// Gets Following
  public int getFollowing () {
       return following; 

  }

   public void setUrl( String url) {
     this.url=url;
  }
//Gets UserLocation
  public String getUrl() {
       return url;

  }







}




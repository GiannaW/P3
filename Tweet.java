public class Tweet {
    private long tweetid;
    private String userid;
    private int retweets;
    private int tweets;
    private int qoutes;
    private int replies;
    private int likes;
    // private retweets;
    private String date;
 
    public Tweet(long tweetid, String userid){
      this.tweetid = tweetid;
      this.userid = userid;
    }

    /**
     * Get the content of this message as a String
     * @return The content of this message as a String
     */
    

    public String getuserid(){
      return userid;
    }

    public void setRetweets( int retweets) {
     this.retweets=retweets;
  }
 

  public int getRetweets () {
       return retweets;

  }

  //Sets Tweets
  public void setTweets( int tweets) {
     this.tweets=tweets;
}
// Gets Tweets
  public int getTweets () {
       return tweets;
  }


  //Sets Qoutes
  public void setQoutes( int qoutes) {
     this.qoutes=qoutes;
}
// Gets Qoutes
  public int getQoutes () {
       return qoutes;

  }
  //Sets Replies
  public void setReplies( int replies) {
     this.replies=replies;
}
// Gets Qoutes
  public int getReplies () {
       return replies;

  }


  //Sets likes
  public void setlikes( int likes) {
     this.likes=likes;
}
// Gets likes
  public int getlikes () {
       return likes;

  }



  //Sets Date
  public void setDates( String date) {
     this.date=date;
}
// Gets Tweets
  public String getdates () {
       return date;

  }
















  }
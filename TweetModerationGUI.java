// public class Tweet{
//     private long tweetid;
//     private String userid;

//     public Tweet(long tweetid, String userid){
//       this.tweetid = tweetid;
//       this.userid = userid;
//     }

//     /**
//      * Get the content of this message as a String
//      * @return The content of this message as a String
//      */
//     public String toString(){
//       return null;
//     }

//     public String getuserid(){
//       return userid;
//     }
//   } 
 
// 57  TweetModerationGUI.java
// @@ -0,0 +1,57 @@
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import java.util.ArrayList;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.collections.FXCollections;
import javafx.scene.layout.Pane;

public class TweetModerationGUI extends Application {
    ArrayList<Tweet> tweets;
    ArrayList<User> users;

    protected BorderPane getBorderPane(ArrayList<User> users) {
        BorderPane pane = new BorderPane();
        Text text = new Text("Loaded " + users.size() + " users; 12 tweets");
        ArrayList<Pane> content = new ArrayList<Pane>();
        content.add(new Pane());
        content.add(new Pane());
        content.add(new Pane());
        ListView<Pane> lv = new ListView<>(
            FXCollections.observableArrayList(content));
        pane.setBottom(text);
        pane.setCenter(new ScrollPane(lv));
        return pane;
    }

    public void parseUsersAndTweets(){
        try{
            tweets = TweetParser.parseTweets("iranian_tweets_csv_hashed.csv");
            users = UserParser.parseUsers("iranian_users_csv_hashed.csv");
            System.out.println(tweets.size() + " tweets parsed");
            System.out.println(users.size() + " users parsed");
            for(Tweet tweet: tweets){
                for(User user: users)
                    if(tweet.getuserid().equals(user.getuserid())){
                        user.addTweet(tweet);
                        break;
                    }
            }
        }catch(Exception e){
            System.out.println("file error: "+ e.getClass().getCanonicalName());
            System.out.println(e.getMessage());
        }



    

// set on action for parser just do it for that button



    }

    public void start(Stage primaryStage) {
        
        // Creates the Scene of the pane for Qoutes, Retweets, Likes, Replies 
    
        
        avatar.setAlignment(Pos.Top_Right);
        Label qoutes=new Label ("Qoutes", tweet.getQoutes() );
        Label retweets=new Label ("Retweets", tweet.getRetweets());
        Label likes=new Label ("Likes",tweet.getlikes());
        Label replies=new Label ("Replies", tweet.getReplies());

        // Sets Scene to the pane  
        Pane bottomofPane= new Pane();
        bottomofPane.getChildren().addAll(qoutes,retweets,likes,replies);

        // Creates the Scene of the pane for Username , User ID
        
        Label userId=new Label ("User ID",tweet.getuserid());
     
       
        // Sets Scene to the pane 
        Pane upperPane = new Pane();
        upperPane.getChildren().addAll(username,userId,location,url);
        // Sets to center of the Pane
        pane.setCenter(upperPane);
        Scene scene = new Scene(pane,400,200);
        primaryStage.setTitle("Tweet Pane");
        primaryStage.setScene(scene);
        //Shows Pane
        primaryStage.show();

        // User pane


        Stage secondaryStage = new Stage();
        ImageView avatar=new ImageView (new Image ("Twitter_Logo_Blue.png"));
        avatar.setAlignment(Pos.Top_Right);
        Label followers=new Label ("Followers",u.getFollowing());
        Label following=new Label ("Following",u.getFollowers());

        // Adds to the Pane 
        Pane userNums= new Pane();
        userNums.getChildren().addAll(followers,following);

        // Creates the Label for Username, User ID, Location, and URL. 
        // Label username=new Label ("Username",u;
        // Label userId=new Label ("User ID", userId);
        Label location  =new Label ("location",u.getUserLocation());
        Label url = new Label ("Url",u.getUrl());

        // Adds Pane to the scene and centers it
        Pane userInfo = new Pane();
        userInfo.getChildren().addAll(username,userId,location,url);
        pane.setCenter(userInfo);
        Scene scene = new Scene(pane,400,200);
        secondaryStage.setTitle("User Pane");
        secondaryStage.setScene(scene);
        // Shows the Scene 
        secondaryStage.show();



        Stage loadingScreen = new Stage();
        Slider slHorizontal = new Slider();
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks(true);








    // @Override

} 










 














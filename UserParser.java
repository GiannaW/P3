import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class UserParser extends Application{
  public static ArrayList<User> parseUsers (String filename) throws Exception {
    ArrayList<User> users = new ArrayList<User>();
    //  Creates a Slider For the how many users will be iterated
    Slider userSlider = new userSlider();
    userSlider.setShowTickLabels(true);
    userSlider.setMajorTickSpacing(true);
    userSlider.setMax(users.size(5));
    userSlider.setMin(1);

    // Parse through User Pane
    Scanner scanner = new Scanner(new File(filename), "UTF-8");
    String line = scanner.nextLine();//the first line is field headers, we do not want that.
    System.out.println(line);
    while(scanner.hasNextLine() && i < user.setvalue()){ //this i < 100 is just to help you test, so that it doesn't take too long to run each time. you should eventually move towards reading in the entire file.
      line = scanner.nextLine();
      String[] fields = line.split("\",\"");
      fields[0] = fields[0].substring(1);
      try{

        users.add(new User(fields[0]));
        User u = new Tweet();
        u.setFollowers(fields[0]);
        u.setFollowing(fields[8]);
        u.setUserProfileDescription(fields[5]);
        u.setUserLocation(fields[4]);
        u.setUrl(fields[28]);


        i++;
      }
      catch(Exception e){
        System.out.println("file error: "+ e.getClass().getCanonicalName());
            System.out.println(e.getMessage());
      }
    }
    // Return seperated through 
    return users;
  }








} 
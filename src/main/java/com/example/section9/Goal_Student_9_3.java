public class Goal_Student_9_3 {

    public Goal_Student_9_3(){

        
        GoalTest_Student_9_3.root.getChildren().addAll();
        interactions();
    }
    public void play_audio() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    Main.class.getResourceAsStream("./Note5.wav" + url));
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}).start();
        }
    
    private void interactions(){
        //Exercise 4   
        GoalTest_Student_9_3.root.setOnMouseClicked(play_audio);
        GoalTest_Student_9_3.root.setOnMouseDragged(GoalTest_Student_9_3.root.getChildren(x,y));
    }
}

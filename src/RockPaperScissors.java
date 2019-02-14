import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class RockPaperScissors extends JFrame implements ActionListener{
    private JLabel gameLabel;
    private JLabel rock;
    private JButton rockButton;
    private JLabel paper;
    private JButton paperButton;
    private JLabel scissor;
    private JButton scissorButton;
    private JLabel lizard;
    private JButton lizardButton;
    private JLabel spock;
    private JButton spockButton;
    private JLabel oppChoice;
    private JLabel yourChoice;
    private ImageIcon youWinI;
    private JLabel winLabel;
    private ImageIcon youLoseI;
    private JLabel loseLabel;
    private ImageIcon youTied;
    private JLabel tiedLabel;
    private JLabel winCount;
    private JLabel loseCount;
    private int winNum;
    private int loseNum;
    private int userinput;
    private int computerchoice;


    RockPaperScissors(){
        //Frame layout
        this.setTitle("Rock, paper, scissors, lizard, spock!");
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.pink);
        this.setSize(1400,450);

        //JImages
        youWinI = new ImageIcon(getClass().getResource("you-lose-png.png"));
        youLoseI = new ImageIcon(getClass().getResource("YouWIn!.png"));
        youTied = new ImageIcon(getClass().getResource("Draw.png"));

        //JLabels
        gameLabel = new JLabel("CHOOSE YOUR OPTION!");
        rock = new JLabel("   ROCK");
        paper = new JLabel("PAPER");
        scissor = new JLabel("SCISSORS");
        lizard = new JLabel("LIZARD");
        spock = new JLabel("SPOCK");
        oppChoice = new JLabel("         CPU choice: Nothing yet!");
        yourChoice = new JLabel("Your choice: Nothing yet!");
        winCount = new JLabel("     Number of wins: 0");
        loseCount = new JLabel("        Number of losses: 0");
        tiedLabel = new JLabel(youTied);
        tiedLabel.setVisible(false);
        winLabel = new JLabel(youWinI);
        winLabel.setVisible(false);
        loseLabel = new JLabel(youLoseI);
        loseLabel.setVisible(false);

        //JButtons
        rockButton = new JButton(new ImageIcon(getClass().getResource("Rock.png")));
        rockButton.addActionListener(this);
        paperButton = new JButton(new ImageIcon(getClass().getResource("Paper.png")));
        paperButton.addActionListener(this);
        scissorButton = new JButton(new ImageIcon(getClass().getResource("Scissors.png")));
        scissorButton.addActionListener(this);
        lizardButton = new JButton(new ImageIcon(getClass().getResource("Lizard.png")));
        lizardButton.addActionListener(this);
        spockButton = new JButton(new ImageIcon(getClass().getResource("spock.png")));
        spockButton.addActionListener(this);

        //Add it all up
        add(gameLabel);
        add(rock);
        add(rockButton);
        add(paper);
        add(paperButton);
        add(scissor);
        add(scissorButton);
        add(lizard);
        add(lizardButton);
        add(spock);
        add(spockButton);
        add(yourChoice);
        add(oppChoice);
        add(tiedLabel);
        add(winLabel);
        add(loseLabel);
        add(winCount);
        add(loseCount);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rockButton){
            userinput = 1;
            computerchoice = (int) (Math.random() * ((5 - 1) + 1) + 1);
            oppChoice.setText("         CPU choice: " + cpuChoice(computerchoice));
            yourChoice.setText("Your choice: Rock");
            int result = rockPaperScissors(userinput,computerchoice);
            setWin(result);
        }
        else if(e.getSource() == paperButton){
            userinput = 2;
            computerchoice = (int) (Math.random() * ((5 - 1) + 1) + 1);
            oppChoice.setText("         CPU choice: " + cpuChoice(computerchoice));
            yourChoice.setText("Your choice: Paper");
            int result = rockPaperScissors(userinput,computerchoice);
            setWin(result);
        }
        else if(e.getSource() == scissorButton){
            userinput = 3;
            computerchoice = (int) (Math.random() * ((5 - 1) + 1) + 1);
            oppChoice.setText("         CPU choice: " + cpuChoice(computerchoice));
            yourChoice.setText("Your choice: Scissors");
            int result = rockPaperScissors(userinput,computerchoice);
            setWin(result);
        }
        else if(e.getSource() == lizardButton){
            userinput = 4;
            computerchoice = (int) (Math.random() * ((5 - 1) + 1) + 1);
            oppChoice.setText("         CPU choice: " + cpuChoice(computerchoice));
            yourChoice.setText("Your choice: Lizard");
            int result = rockPaperScissors(userinput,computerchoice);
            setWin(result);
        }
        else if(e.getSource() == spockButton){
            userinput = 5;
            computerchoice = (int) (Math.random() * ((5 - 1) + 1) + 1);
            oppChoice.setText("         CPU choice: " + cpuChoice(computerchoice));
            yourChoice.setText("Your choice: Spock");
            int result = rockPaperScissors(userinput,computerchoice);
            setWin(result);
        }

    }

    public void setWin(int result){
        if(result == 0){
            winLabel.setVisible(false);
            loseLabel.setVisible(false);
            tiedLabel.setVisible(true);
        }
        else if(result == 1){
            tiedLabel.setVisible(false);
            loseLabel.setVisible(false);
            winLabel.setVisible(true);
            loseNum++;
            loseCount.setText("        Number of losses: " + Integer.toString(loseNum));
        }
        else if(result == 2){
            tiedLabel.setVisible(false);
            winLabel.setVisible(false);
            loseLabel.setVisible(true);
            winNum++;
            winCount.setText("     Number of wins: " + Integer.toString(winNum));
        }
    }

    public String cpuChoice(int computerchoice){
        if(computerchoice == 1){
            return "Rock";
        }
        else if(computerchoice == 2){
            return "Paper";
        }
        else if(computerchoice == 3){
            return "Scissors";
        }
        else if(computerchoice == 4){
            return "Lizard";
        }
        else{
            return "Spock";
        }
    }

    public int rockPaperScissors(int userinput, int computerchoice){
            int rock = 1;

            int paper = 2;

            int scissors = 3;

            int lizard = 4;

            int spock = 5;

                    if ((userinput == rock && computerchoice == rock) || (userinput == paper && computerchoice == paper)
                            || (userinput == scissors && computerchoice == scissors) || (userinput == lizard && computerchoice == lizard)
                            || (userinput == spock && computerchoice == spock))
                    //All the conditions for tie, basically saying if you meet one it is a tie
                    {
                        return 0;
                        // says you tied
                    } else if ((userinput == rock && computerchoice == paper) || (userinput == rock && computerchoice == spock)
                            || (userinput == paper && computerchoice == scissors) || (userinput == paper && computerchoice == lizard)
                            || (userinput == scissors && computerchoice == rock) || (userinput == scissors && computerchoice == spock)
                            || (userinput == lizard && computerchoice == rock) || (userinput == lizard && computerchoice == scissors)
                            || (userinput == spock && computerchoice == paper) || (userinput == spock && computerchoice == lizard))
                    // All of the loss conditions
                    {
                        return 1;
                        // increases the comps score by 1
                    } else if ((userinput == rock && computerchoice == scissors) || (userinput == rock && computerchoice == lizard)
                            || (userinput == paper && computerchoice == rock) || (userinput == paper && computerchoice == spock)
                            || (userinput == scissors && computerchoice == paper) || (userinput == scissors && computerchoice == lizard)
                            || (userinput == lizard && computerchoice == paper) || (userinput == lizard && computerchoice == spock)
                            || (userinput == spock && computerchoice == rock) || (userinput == spock && computerchoice == scissors)) {

                        return 2;
                    }
        return 0;
    }

    public static void main(String[] args){
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rockPaperScissors.setVisible(true);
    }

}


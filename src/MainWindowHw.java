import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindowHw extends JFrame {
    private int winWidth = 1300;
    private int winHeight = 900;
    private int winPositionX = 400;
    private int winPositionY = 300;

    private JButton btnStart;
    private JButton btnExit;
    private JButton btnClearLog;

    private JPanel panelSettingGame;
    private JPanel panelControlsElement;


    private JTextArea gameLog;
    private JScrollPane scrollPanel;

    private GameMap gameMap;



    public MainWindowHw() {
        setupWindow();
        prepareGameSettingsPanel();
        prepareButtons();
        prepareGameSettingsControl();
        prepareGameLogElement();

        gameMap = new GameMap();


        panelSettingGame.add(panelControlsElement, BorderLayout.NORTH);
        panelSettingGame.add(scrollPanel, BorderLayout.SOUTH);




        add(panelSettingGame, BorderLayout.EAST);
        add(gameMap);

        setVisible(true);
    }

    private void prepareGameSettingsControl() {
        panelControlsElement = new JPanel();
        panelControlsElement.setLayout(new GridLayout(10,1));
        panelControlsElement.add(btnStart);
        panelControlsElement.add(btnExit);
        panelControlsElement.add(btnClearLog);
    }




    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWidth, winHeight);
        setLocation(winPositionX, winPositionY);
        setTitle("Application Game");
        setResizable(false);
    }

    private void prepareGameSettingsPanel() {
        panelSettingGame = new JPanel();
        panelSettingGame.setLayout(new GridLayout(2, 1));
    }

    private void prepareButtons() {
        btnStart = new JButton("Start game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveLog("Hello game");
            }
        });
        btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});
        btnClearLog = new JButton("Clear Log");
        btnClearLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLog.setText("");
                saveLog("Log clear complete");
            }
        });
    }

    private void prepareGameLogElement() {

        gameLog = new JTextArea("Hello");
        scrollPanel = new JScrollPane(gameLog);
        gameLog.setEditable(false);
     //   gameLog.setWrapStyleWord(true);

}

void saveLog(String text){
        gameLog.append(text + "\n");
}

}


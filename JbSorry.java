import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class JbSorry extends JFrame {
    private JTextArea lyricArea;
    private JButton startButton;
    private String[] lyrics = {
        "Yeah, is it too late now to say sorry?",
        "'Cause I'm missing more than just your body",
        "OOoooo Is it too late now to say sorry?",
        "Yeah I know that I let you down Is it too late to say I'm sorry now?",
    
    };
    private int currentLine = 0;
    private Timer timer;

    public JbSorry() {
        setTitle("Coba-Coba");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lyricArea = new JTextArea();
        lyricArea.setFont(new Font("Serif", Font.PLAIN, 18));
        lyricArea.setEditable(false);
        lyricArea.setLineWrap(true);
        lyricArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(lyricArea);

        startButton = new JButton("Putar Lirik");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startLyrics();
            }
        });

        add(scrollPane, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }

    private void startLyrics() {
        startButton.setEnabled(false);
        lyricArea.setText("");
        currentLine = 0;

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (currentLine < lyrics.length) {
                    lyricArea.append(lyrics[currentLine] + "\n");
                    currentLine++;
                } else {
                    timer.cancel();
                    startButton.setEnabled(true);
                }
            }
        }, 0, 4000); // 2000 ms = 2 detik per baris
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JbSorry().setVisible(true);
        });
    }
}

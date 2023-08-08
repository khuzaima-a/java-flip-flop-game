import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.sql.*;
import java.io.*;

// echo %CLASSPATH%
// set classpath=.;./Lib/*
// .;./Lib/*
// javac FlipFlop.java
// java FlipFlop
public class FlipFlop extends javax.swing.JFrame {
    
    private JButton[] buttons;
    private int[] buttonPairs;
    private boolean[] buttonFlipped;
	private boolean[] buttonEnabled;
    private int flipnum;
    private int firstFlip;
    private static int centisecondsPassed;
    private static int centiseconds;
    private static int seconds;
    private static String minimum;
    

    public FlipFlop() {
        super("Flip Flop Game");
        
        buttons = new JButton[16];
        buttonPairs = new int[16];
        buttonFlipped = new boolean[16];
		buttonEnabled = new boolean[16];
        flipnum = 0;
        firstFlip = -1;
        centisecondsPassed = 0;
        seconds = 0;
        centiseconds = 0;
        
        initComponents();
		
		// Get the best score Display
		getBest();
		bestScore.setText("BEST : " + minimum);
        
        buttons[0] = b1;
        buttons[1] = b2;
        buttons[2] = b3;
        buttons[3] = b4;
        buttons[4] = b5;
        buttons[5] = b6;
        buttons[6] = b7;
        buttons[7] = b8;
        buttons[8] = b9;
        buttons[9] = b10;
        buttons[10] = b11;
        buttons[11] = b12;
        buttons[12] = b13;
        buttons[13] = b14;
        buttons[14] = b15;
        buttons[15] = b16;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBtn = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        timerBox = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bestScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        startBtn.setBackground(new java.awt.Color(51, 153, 0));
        startBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startBtn.setForeground(new java.awt.Color(232, 230, 230));
        startBtn.setText("Start Game");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b8.setText("?");

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flip Flop Game");

        b7.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b7.setText("?");

        b6.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b6.setText("?");
        
        b5.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b5.setText("?");
        
        b4.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b4.setText("?");
        
        b3.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b3.setText("?");
        
        b2.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b2.setText("?");
        
        b1.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b1.setText("?");
        
        b10.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b10.setText("?");
        
        b9.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b9.setText("?");
        
        b16.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b16.setText("?");
        
        b15.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b15.setText("?");
        
        b14.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b14.setText("?");
        
        b13.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b13.setText("?");
        
        b12.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b12.setText("?");
        
        b11.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        b11.setText("?");
        
        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("TIME : ");

        timerBox.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        timerBox.setForeground(new java.awt.Color(255, 255, 255));
        timerBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timerBox.setText("00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerBox, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        bestScore.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        bestScore.setForeground(new java.awt.Color(255, 255, 255));
        bestScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bestScore.setText("BEST : 00:00 ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bestScore, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bestScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        if(startBtn.getText() == "Exit Game") {
			System.exit(0);
		}
		else {
			StartGame();
		}
    }
    
    private void StartGame() {
		startBtn.setText("Exit Game");
		startBtn.setBackground(new Color(150,0,0));
        
		LoadData();
        ImplementTimer();
		
		
		// Enable all buttons
		for(int i=0;i<buttonEnabled.length;i++) {
			buttonEnabled[i] = true;
		}
        
        // Shuffle the button pairs
        for (int i = 0; i < buttonPairs.length; i++) {
            int j = (int) (Math.random() * buttonPairs.length);
            int temp = buttonPairs[i];
            buttonPairs[i] = buttonPairs[j];
            buttonPairs[j] = temp;
        }
        
        for(int i=0;i<buttons.length;i++){    
           final int buttonIndex = i;
           buttons[i].addActionListener(new java.awt.event.ActionListener() {
           @Override
           public void actionPerformed(java.awt.event.ActionEvent evt) {
//           handleButtonClick(evt);
                handleClick(buttonIndex);
                }
            });
        }
        
    }
	
	private void LoadData() {
		try{
			FileReader fr = new FileReader ("data.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			int iter = 0;
			while ((line = br.readLine()) != null && iter<=7) {
				buttonPairs[iter] = Integer.parseInt(line);
				buttonPairs[(iter++) + 8] = Integer.parseInt(line);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
    
    private void ImplementTimer() {
        int delay = 10; 
        
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                centisecondsPassed++;
                seconds = centisecondsPassed / 100;
                centiseconds = centisecondsPassed % 100;
				String timerDisplay = String.format("%02d:%02d", seconds, centiseconds);
                timerBox.setText(timerDisplay);
				
				if (timerDisplay.compareTo(minimum) > 0){
					jPanel1.setBackground(new Color(150, 0, 0));
				}
				else {
					jPanel1.setBackground(new Color(0, 150, 0));
				}
                
                if (isGameOver()) {
					if (minimum.compareTo(timerDisplay) > 0) {
						updateDB(timerDisplay);
						JOptionPane.showMessageDialog(null, "Congratulations! You set a new record!\nSeconds : " + seconds + "\nCentiSconds : " + centiseconds);
					}
					else {
						JOptionPane.showMessageDialog(null, "Better Luck Next Time!\nSeconds : " + seconds + "\nCentiSconds : " + centiseconds);
					}
                // Stop the timer
                    Timer timer = (Timer) evt.getSource();
                    timer.stop();
//					System.exit(0);
				}
            }
        };
        
        Timer timer = new Timer(delay, taskPerformer);
        timer.start();
    }
	
	private void updateDB(String timerDisplay) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try { 
			conn=DriverManager.getConnection("jdbc:ucanaccess://scores.accdb");
			String[] timerParts = timerDisplay.split(":");
			int seconds = Integer.parseInt(timerParts[0]);
			int centiseconds = Integer.parseInt(timerParts[1]);
			
			System.out.println(seconds);
			System.out.println(centiseconds);

			String updateQuery = "UPDATE Score SET TS = ?, T_CS = ? WHERE id = 1";
			stmt = conn.prepareStatement(updateQuery);

            stmt.setInt(1, seconds);
            stmt.setInt(2, centiseconds);

            int rowsUpdated = stmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
			
			stmt.close();
			conn.close();
			
		}
		catch(SQLException e) {
			System.out.println(e);
		} 
		finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}

	}
	
	private void getBest() {
		Connection conn = null;
		Statement stmt = null;
		try { 
			conn=DriverManager.getConnection("jdbc:ucanaccess://scores.accdb"); 
			stmt = conn.createStatement(); 
			
			// Connection is responsible to form connection between java and database
			// Statement is used to execute String Querries

			String sql= "SELECT TS, T_CS FROM Score";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int s =  rs.getInt("TS");
				int cs = rs.getInt("T_CS");
				minimum = "" + s + ":" + cs;
			}

			rs.close();
			stmt.close();
			conn.close();
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	
    
    private void handleClick(int i) {
		if(!buttonEnabled[i] || buttonFlipped[i] || buttonPairs[i] == -1) {
            return;
        }
        
        buttons[i].setText("" + buttonPairs[i]);
        buttonFlipped[i] = true;
        
        if(flipnum == 0) {
            firstFlip = i;
            ++flipnum;
        }
        else if(flipnum == 1) {
            if(buttonPairs[i] == buttonPairs[firstFlip]){
            }
            else{
                waitAndSee(i);
            }
            flipnum = 0;
        }
    }
    
    private void waitAndSee(int i) {
    buttons[i].setText("" + buttonPairs[i]);
    buttonFlipped[firstFlip] = true;
    buttonFlipped[i] = true;
	
	for (int j = 0; j < buttons.length; j++) {
        if (j != firstFlip && j != i) {
            buttonEnabled[j] = false;
        }
    }

    new Thread(() -> {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            buttonFlipped[firstFlip] = false;
            buttonFlipped[i] = false;
            buttons[firstFlip].setText("?");
            buttons[i].setText("?");
            firstFlip = -1;
			
			for (int j = 0; j < buttons.length; j++) {
                buttonEnabled[j] = true;
            }
        });
    }).start();
}
    
     private boolean isGameOver() {
        for (int i = 0; i < buttonFlipped.length; i++) {
            if (!buttonFlipped[i]) {
                return false;
            }
        }
        return true;
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
		
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlipFlop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlipFlop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlipFlop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlipFlop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlipFlop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel bestScore;
    private javax.swing.JButton startBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel timerBox;
}
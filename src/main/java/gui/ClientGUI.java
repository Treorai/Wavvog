package gui;

import java.io.PrintWriter;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ClientGUI extends javax.swing.JFrame {
    
    private String campoURL;
    private int campoFORMAT;
    String commandString = "youtube-dl \"ytsearch:";
    String commandFormat;
    String defaultSettings = " --restrict-filenames --abort-on-unavailable-fragment --geo-bypass --add-metadata";
    String downloadFolder = System.getProperty("user.home")+"\\Desktop";
    String downloadFolderCommand = " -o \""+downloadFolder+"\\Wavvog Downloaded\\%(title)s.%(ext)s\" ";
    
    String[] selectFormat = {
        "MPEG-3 Compressed Audio 124kbps [ .mp3 ]", // -x --audio-format mp3
        "Audio MPEG-4a 127kbps opus 44kHz [ .m4a ]", // -f 140
        "HD Video MPEG-4 720p (1280x720, 30fps) AVC 44kHz [ .mp4 ]", // -f 22
        "SD Video MPEG-4 360p (640x360, 30fps) AVC 22kHz [ .mp4 ]" // -f 18
    };
    
    public ClientGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_SEARCH = new javax.swing.JPanel();
        jTextField_URL = new javax.swing.JTextField();
        jComboBox_FORMAT = new javax.swing.JComboBox<>();
        jLabel_FORMAT = new javax.swing.JLabel();
        jLabel_URL = new javax.swing.JLabel();
        jPanel_DOWNLOAD = new javax.swing.JPanel();
        jButton_DOWNLOAD = new javax.swing.JButton();
        jProgressBar_DOWNLOAD = new javax.swing.JProgressBar();
        jLabel_SPEED = new javax.swing.JLabel();
        jLabel_ETA = new javax.swing.JLabel();
        jLabel_BANNER = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_URL.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField_URL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_URLActionPerformed(evt);
            }
        });

        jComboBox_FORMAT.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jComboBox_FORMAT.setModel(new javax.swing.DefaultComboBoxModel<>(selectFormat));
        jComboBox_FORMAT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_FORMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FORMATActionPerformed(evt);
            }
        });

        jLabel_FORMAT.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel_FORMAT.setText("Formato");

        jLabel_URL.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel_URL.setText("URL");

        javax.swing.GroupLayout jPanel_SEARCHLayout = new javax.swing.GroupLayout(jPanel_SEARCH);
        jPanel_SEARCH.setLayout(jPanel_SEARCHLayout);
        jPanel_SEARCHLayout.setHorizontalGroup(
            jPanel_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SEARCHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FORMAT)
                    .addComponent(jLabel_URL))
                .addGap(18, 18, 18)
                .addGroup(jPanel_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_URL)
                    .addComponent(jComboBox_FORMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        jPanel_SEARCHLayout.setVerticalGroup(
            jPanel_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SEARCHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_URL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_URL))
                .addGap(18, 18, 18)
                .addGroup(jPanel_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_FORMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FORMAT))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton_DOWNLOAD.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jButton_DOWNLOAD.setText("BAIXAR");
        jButton_DOWNLOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DOWNLOADActionPerformed(evt);
            }
        });

        jProgressBar_DOWNLOAD.setFont(new java.awt.Font("Comfortaa", 0, 10)); // NOI18N
        jProgressBar_DOWNLOAD.setFocusable(false);

        jLabel_SPEED.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel_SPEED.setText("  ");

        jLabel_ETA.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel_ETA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_ETA.setText("  ");

        javax.swing.GroupLayout jPanel_DOWNLOADLayout = new javax.swing.GroupLayout(jPanel_DOWNLOAD);
        jPanel_DOWNLOAD.setLayout(jPanel_DOWNLOADLayout);
        jPanel_DOWNLOADLayout.setHorizontalGroup(
            jPanel_DOWNLOADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DOWNLOADLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DOWNLOADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DOWNLOADLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_SPEED, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_ETA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel_DOWNLOADLayout.createSequentialGroup()
                        .addGroup(jPanel_DOWNLOADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jProgressBar_DOWNLOAD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                            .addComponent(jButton_DOWNLOAD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel_DOWNLOADLayout.setVerticalGroup(
            jPanel_DOWNLOADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DOWNLOADLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_DOWNLOAD)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar_DOWNLOAD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_DOWNLOADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_SPEED)
                    .addComponent(jLabel_ETA))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Friz Quadrata", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blueLogo.png"))); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_SEARCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_DOWNLOAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_BANNER))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_BANNER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_DOWNLOAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_URLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_URLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_URLActionPerformed

    private void jComboBox_FORMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FORMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_FORMATActionPerformed

    private void jButton_DOWNLOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DOWNLOADActionPerformed
        jProgressBar_DOWNLOAD.setStringPainted(true);
        jProgressBar_DOWNLOAD.setValue(0);
        jButton_DOWNLOAD.setEnabled(false);
        jButton_DOWNLOAD.setText("BAIXANDO");
        jLabel_SPEED.setText("Por favor, aguarde...");
        
        //build final command
        this.campoURL = this.jTextField_URL.getText();
        this.campoFORMAT = this.jComboBox_FORMAT.getSelectedIndex();
        switch (campoFORMAT) {
            case 0 -> commandFormat = " -x --audio-format mp3"; //mp3
            case 1 -> commandFormat = " -f 140/bestaudio"; //m4a
            case 2 -> commandFormat = " -f 22/mp4/best"; //mp4
            case 3 -> commandFormat = " -f 18/mp4/best"; //mp4
            default -> throw new UnsupportedOperationException("Not supported yet.");
        }
        String finalCommand = commandString+campoURL+"\""+commandFormat+defaultSettings+downloadFolderCommand;
        
        //start download
        startDownload(finalCommand);
    }//GEN-LAST:event_jButton_DOWNLOADActionPerformed

   
    public static void main() {
        //START OF THEME SETTINGS
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 199 );
        UIManager.put( "Component.arc", 199 );
        UIManager.put( "ProgressBar.arc", 199 );
        UIManager.put( "TextComponent.arc", 199 );
        UIManager.put( "Component.arrowType", "chevron" );
        UIManager.put( "Component.focusWidth", 0 );
        UIManager.put( "Component.innerFocusWidth", 0 );
        UIManager.put( "Button.innerFocusWidth", 0 );
        //END OF THEME SETTINGS
        
        java.awt.EventQueue.invokeLater(() -> {
            new ClientGUI().setVisible(true);
        });
    }
    
    private void startDownload(String finalCommand){
        String[] command = {"cmd"};
        final Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            
            Runnable threadDownload = () -> {
                try{
                    final byte[] buffer = new byte[1024];
                    for (int length; (length = p.getInputStream().read(buffer)) != -1; ){
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        stream.write(buffer, 0, length);
                        
                        //Output formatting
                        String str = stream.toString();
                        System.out.println(str);
                        String[] splitString = str.split("\s+");
                        
                        if(str.contains("Downloading 0 videos")){
                            jLabel_SPEED.setText("Vídeo não econtrando");
                        }
                        
                        //Format progress bar
                        try{
                            if(splitString[1].endsWith("%") ){
                                String[] currentProgress = splitString[1].split("\\.");
                                jProgressBar_DOWNLOAD.setValue(Integer.parseInt(currentProgress[0]));
                            }
                        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
                            jProgressBar_DOWNLOAD.setValue(100);
                        }
                        
                        //Format DownSpeed
                        try{
                            if(splitString[5].endsWith("KiB/s") ){
                                jLabel_SPEED.setText(splitString[5]);
                            }
                        }catch(ArrayIndexOutOfBoundsException e){}
                        
                        //Format ETA
                        try{
                            if(splitString[6].endsWith("ETA") ){
                                jLabel_ETA.setText(splitString[7]);
                            }
                        }catch(ArrayIndexOutOfBoundsException e){}
                        
                    }
                }catch(IOException e){}
                
                jProgressBar_DOWNLOAD.setStringPainted(false);
                jButton_DOWNLOAD.setText("BAIXAR");
                jButton_DOWNLOAD.setEnabled(true);
                if(!jLabel_SPEED.getText().equals("Vídeo não econtrando")){
                jLabel_SPEED.setText("Pronto!");
                }
                //end of run
            };
            
            new Thread(threadDownload).start();
                
            try (PrintWriter stdin = new PrintWriter(p.getOutputStream())) {
                stdin.println(finalCommand);
                p.getErrorStream();
                stdin.close();
            }
            
        }catch (IOException e) {}
    }
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DOWNLOAD;
    private javax.swing.JComboBox<String> jComboBox_FORMAT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_BANNER;
    private javax.swing.JLabel jLabel_ETA;
    private javax.swing.JLabel jLabel_FORMAT;
    private javax.swing.JLabel jLabel_SPEED;
    private javax.swing.JLabel jLabel_URL;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_DOWNLOAD;
    private javax.swing.JPanel jPanel_SEARCH;
    private javax.swing.JProgressBar jProgressBar_DOWNLOAD;
    private javax.swing.JTextField jTextField_URL;
    // End of variables declaration//GEN-END:variables
}

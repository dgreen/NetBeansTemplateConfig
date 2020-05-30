/* 
 * File: Main.java
 * Authors: Dylan Dalton <dbdalton@uab.edu>
 *          Schauber Gbalou <schauber@uab.edu>
 *          Matthew Manuel <mmanuel@uab.edu>
 *          Joey Richardson <Rich0925@uab.edu>
 *          Darrin Wang <darrinw@uab.edu>
 *
 * Later Author:  David Green <DGreen@uab.edu>
 *
 * Assignment: Group GUI - EE333 Fall 2017
 * Vers: 1.6.1 05/29/2020 dgg - Change back to NetBeans
 * Vers: 1.6.0 12/05/2019 dgg - CoolBeans renamed to OpenBeans
 * Vers: 1.5.0 01/18/2019 dgg - Add templates for JUnit 4 & 5, TestNG
 * Vers: 1.4.2 01/09/2019 dgg - Windows path was incorrect (at least on some machines)
 *                              Logic for deducing proper "latest" version fixed
 *                              Change support to CoolBeans (spefically 2018.12)
 * Vers: 1.3.0 08/11/2018 dgg - Add javafx templates also.  Note that NB 9
 *                              does not support modifying GUI in it now due
 *                              change in NB9 licensing not allowing GPL and
 *                              no support for post install.  This will probably
 *                              mean a conversion to JavaFX.
 * Vers: 1.2.0 01/23/2018 dgg - remove angle brackets around e-mail as the
 *                              JavaDoc tool thinks this is a tag
 *                            - earlier: fixed reading from JAR File
 * Vers: 1.1.0 12/12/2017 - final code cleanup and build
 * Vers: 1.0.2 12/07/2017 - added mac os support + initial build
 * Vers: 1.0.1 12/06/2017 - added search pathing for windows 
 * Vers: 1.0.0 12/05/2017 - initial coding
 *
 * Credits: multiple questions on StackOverflow inspired different sections of 
 *              code
 */

package bin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Class to model the main window of the Template initializer for NetBeans in 
 * the EE333 course at UAB
 * 
 * @author Dylan Dalton (dbdalton@uab.edu)
 * @author Schauber Gbalou (schauber@uab.edu)
 * @author Matthew Manuel (mmanuel@uab.edu)
 * @author Joey Richardson (Rich0925@uab.edu)
 * @author Darrin Wang (darrinw@uab.edu)
 * @author David Greeen (DGreen@uab.edu)
 */
public class Main extends javax.swing.JFrame {

    private String name;
    private String initials;
    private String blazerID;
    private String semester;
    
    /**
     * Creates new form Main (constructor for GUI class)
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        CourseSelectButtonGroup = new javax.swing.ButtonGroup();
        EE233RadioButton = new javax.swing.JRadioButton();
        EE333RadioButton = new javax.swing.JRadioButton();
        NameTextField = new javax.swing.JTextField();
        BlazerIdTextField = new javax.swing.JTextField();
        InitialsTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        BlazerIdLabel = new javax.swing.JLabel();
        InitialsLabels = new javax.swing.JLabel();
        genTemplatesButton = new javax.swing.JButton();
        CourseLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        FooterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NetBeans Template Editor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        CourseSelectButtonGroup.add(EE233RadioButton);
        EE233RadioButton.setText("EE233");
        EE233RadioButton.setEnabled(false);

        CourseSelectButtonGroup.add(EE333RadioButton);
        EE333RadioButton.setText("EE333");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, EE333RadioButton, org.jdesktop.beansbinding.ELProperty.create("${selected}"), EE333RadioButton, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        NameLabel.setText("Name:");

        BlazerIdLabel.setText("BlazerID:");

        InitialsLabels.setText("Initials: ");

        genTemplatesButton.setText("Generate Templates");
        genTemplatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genTemplatesButtonActionPerformed(evt);
            }
        });

        CourseLabel.setText("Course: ");

        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Please fill in all fields then click the button below");
        TitleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FooterLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        FooterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FooterLabel.setText("Copyright 2017 by Dylan Dalton, Schauber Gbalou, Matthew Manuel, Joey Richardson, Darrin Wang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(InitialsLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                            .addComponent(BlazerIdTextField)
                                            .addComponent(InitialsTextField)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(genTemplatesButton))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BlazerIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                            .addComponent(CourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(51, 51, 51)
                                        .addComponent(EE233RadioButton)
                                        .addGap(41, 41, 41)
                                        .addComponent(EE333RadioButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(FooterLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EE333RadioButton)
                    .addComponent(EE233RadioButton)
                    .addComponent(CourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlazerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlazerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InitialsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InitialsLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(genTemplatesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(FooterLabel)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Button click checks to ensure all required fields are filled in, then 
     * generates the necessary templates for the EE333 course and places them 
     * in the specific location that NetBeans references on creation of new 
     * class files
     * 
     * @param evt click of "generate templates" button 
     */
    private void genTemplatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genTemplatesButtonActionPerformed
        this.name = NameTextField.getText();
        this.blazerID = BlazerIdTextField.getText();
        this.initials = InitialsTextField.getText();
        
        // Set the semester variable based on current time
        if (LocalDateTime.now().getMonth().getValue() >= 8){
            semester = "Fall " + LocalDateTime.now().getYear();
            
        }else if (LocalDateTime.now().getMonth().getValue() <= 4){
            semester = "Spring " + LocalDateTime.now().getYear();
            
        }else {
            semester = "Summer " + LocalDateTime.now().getYear();
        }
        
        // If none of the fields are empty
        if ((! name.equals("")) && (! blazerID.equals("")) && (! initials.equals(""))){
            // Determine which os is being used..
            String os = System.getProperty("os.name");
            if (os.startsWith("Windows")){
                
                try {
                    // Get the "Appdata" environmental variable 
                    String dir = System.getenv("AppData");
                    
                    // Get path variable of Appdata/Roaming/NetBeans
                    Path dirFlat    = Paths.get(dir, "NetBeans");
                    Path dirRoaming = Paths.get(dir, "NetBeans", "Roaming");
                    
                    File dirFlatFile     = dirFlat.toFile();
                    File dirRoamingFile  = dirRoaming.toFile();
                    
                    Path direc = null;
                    
                    // Pick the right path based on testing for the NetBeans dir                    
                    if        ( dirFlatFile.exists() )    {
                        direc = dirFlat;
                    } else if ( dirRoamingFile.exists() ) {
                        direc = dirRoaming;
                    } else                                {
                        throw new Exception("NetBeans dir is not in AppData nor in AppData\\Roaming");
                    }
                    
                    // Get a stream of paths in the direc Path variable
                    // Filter to only include directories
                    Stream<Path> paths = Files.list(direc).filter(Files::isDirectory);
                    
                    // Get max folder by natural order (most recent version)
                    // Resolve to the templates folder
                    Path tempPath = paths.max(Comparator.comparingDouble(p -> Double.valueOf(p.getFileName().toString())))
                                         .get()
                                         .resolve("config").resolve("Templates");
                    
                    // get new files and put them in the tempPath
                    genPropertiesFile(tempPath);
                    genAllTemplates(tempPath);
                    
                    // close the program
                    System.exit(0);
                    
                } catch (Exception e) {
                    System.out.println("Error finding template folder: " + e);
                }              
            } else if (os.startsWith("Mac")){
                
                try {
                    // Get the "HOME" environmental variable path
                    // navigate to the Netbeans folder inside
                    String dir = System.getenv("HOME");
                    Path direc = Paths.get(dir, "Library", 
                            "Application Support", 
                            "NetBeans");
                                
                    // Get a stream of paths in the direc path variable
                    // filter to only include directories
                    Stream<Path> paths = Files.list(direc).filter(Files::isDirectory);
                    
                    // get max folder by treating file names as doubles
                    // resolve to the templates folder
                    Path tempPath = paths.max(Comparator.comparingDouble(p -> Double.valueOf(p.getFileName().toString())))
                            .get()
                            .resolve("config").resolve("Templates");
                    
                    // get new files and put them in the tempPath
                    genPropertiesFile(tempPath);
                    genAllTemplates(tempPath);
                    
                    // close the program
                    System.exit(0);
                    
                } catch (Exception e) {
                    System.out.println("Error finding template folder: " + e);
                    e.printStackTrace();
                    System.exit(1);
                }
                
            } else {
                System.out.println("unsupported opperating system");
                //maybe add Linux support eventually..
            }

        }else if (name.equals("") || blazerID.equals("") || initials.equals("")){
            // this window stays to signify an error..
            NotFilledInError obj2 = new NotFilledInError();
            obj2.setVisible(true);
        }
        
    }//GEN-LAST:event_genTemplatesButtonActionPerformed

    /**
     * Main function to initialize variables and setup GUI
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main m = new Main();
                m.EE333RadioButton.setSelected(true);
                m.setVisible(true);
            }
        });
    }
    
    /**
     * Function to create the user.properties folder and file based on the 
     * information typed into the initial window
     * 
     * @param p path to save the file to
     */
    private void genPropertiesFile(Path propsDir){
        
        // create the strings to be added into the user.properties file
        List<String> props = Arrays.asList(
                "user = " + name + " " + blazerID + "@uab.edu",
                "initials = " + initials, 
                "course = EE333 " + semester);
        
        // make the propertiesDirectory editable
        propsDir.toFile().setWritable(true);
        
        try {
            // make the properties folder
            propsDir = Files.createDirectories(propsDir.resolve("Properties"));
            propsDir = Paths.get(propsDir.toString(), "User.properties");
            
            // create the user.properties file with the necessary strings
            Files.write(propsDir, props, Charset.forName("UTF-8"));
            
        } catch (IOException x) {
            System.err.println("Error creating templates: " + x);
        }
    }
    
    /**
     * Function to generate templates for various folders
     * 
     * @param saveDir path to save files to
     */
    private void genAllTemplates(Path saveDir){
        
        // Basic Classes
        List<String> templateTypes = new ArrayList<>();
        templateTypes.addAll(Arrays.asList( "AnnotationType",
                                            "Applet",
                                            "Class",
                                            "Enum",
                                            "Exception",
                                            "Interface",
                                            "JApplet",
                                            "Main",
                                            "package-info",
                                            "Singleton"));
        
        Path cSaveDir = saveDir.resolve("");        // copy
        genTemplates(cSaveDir, "Classes", templateTypes);
        
        // JavaFx Classes
        templateTypes = new ArrayList<>();
        templateTypes.addAll(Arrays.asList( "FXMain",
                                            "FXML",
                                            "FXPreloader",
                                            "FXSwingMain"));
        Path fxSaveDir = saveDir.resolve("");       // copy
        genTemplates(fxSaveDir, "javafx", templateTypes);
        
        // Basic Unit Tests
        templateTypes = new ArrayList<>();
        templateTypes.addAll(Arrays.asList( "EmptyTestNGTest",
                                            "JUnit4TestClass",
                                            "JUnit5TestClass"));
        Path utSaveDir = saveDir.resolve("");       // copy
        genTemplates(utSaveDir, "UnitTests", templateTypes);
        
    }
    
    
    /**
     * Function to generate the templates and place them in their specified 
     * folder
     * 
     * @param saveDir path to save files to
     */
    private void genTemplates(Path saveDir, String folder, List<String> templateTypes){
        
        // update the saveDirectory to the "classes" folder 
        // make the saveDirectory able to be edited
        saveDir = saveDir.resolve(folder);
        saveDir.toFile().setWritable(true);
        
        try {            
            // Create the folder directory for templates
            Files.createDirectories(saveDir);
            
            // Loop through the different templatestypes, copying each to the 
            // saveDirectory in a .java form
            for (String templateType : templateTypes) {
                InputStream in = getClass().getResourceAsStream("/resources/" + templateType + ".txt");
                // System.out.println("Looking for " + templateType + " got " + in);
                Files.copy(
                    in,
                    saveDir.resolve(templateType + ".java"),
                    StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            System.out.println("Template copy error: " + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlazerIdLabel;
    private javax.swing.JTextField BlazerIdTextField;
    private javax.swing.JLabel CourseLabel;
    private javax.swing.ButtonGroup CourseSelectButtonGroup;
    private javax.swing.JRadioButton EE233RadioButton;
    private javax.swing.JRadioButton EE333RadioButton;
    private javax.swing.JLabel FooterLabel;
    private javax.swing.JLabel InitialsLabels;
    private javax.swing.JTextField InitialsTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton genTemplatesButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
